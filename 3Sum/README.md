
    if (sum < 0){
        j++;
        while (j < k && num[j] == num[j-1]) j++;
    }
    else{
        k--;
	    while (j < k && num[k] == num[k+1]) k--;
    }

    sum < 0, 就说明num[j]过小 那就找更大的num[j] 在此过程中忽略相同的数字
    sum > 0 同理

    为什么要这样？这样就不用再去查找重复的结果list了 因为i是一直向前 不重复推进的 j, k都是
    所以不会出现相同的两个triplets