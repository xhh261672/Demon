#include <iostream>
using namespace std;

int main(){
	int m, n;
	while (cin >> m >> n){
		if (m <= 0 || n <= 0) 
			continue;
		int **a = new int*[m];
		for (int i=0; i < m; i++){
			a[i] = new int[n];
		}
		for (int i = 0; i<m;i++){
			for (int j = 0; j < n; j++){
				cin>>a[i][j];
			}
		}

		int count = m*n;
		int i = 0, j = 0;
		int u = 0, d = m-1;
		int l = 0, r = n-1;

		while (u < d && l < r){
			cout<<a[i][j]<<" ";
			if (i==u && j < r) j++;
			else if (j==r && i < d) i++;
			else if (i==d && j > l) j--;
			else if (j==l && i > u+1)i--;
			else if (i == u+1 && j == l){
				u++;l++;
				d--;r--;
				j++;
			}
		}

		if (l == r){
			for (int k = u; k <= d; k++)
				cout<<a[k][l]<<" ";
		}
		else if (u == d){
			for (int k = l; k <= r; k++){
				cout<<a[u][k]<<" ";
			}
		}
		cout<<endl;

	}
	return 0;
}