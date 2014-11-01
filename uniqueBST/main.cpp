#include <iostream>

using namespace std;
class Solution {
public:
    int numTrees(int n) {
        if(n == 1 || n == 0)
            return 1;
        else
        {
            int num = 0;
            for (int i = 1; i <= n; i++){
                num += numTrees(i) * numTrees(n - i);
            }
            return num;
        }
    }
};
int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
