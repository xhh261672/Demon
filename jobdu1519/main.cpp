#include <iostream>

using namespace std;

struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
  };

void print(ListNode *head){
    while (head->next){
        cout<<head->val<<" ";
        head = head->next;
    }
    cout<<head->val<<endl;
}

int main()
{
    int m = 0, n = 0;
    while (cin >> n >> m){
        if (m == 0 && n == 0){
            cout<<"NULL"<<endl;
            continue;
        }
        ListNode *h1 = new ListNode(0);
        ListNode *h2 = new ListNode(0);
        ListNode *cur = h1;
        int v = 0;
        for (int i = 0; i < n; i++){
            cin>>v;
            cur->next = new ListNode(v);
            cur = cur->next;
        }
        cur = h2;
        for (int i = 0; i < m; i++){
            cin>>v;
            cur->next = new ListNode(v);
            cur = cur->next;
        }
        if (n == 0) {print(h2->next);continue;}
        if (m == 0) {print(h1->next);continue;}

        cur = h1->next;
        ListNode *cur2 = h2->next;

        while (cur && cur2){
            if (cur->val <= cur2->val){
                ListNode *temp = cur->next;
                cur->next = cur2;
                cur = temp;
            }else{
                ListNode *temp = cur2->next;
                cur2->next = cur;
                cur2 = temp;
            }
        }
        if (h1->next->val <= h2->next->val) print(h1->next);
        else print(h2->next);
    }
    return 0;
}


