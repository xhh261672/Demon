#include <iostream>
#include <fstream>
#include <string>
#include <map>
#include <windows.h>
#include <cstdlib>
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
int main()
{
	//freopen("in.txt", "r", stdin);
	freopen("out.txt", "w", stdout);
	//firstUniqueChar();
	spiral();
	return 0;
	
}