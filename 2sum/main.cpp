#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int> &numbers, int target) {
        vector<int> temp = numbers;
        sort(temp.begin(), temp.end());
        //cout<<*numbers.begin()<<numbers.at(3)<<endl;
        int index1,index2;
        int i = 0,j = temp.size()-1;
        while(i < j){
            //cout<<i<<j<<endl;
            int sum = temp[i] + temp[j];
            if(sum == target){
                break;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }

        for(int k = 0; k < temp.size(); k++){
            if(numbers[k] == temp[i])
                {index1 = k+1;break;}
        }
        for(int k = temp.size()-1; k >= 0; k--){
            //cout<<k<<endl;
            if(numbers[k] == temp[j])
                {index2 = k+1;break;}
        }
        if(index1 > index2){
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }
        vector<int> result;
        result.push_back(index1);
        result.push_back(index2);
        return result;
    }
};

int main()
{
    //cout << "Hello world!" << endl;
    int nums[4] = {4,3,2,1};
    vector<int> numbers(&nums[0], &nums[4]);
    Solution solution;
    vector<int> re = solution.twoSum(numbers, 5);
    cout<<re.at(0)<<" "<<re.at(1);
    return 0;
}
