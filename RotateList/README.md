本题几个坑：

1 n可能大于链表长度 这样你就不能按常规的去找倒数第n个节点的方法去做了 看了Discuss
  知道去找倒数第`n%length`个node 真是搞不懂 完全不明其意

2 知道了要做rotate的node 别急着搞 如果这是最后一个节点了 没必要再搞了 说明length-n%length = length
  也就是n == length 从第一个node rotate 就和不rotate一样