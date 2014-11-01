#include <iostream>

using namespace std;

int main()
{
    char str[100] = {'\0'};
	int i=0;//i为数组长度

//	 while(cin.get()!= '\n')
//	{
//		cin>>str[i];
//		i = i +1;
//	}

    cin.get(str, 100);

    cout << str<< endl;
    return 0;
}
