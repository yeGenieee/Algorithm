#include <iostream>
#include <string>

using namespace std;

int main() {
    int x,y;
    int arr[12] = {31,28,31,30,31,30,31,31,30,31,30,31};
    string date[7] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int day=0;

    cin>>x>>y;

    for (int i=0; i<x-1; i++) {
        day += arr[i];
    }
    
    day += (y-1);

    cout<<(date[day % 7])<<"\n";
    


}