#include <iostream>

using namespace std;

int main()
{
    int n = 0;
    while (cin >> n){
        int *arr = new int[n];
        for (int i = 0; i < n; i ++){
            cin>>arr[i];
        }

        int l = 0, r = n-1;
        int m = l + ((r-l)>>1);
        while (l < r){
            if (arr[m] >= arr[l] && arr[r] < arr[m])
                l = m+1;
            else
                r = m;
            m = l + ((r-l)>>1);
        }
        cout<<arr[m]<<endl;
    }
    return 0;
}
