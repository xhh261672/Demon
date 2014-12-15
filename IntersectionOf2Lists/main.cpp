#include <iostream>
//#include <cmath>
using namespace std;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution1 {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == NULL || headB == NULL)
            return NULL;

        int la = 0, lb = 0;
        ListNode *curA = headA, *curB = headB;
        while(curA){
            curA = curA->next;
            la ++ ;
        }
        while (curB){
            curB = curB->next;
            lb ++ ;
        }
        int diff = la - lb;
        if (diff == 0){
            curA = headA;
            curB = headB;
        }

        if (diff > 0){
            curA = headA;
            curB = headB;
            while (diff > 0){
                curA = curA->next;
                diff -- ;
            }
        }

        if (diff < 0){
            curA = headA;
            curB = headB;
            while (diff < 0){
                curB = curB->next;
                diff ++ ;
            }
        }
        while (curA && curB){
            if (curA == curB)
                return curA;
            curA = curA->next;
            curB = curB->next;
        }
        return NULL;
    }
};

class Solution2 {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == NULL || headB == NULL)
            return NULL;
        ListNode *curA = headA, *curB = headB;
        while (curA && curB && curA != curB){ // curA != curB 对应只有一个元素的case

            curA = curA->next;
            curB = curB->next;

            if(curA == curB)
                return curA;

            if (curA == NULL) curA = headB;
            if (curB == NULL) curB = headA;

        }
        return curA;
    }
};
int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
