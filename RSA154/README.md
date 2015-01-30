l++ 改之前 WA：

    [1, 3, 3]
    l  r
    0  2
    1  2
    2  2
    return 3

改成r -- ：
    l  r
    0  2
    0  1
    0  0
    return 0

    [1,1,1,0,1,1]
    l   r
    0   5
    0   4
    0   3
    2   3
    3   3
    return A[3] == 0

