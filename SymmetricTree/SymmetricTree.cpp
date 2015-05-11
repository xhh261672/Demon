#include <iostream>
#include <fstream>
using namespace std;

struct TreeNode{
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x): val(x), left(NULL), right(NULL){}
};

TreeNode **t;

void getSymmmetric(TreeNode *root){
	if (root->left == NULL && root->right == NULL) 
		return ;
	TreeNode *temp = root->right;
	root->right = root->left;
	root->left = temp;

	getSymmmetric(root->left);
	getSymmmetric(root->right);
}

void build (TreeNode *root, int val, char flag, int l, int r){
	//cout<<l<<" "<<r<<endl;
	root->val = val;
	if (flag == 'l'){
		root->left = t[l-1];
	}
	else if (flag == 'r'){
		root->right = t[r-1];
	}else if (flag == 'd'){
		root->left = t[l-1];
		root->right = t[r-1];
	}
	//cout<<root->val<<endl;
}

void preOrderPrint(TreeNode *root){
	if (root == NULL)
		return;
	cout<<root->val<<" ";
	preOrderPrint(root->left);
	preOrderPrint(root->right);
}

int main(){
	int n = 0;
	int *a;
	freopen ("in.txt", "r", stdin);
	freopen ("out.txt", "w", stdout);
	while (cin >> n){
		if (n < 0)
			continue;
		if (n == 0){
			cout<<"NULL"<<endl;
			continue;
		}
		a = new int[n];
		for (int i = 0; i < n; i++)
			cin>>a[i];
		
		char flag;
		int l = 0, r = 0;
		t = new TreeNode*[n];

		for (int i = 0; i < n; i++)
			t[i] = new TreeNode(0);

		for (int i = 0; i < n; i++){
			cin>>flag;
			if (flag == 'd')
				cin>>l>>r;
			if (flag == 'l')
				cin>>l;
			if (flag == 'r')
				cin>>r;
			//t[i] = new TreeNode(0);
			build (t[i], a[i], flag, l, r);
		}

		getSymmmetric(t[0]);
		preOrderPrint(t[0]);
		cout<<endl;
	}
	return 0;
}