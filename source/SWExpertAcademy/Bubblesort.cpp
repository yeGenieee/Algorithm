#include <iostream>

using namespace std;

void BubbleSort(int arr[], int n) {
    int temp;

    for(int i=n-1;i>0;i--) {
        for (int j=0;j<=i;j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main(){
    int arr[5] = {55,7,78,12,42};

    BubbleSort(arr,5);
}