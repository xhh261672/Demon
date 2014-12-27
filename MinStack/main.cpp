#include <iostream>
#include <stack>

using namespace std;

class MinStack{
public:
    int top(){
        return stack_all.top();
    }
    void push(int x){
        stack_all.push(x);
        if (stack_min.size() == 0)
            stack_min.push(x);
        else if (x <= stack_min.top())
            stack_min.push(x);
    }
    void pop(){
        if(stack_all.size()){
            if (stack_min.size() && stack_all.top() == stack_min.top())
                stack_min.pop();
            stack_all.pop();
        }
    }
    int getMin(){
        return stack_min.top();
    }
private:
    stack<int> stack_all;
    stack<int> stack_min;
};
int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
