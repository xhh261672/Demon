#include <iostream>
#include <vector>
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
    vector<int> inorderTraversal(TreeNode *root) {
        TreeNode *current = root;
        stack<TreeNode> temp;
        vector<int> result;
        while(1){
            while(current){
                temp.push(current);
                current = current->left;
            }

            if(!temp.empty()){
                current = temp.pop();
                result.push_back(current->val);
                current = current->right;
            }
            else
                break;
        }
        return result;

    }
};

int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
