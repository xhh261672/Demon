#include <iostream>
#include <stack>
#include <vector>
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
    vector<int> preorderTraversal(TreeNode *root) {
        vector<int> result;
        stack <TreeNode *> temp;
        TreeNode *current = root;
        while(1){
            while(current){
                result.push_back(current->val);
                temp.push(current);
                current = current->left;
            }
            if(!temp.empty()){
                current = temp.top();
                temp.pop();
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
