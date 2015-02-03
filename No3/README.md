keep a hashmap which stores the characters in string as keys and their positions as values, and keep two pointers which defines the max substring. move the right pointer to scan through the string , and meanwhile **update** the hashmap. If the character is already in the hashmap, then move(不能说move 可以认为是往回找) the left pointer to the left of the same character **last found**. Note that the two pointers can only **move forward**.

关于`j = Math.max(j, map.get(s.charAt(i))+1)`:

map.get(s.charAt(i))+1 : 从这个index开始到i 就是没有重复的子串了

跟以前的j比较取大的 

如果不取最大的j 比如case "abba" 遇到第二个b时

j = 1, put(b, 2), max = max(2, i-j+1) = 2

then i = 3 j = 1, put(a, 3), max = (2, i-j+1) = 3

显然是WA

所以可以看出`j = Math.max(j, map.get(s.charAt(i))+1)`作用是确保j的值代表当前左指针指向的char一定是最后

一个存在重复的char的下一个char， 这样i-j+1算出来的才是这段无重复子串的长度