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
    ListNode *detectCycle(ListNode *head) {
        if(head == NULL)
            return NULL;

        ListNode *slow = head, *fast = head;
        int sStep = 0, fStep = 0;
        while((fast !=NULL) && (fast->next != NULL)){

            slow = slow->next;

            fast = fast->next->next;
            sStep ++;
            fStep += 2;
            if (fast == slow)
                break;

        }
        if(fast == NULL || fast->next == NULL)
            return NULL;
        int cycleSize = fStep - sStep;
        slow = fast = head;
        for(int i = 0; i < cycleSize; i++)
            fast = fast->next;
        while (slow != fast){
            slow = slow->next;
            fast = fast->next;
        }
        return slow;
    }
};

int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
