#include <iostream>

using namespace std;


/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *mergeTwoLists(ListNode *l1, ListNode *l2) {
        if (l1 && l2){
            ListNode *start = NULL;
            if (l1->val < l2->val){
                start = l1;
                l1 = l1->next;
            }
            else{
                start = l2;
                l2 = l2->next;
            }
            ListNode *current = start;
            while (l1 && l2){
                if (l1->val > l2->val){
                    current->next = l2;
                    l2 = l2->next;
                }
                else{
                    current->next = l1;
                    l1 = l1->next;
                }
                current = current->next;
            }
            if (l1)
                current->next = l1;
            else
                current->next = l2;
            return start;
        }
        else if (l1){
            return l1;
        }
        else
            return l2;
    }
};


int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
