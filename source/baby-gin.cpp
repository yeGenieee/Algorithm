#include <iostream>

using namespace std;

int main() {
    int arr[6];
    int count[10] = {0};

    for(int i=0;i<6;i++) {
        int num;
        cin>>num;
        arr[i] = num;

        count[num] += 1;
    }

}