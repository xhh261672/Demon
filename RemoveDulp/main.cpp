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
    ListNode *deleteDuplicates(ListNode *head) {
        if(head == NULL)
            return NULL;
        ListNode *prev = head;
        while (prev->next){
            ListNode *current = prev->next;
            while (current){
                if(current->val == prev->val)
                {
                    ListNode *temp = current;
                    current = current->next;
                    free(temp);
                }
                else
                 break;
            }
            if(current)
            {
                prev->next = current;
                prev = prev->next;
            }
            else
            {
                prev->next = NULL;
            }
        }
        return head;
    }
};
//no 2 loop solution
class Solution {
public:
    ListNode *deleteDuplicates(ListNode *head) {
        if (head == NULL)
            return NULL;
        ListNode* cur = head;
        while (cur->next) {
            if(cur->val == cur->next->val)
                cur->next = cur->next->next;
            else
                cur = cur->next;
        }
        return head;
    }
};


int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
