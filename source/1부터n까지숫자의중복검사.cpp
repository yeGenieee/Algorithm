#include <vector>
#include <iostream>
using namespace std;

bool solution(vector<int> arr)
{
    bool answer = true;
    bool check[arr.size()+1];

    for (int i=0;i<arr.size();i++) {
        if (arr[i] <= arr.size() && !check[arr[i]]) { // 주어진 배열에 중복 없이 한 번씩 들어 있는 경우
            check[arr[i]] = true;      
        } else {
            answer = false;
            break;
        }
    }
    

    return answer;
}

int main () {
    int n;
    cin>>n;
    
    bool result;
    
    vector<int> arr(n);
    
    result = solution(arr);
    
    return 0;
}