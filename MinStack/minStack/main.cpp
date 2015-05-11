#include <iostream>
#include <stack>
#include <fstream>
//#include <cstdlib>
using namespace std;

int main ()
{
	int n = 0;
	stack<int> s;;
	stack<int> mins;

	//freopen("in.txt", "r", stdin);
	//freopen("out.txt", "w", stdout);

	while (cin>>n){
		char op;
		int val;
		for (int i = 0; i < n; i++){
			cin>>op;
			if (op == 's'){
				cin>>val;
				s.push(val);
				if (mins.empty()){
					mins.push(val);
				}
				else if (val < mins.top()) mins.push(val);
				cout<<mins.top()<<endl;
			}
			if (op == 'o'){
				if (s.empty()){
					cout<<"NULL"<<endl;
				}
				else{
					if (s.top() == mins.top())
						mins.pop();
					s.pop();
					if (!mins.empty()){
						cout<<mins.top()<<endl;
					}else{
						cout<<"NULL"<<endl;
					}
				}
			}
		}
	}
	return 0;
}