#include <iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
  };


struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 };

class Solution {
public:
    ListNode *listnode;
    TreeNode *sortedListToBST(ListNode *head) {
        this->listnode = head;
        int len = 0;
        ListNode *node = head;
        while (node){
            len ++;
            node = node->next;
        }
        return insertInto(len);
    }

    TreeNode *insertInto(int n){
        if (n == 0){
            return NULL;
        }
        TreeNode *temproot = new TreeNode(0);
        temproot->left = insertInto(n/2);

        temproot->val = listnode->val;
        listnode = listnode->next;

        temproot->right = insertInto(n-n/2 - 1);

        return temproot;
    }
};


int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
