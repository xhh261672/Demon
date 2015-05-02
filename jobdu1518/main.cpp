#include <iostream>

using namespace std;

  struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
  };

int main()
{
    int n = 0;
    while (cin >> n){
        if (n <= 0 || n > 1000){
            cout<<"NULL"<<endl;
            continue;
        }
        ListNode *head = new ListNode(0);
        ListNode *cur = head;
        int v = 0;
        for (int i = 0; i < n; i++){
            cin>>v;
            cur->next = new ListNode(v);
            cur = cur->next;
        }
        if (n == 1){
            cout<<head->next->val<<endl;
            continue;
        }
        cur = head->next;
        ListNode *ne = cur->next;
        cur->next = NULL;
        while (ne->next != NULL){
            ListNode *temp = ne->next;
            ne->next = cur;
            cur = ne;
            ne = temp;
        }
        ne->next = cur;
        head->next = ne;
        head = head->next;
        while (head){
            if (head->next == NULL){
                    cout<<head->val<<endl;
            }
            else
                cout<<head->val<<" ";
            head = head->next;
        }
    }
    return 0;
}
