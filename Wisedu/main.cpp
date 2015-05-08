#include <iostream>
#include <cstring>
#include <cmath>

using namespace std;

void reverse1(char *s){
    int len = 0;
    for (int i = 0; s[i] != '\0'; i++){
        len++;
    }
    cout<<len<<endl;
    for (int i = len-1; i >= 0; i--){
        cout<<((s[i] >= 'A' && s[i] <= 'Z')? (char)(s[i]+32) : s[i]);
    }
    //return NULL;
}

char *reverse(char *s){
    int len = strlen(s);
    char temp;
    for (int i = 0; i < len/2; i++){
        if (s[i] >= 'A' && s[i] <= 'Z'){
            s[i] = (char)(s[i]+32);
        }
        if (s[len-1-i] >= 'A' && s[len-1-i] <= 'Z'){
            s[len-1-i] = (char)(s[len-1-i]+32);
        }
        temp = s[i];
        s[i] =  s[len-1-i];
        s[len-1-i] = temp;
    }
    return s;
}

void cal(int a, int b){
    int m = a*b;
    while (b!=0){
        int r = a%b;
        a = b; b = r;
    }
    cout<<a<<" "<<m/a<<endl;
}

bool isPrime1(int n){
    int sqrtn = (int)sqrt(n);
    for (int i = 2; i < sqrtn; i++){
        if (!(n%i)){
           return false;
        }
    }
    return true;
}

int main()
{
    char s[] = {"abcdFGhjKL"};

    //cout<<reverse(s);
    //cal(12, 10);
    cout<<isPrime1(17)<<endl;
    return 0;
}
