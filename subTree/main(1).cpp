#include <iostream>
using namespace std;

struct TreeNode{
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x): val(x), left(NULL), right(NULL){}
};
int *a;
int *b;
TreeNode **ta;
TreeNode **tb;

void buildTreeA(TreeNode *root, int cm, int l, int r, int v){
	//root = new TreeNode(0);
	root->val = v;
	if (cm == 0){
		root->left = NULL; root->right =NULL;
	}
	if (cm == 1){
		ta[l-1] = new TreeNode(0);
		ta[l-1]->val = a[l-1];
		root->left = ta[l-1];
		root->right = NULL;
	}
	if (cm == 2){
		ta[l-1] = new TreeNode(0);
		ta[l-1]->val = a[l-1];
		root->left = ta[l-1];
		
		ta[r-1] = new TreeNode(0);
		ta[l-1]->val = a[r-1];
		root->right = ta[r-1];
	}
}

void buildTreeB(TreeNode *root, int cm, int l, int r, int v){
	root = new TreeNode(0);
	root->val = v;
	if (cm == 0){
		root->left = NULL; root->right =NULL;
	}
	if (cm == 1){
		tb[l-1] = new TreeNode(0);
		tb[l-1]->val = b[l-1];
		root->left = tb[l-1];
		root->right = NULL;
	}
	if (cm == 2){
		tb[l-1] = new TreeNode(0);
		tb[l-1]->val = b[l-1];
		root->left = tb[l-1];

		tb[r-1] = new TreeNode(0);
		tb[l-1]->val = b[r-1];
		root->right = tb[r-1];
	}
}

bool judgeSub(TreeNode *t1, TreeNode *t2){
	if (t2 == NULL)
		return true;
	if (t1 == NULL)
		return false;
	if (t1->val != t2->val)
		return false;

	return judgeSub(t1->left, t2->left) && judgeSub(t1->right, t2->right);
}

bool hasSubTree(TreeNode *t1, TreeNode *t2){
	bool result = false;
	if (t1!= NULL && t2!=NULL){
		if (t1->val == t2->val){
			result = judgeSub(t1, t2);
		}
		if (!result){
			result = hasSubTree(t1->left, t2);
		}
		if (!result){
			result = hasSubTree(t1->right, t2);
		}
	}
	return result;
}


int main ()
{
	int n, m;
	while (cin >> n >>m){
		//cout<<n<<m<<endl;
		if (m > n || m <= 0 || n <= 0){
			cout<<"NO"<<endl;
			continue;
		}
		a = new int[n];
		for (int i = 0; i < n; i++)
			cin>>a[i];
		ta = new TreeNode*[n];
		
		int num = 0, l = 0, r = 0;
		for (int i = 0; i < n; i++){
			cin>>num;
			if (num == 1){
				cin>>l;
			}
			if (num == 2){
				cin>>l>>r;
			}
			//cout<<"here"<<endl;
			ta[i] = new TreeNode(0);
			buildTreeA(ta[i], num, l, r, a[i]);
		}
		b  =new int[m];
		for (int j = 0; j < m; j++)
			cin>>b[j];
		tb = new TreeNode*[m];

		for (int i = 0; i < m; i++){
			cin>>num;
			if (num == 1){
				cin>>l;
			}
			if (num == 2){
				cin>>l>>r;
			}
			tb[i] = new TreeNode(0);
			buildTreeB(tb[i], num, l, r, b[i]);
		}

		if (hasSubTree(ta[0], tb[0])){
			cout<<"YES"<<endl;
		}else{
			cout<<"NO"<<endl;
		}

	}
	
	

}