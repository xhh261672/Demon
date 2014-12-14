# detect cycle in linked list

## key points

- 环的周长怎么求？两指针相遇时的步长之差
- 怎么才能在环的起点A处第一次相遇？
    1. 设fast在环上点X处，那么SA = XA， =>SX = SA+AX = XA+AX = 周长
    2. 设fast在A前X处，那么SA = XA + 周长 => SX = SA - XA = 周长
    就这样