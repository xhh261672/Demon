#include <iostream>

using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode (int x) : val(x), left(NULL), right(NULL) {}
};

int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
