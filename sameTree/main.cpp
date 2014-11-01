#include <iostream>

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
    bool isSameTree(TreeNode *p, TreeNode *q) {
        if(!p && !q)
            return true;

        int pvalue, qvalue;
        bool psame, qsame;
        if(p && q){
            pvalue = p->val;
            qvalue = q->val;
            if(pvalue == qvalue){
                psame = isSameTree(p->left, q->left);
                qsame = isSameTree(p->right, q->right);
                if(psame && qsame)
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }
};
int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
