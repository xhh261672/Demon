#include <iostream>

using namespace std;

void reverse (char *a, int l, int r){
    int i = l, j = r;
    while (i < j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++; j--;
    }
}
void rotate(char a[], int n, int k){
    //cout<<sizeof(a)<<endl;
    if (k <= 0) return ;
    else{
        k %= n;
        int p = n-k;
        cout<<n<<" "<<k<<" "<<p<<endl;
        reverse(a, 0, p-1);
        reverse(a, p, n-1);
        reverse(a, 0, n-1);
    }
}
int binarySearch(int *a, int n, int num){
    int l = 0, r = n-1;
    int mid = 0;
    while (l <= r){
        mid = l + ((r-l)>>1);
        if (a[mid] == num)
            return mid;
        else if (num < a[mid])
            r = mid-1;
        else
            l = mid+1;
    }
    return -1;
}

int main()
{
    char a[6] = {'a', 'b', 'c', 'd', 'e', 'f'};
    //rotate(a, 6, 8);
    int *aa = new int[1000000];
//    for (int i = 0; i < 6; i++){
//        cout<<a[i]<<" ";
//    }
    for (int i = 0; i < 1000000; i++)
        aa[i] = i;
    cout<<binarySearch(aa, 1000000, 500000)<<endl;
    return 0;
}
