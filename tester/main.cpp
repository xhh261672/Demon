#include <iostream>
using namespace std;

int main()
{
    double money = 0.0;

    while(cin>>money)
    {
        double n = 0;
        n = money / 1.2;

        int left = 0;
        int change = 0;
        int total = 0;

        total = n;
        left = n;

        while(left >= 2)
        {
            while(left >= 20)
            {
                left -= 20;
                total += 7;
                left += 7;
            }

            while(left % 3 == 2)
            {
                total += (left+1)/3;
                left = (left-2)/3;
            }

            while(left >= 3)
            {
                total += left / 3;
                left = (left +2)/3;
            }
        }

        cout<<total<<endl;
    }

    return 0;

}
