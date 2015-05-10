#include <iostream>
using namespace std;

struct TreeNode{
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x): val(x), left(NULL), right(NULL){}
};

void getSymmmetric(TreeNode *root){
	if (root->left == NULL && root->right == NULL) return ;
	TreeNode *temp = root->right;
	root->right = root->left;
	root->left = temp;

	getSymmmetric(root->left);
	getSymmmetric(root->right);
}

int main(){

}