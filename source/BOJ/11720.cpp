#include <iostream>
#include <cstdio>

using namespace std;

int main () {
    int n;
    int sum = 0;

    cin>>n;

    for (int i=0;i<n;i++) {
        int x;

        scanf("%1d", &x);
        sum += x;
    }

    cout<<sum<<"\n";

    return 0;
}