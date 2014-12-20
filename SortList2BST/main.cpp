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
/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode *sortedListToBST(ListNode *head) {
        if (head == NULL)
            return NULL;
        ListNode *listnode = head;
        TreeNode *root = new TreeNode(head.val);
        //TreeNode *treenode = root;
        //treenode->val = head->val;
        while (listnode){
            insertInto(root, listnode);
            listnode = listnode->next;
        }
        return root;
    }

    void insertInto(TreeNode *root, ListNode *listnode){
        if (root == NULL){
            root = new TreeNode(listnode->val);
            root->left = root->right = NULL;
        }
        if (listnode->val < root->val)
            insertInto(root->left, listnode);
        else
            insertInto(root->right, listnode);
    }
};


int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
