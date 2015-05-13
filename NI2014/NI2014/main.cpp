#include <iostream>
#include <fstream>
#include <string>
#include <map>
#include <windows.h>
#include <cstdlib>
#include <algorithm>
using namespace std;

void firstUniqueChar()
{
	string s;
	while (getline(cin, s))
	{
		char c;
		map<char, int> m;
		map<char, int>::iterator it;
		for (int i = 0; i < s.size(); i++)
		{
			it = m.find(s[i]);
			if (it != m.end())
				m[s[i]] = -1;
			else
				m[s[i]] = i;
		}
		map<char, int>::iterator iter = m.begin();
		int min = s.size()-1;
		for (;iter != m.end(); ++iter)
		{
			if (iter->second != -1 && iter->second < min)
				min = iter->second;
			//cout<<min<<endl;
		}
		cout<<s[min]<<endl;
	}
}
void unique2(){
	string s;
	int cs[256];
	bool re[256];
	while (getline(cin, s)){
		memset(cs, 0, sizeof(cs));
		memset(re, false, sizeof(re));
		
		/*for (int i = 0; i < 256; i++)
			cout<<cs[i];
		cout<<endl;*/
		for (int i = 0; i < s.size(); i++){
			cs[s[i] - '0']++;
			//cout<<cs[s[i]]<<endl;
		}
		for (int i = 0; i < 256; i++){
			if (cs[i] == 1)
				re[i] = true;
		}
		char c = '\0';
		for (int i = 0; i < s.size(); i++){
			if (re[s[i] - '0'] == true){
				c = s[i];break;
			}
		}
		if (c != '\0')
			cout<<c<<endl;
		else
			cout<<"NULL"<<endl;
	}
}
void spiral()
{
	int n;
	while (cin>>n){
		if (n <= 0) continue;
		int **m = new int *[n];
		for (int i = 0; i < n; i++){
			m[i] = new int[n];
		}
		int i = 0, j = 0;
		int l = 0, r = n-1;
		int u = 0, d = n-1;
		int num = 0;
		while (u < d && l < r){
			m[i][j] = num++;
			if (i==u&&j<r) j++;
			else if (j==r && i < d) i++;
			else if (i==d && j > l) j--;
			else if (j==l && i > u+1) i--;
			else if (i==u+1 && j==l){
				u++;l++;
				d--;r--;
				j++;
			}
		}
		if (l == r || u == d)
			m[i][j]=num;
		for (int s = 0; s<n; s++){
			for (int t = 0; t < n; t++)
				cout<<m[s][t]<<" ";
			cout<<endl;
		}

		for (int s = 0; s < n; s++)
			delete[] m[s];
		delete[] m;
	}
}

void addBigInt(){
	string s1, s2;
	while (cin>>s1>>s2){
		//cout<<s1<<endl<<s2<<endl;
		int l = max(s1.size(), s2.size()) + 1;
		char *re = new char[l];
		int remain = 0;
		int m = s1.size()-1, n = s2.size()-1;
		int i;
		for (i = l-1; m>=0 && n>=0 && i >= 0; i--){
			int s = s1[m]-'0'+s2[n]-'0'+remain;
			if (s >=10 ){
				s%=10;
				remain = 1;
			}else{
				remain = 0;
			}
			re[i] = (char)('0'+s);
			m--; n--;
		}
		while(m>=0){
			int s = s1[m]-'0'+remain;
			if (s >=10 ){
				s%=10;
				remain = 1;
			}else{
				remain = 0;
			}
			re[i] = (char)('0'+s);
			m--;i--;
		}
		while(n>=0){
			int s = s2[n]-'0'+remain;
			if (s >=10 ){
				s%=10;
				remain = 1;
			}else{
				remain = 0;
			}
			re[i] = (char)('0'+s);
			n--;i--;
		}
		int start = 1;
		if (remain != 0){
			re[0] = (char)(remain+'0');
			start = 0;
		}
		//cout<<remain<<endl;
		for (int j = start; j < l; j++)
			cout<<re[j];
		cout<<endl;

	}
}
int main()
{
	freopen("in.txt", "r", stdin);
	freopen("out.txt", "w", stdout);
	//firstUniqueChar();
	//unique2();
	//spiral();
	addBigInt();
	return 0;
	
}