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
    vector<int> postorderTraversal(TreeNode *root) {
        TreeNode *current = root;
        vector<int> result;
        stack<TreeNode *> temp;
        stack<bool> toRC;
        while(1){
            while(current){
                temp.push(current);
                toRC.push(false);
                current = current->left;
            }
            if(!temp.empty()){
                current = temp.top();
                temp.pop();
                bool isToRC = toRC.top();
                if(isToRC == false){
                    toRC.pop();
                    toRC.push(true);
                    temp.push(current);
                    current = current->right;
                }
                else{
                    toRC.pop();
                    result.push_back(current->val);
                    current = NULL;
                }
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
