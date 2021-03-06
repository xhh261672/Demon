#include <iostream>
#include <stack>
using namespace std;

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
    int maxDepth(TreeNode *root) {
        if(root == NULL)
            return 0;
        else{
            int ldepth = maxDepth(root->left);
            int rdepth = maxDepth(root->right);
            if(ldepth >= rdepth)
                return ldepth + 1;
            else
                return rdepth + 1;
        }
    }
};

int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
