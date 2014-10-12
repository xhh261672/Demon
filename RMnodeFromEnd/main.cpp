#include <iostream>
#include <cstdlib>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode *removeNthFromEnd(ListNode *head, int n) {
//        ListNode *curr = head;
//        int length = 0;
//        while(curr){
//            curr = curr->next;
//            length ++;
//        }
//        //cout<<length<<endl;
//        if(length == n)
//            return head->next;
//        int i = 0;
//        curr = head;
//        while ((length - i )!= (n + 1) ){
//            curr = curr->next;
//            i++;
//        }
//        curr->next = curr->next->next;
        if(head == NULL)
            return NULL;
        ListNode *witHead = (ListNode *)malloc(sizeof(ListNode));
        witHead->val = -1;
        witHead->next = head;
        ListNode *former = witHead, *latter = witHead;
        while(n&&latter->next){//find the node at end of list
            latter = latter->next;
            n--;
        }

        while(latter->next){
            latter = latter->next;
            former = former->next;
        }
        ListNode *target = former->next;
        former->next = target->next;
        free(target);
        return witHead->next;
    }
};

int main()
{
    int i = 1;
    struct ListNode *head = (ListNode *)malloc(sizeof(ListNode));
    head->val = i;
    struct ListNode *curr = head;
    while (i < 1){
        i++;
        curr->next = (ListNode *)malloc(sizeof(ListNode));
        curr->next->val = i;
        curr = curr->next;
    }
    curr->next=NULL;
    curr = head;
    while(curr){
        cout<<curr->val<<" ";
        curr = curr->next;
    }
    cout<<endl;
    Solution solution;
    head = solution.removeNthFromEnd(head, 1);
    curr = head;
    while(curr){
        cout<<curr->val<<" ";
        curr = curr->next;
    }
    return 0;
}
