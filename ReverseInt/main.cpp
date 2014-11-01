#include <iostream>
#include <vector>
#include <cmath>
#include <limits.h>
using namespace std;

class Solution {
public:
    int reverse(int x) {
        if(x == 0)
            return 0;
        int isMinus = 1;
        if(x < 0){
            isMinus = -1;
            x = -1 * x;
        }
        vector<int> revArr;
        int counter = 0;
        while(x != 0){
            counter ++;
            int tail = x%10;
            //cout<<tail;
            revArr.push_back(tail);
            x/=10;
        }
        bool prezero = true;
        long long result = 0;
        for(vector<int>::iterator iter = revArr.begin(); iter!= revArr.end(); ++iter){
            if(*iter == 0 && prezero){
                counter--;
                continue;
            }
            else{
                prezero = false;
                result = result + (*iter)*(long long)pow(10.0, counter-1);
                counter --;
            }
            //cout<<result<<endl;
        }

        if(result > INT_MAX)
            return 0;
        else
            return result*isMinus;
    }
};

int main()
{
    cout << "Hello world!" << endl;
    Solution sol;
    //1000000003
    //cout<<INT_MAX<<endl;
    cout<<sol.reverse(123)<<endl;
    return 0;
}
