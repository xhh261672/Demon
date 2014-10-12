#include <iostream>
#include <string>
#include <stack>
#include <cmath>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack <char>parenStack;
        char tmp ;
        for(int i = 0;i<s.size(); i++){
            //cout<<s[i]<<" ";
            if(s[i] == '(' ||s[i]=='{'||s[i]=='[')
                parenStack.push(s[i]);
            else if(s[i] == ')'||s[i]=='}'||s[i]==']')
            {
                if(parenStack.empty())
                    return false;
                tmp = parenStack.top();
                parenStack.pop();
                if(abs(s[i] - tmp)>2)
                    return false;
            }
            else
                continue;
        }
        if(parenStack.empty())
            return true;
        return false;
    }
};

int main()
{
    Solution solution;
    string s = "[";
    cout<<solution.isValid(s);
    return 0;
}
