#include <iostream>
#include <vector>
#include <queue>
using namespace std;

/**
 * Definition for binary tree with next pointer.
 * struct TreeLinkNode {
 *  int val;
 *  TreeLinkNode *left, *right, *next;
 *  TreeLinkNode(int x) : val(x), left(NULL), right(NULL), next(NULL) {}
 * };
 */
class Solution {
public:
    void connect(TreeLinkNode *root) {
        queue <TreeLinkNode *> qNode;
        vector <TreeLinkNode *> nodeList;

        TreeLinkNode *current = root;
        while(current)
        {
            nodeList.push_back(current);
            if(current->left)
                qNode.push(current->left);
            if(current->right)
                qNode.push(current->right);

            if(qNode.empty())
                current = NULL;
            else{
                current = qNode.front();
                qNode.pop();
            }

        }
        int step = 1,i = 0, j = 0;
        for( i = 0; i < nodeList.size();){
            //if (i <= n){
                for ( j = i; j < i+step-1; j++){
                    nodeList[j]->next = (nodeList[j+1]);
                }
                nodeList[j]->next = NULL;
            //}
            i += step;
            step *= 2;
        }
    }
};
/****************standard solution********************/

void connect(TreeLinkNode *root) {
    if (root == NULL) return;
    TreeLinkNode *pre = root;
    TreeLinkNode *cur = NULL;
    while(pre->left) {
        cur = pre;
        while(cur) {
            cur->left->next = cur->right;
            if(cur->next) cur->right->next = cur->next->left;
            cur = cur->next;
        }
        pre = pre->left;
    }
}
