#include <iostream>
using namespace std;

  struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
  };

class Solution {
public:
    ListNode *swapPairs(ListNode *head) {
        if (head == NULL || head->next == NULL)
            return head;

        ListNode *pre = head, *nextPre = head;
        //nextPre 用来指向下一对交换完成后的前者
        head = head->next;
        while (pre){
            if (pre->next)
            {
                  ListNode *post = pre->next;
                  nextPre->next = post;
                  pre->next = pre->next->next;
                  post->next = pre;

                  nextPre = pre;
                  pre = pre->next;
            }
            else
                break;

        }
        return head;
    }
};

int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
