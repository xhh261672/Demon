#include <iostream>

 struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    bool hasCycle(ListNode *head) {
//        ListNode *iter = head->next;
//        while( iter != head){
//            if(iter == NULL)
//                return false;
//            else{
//                iter = iter->next;
//                continue;
//            }
//        }
//        return true;
        if(head == NULL)
            return false;
        ListNode *slow = head, *fast = head;
        while(slow->next && fast->next){
            if(fast->next->next == NULL)
                break;
            else{
                slow = slow->next;
                fast = fast->next->next;
                if(fast == slow)
                    return true;
            }
        }
        return false;
    }
};
using namespace std;

int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
