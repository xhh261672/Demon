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
        int m = 0;
        while (arr[l] >= arr[r] && l < r){
            if (l == r - 1){
                m = r; break;
            }
            m = l + ((r-l)>>1);
            if (arr[l] == arr[m] && arr[m] == arr[r]){
                int t  = l;
                for (int i = l+1;i <= r; i++){
                    if (arr[i] < arr[t]){
                        t = i;
                    }
                }
                m = t;
                break;
            }
            if (arr[m] >= arr[l] && arr[r] < arr[m])
                l = m;
            else
                r = m;
            m = l + ((r-l)>>1);
        }
        cout<<arr[m]<<endl;
    }
    return 0;
}
