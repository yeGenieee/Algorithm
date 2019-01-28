#include <iostream>

using namespace std;

int main() {
    int n;

    cin>>n;

    for(int i=1; i<=n; i++) {
        for (int k=0;k<(n-i);k++) {
            cout<<"*";
        }
        for(int j=0;j<(2*i); j++) {
            cout<<" ";
        }
        for (int k=0;k<(n-i);k++) {
            cout<<"*";
        }
        
        cout<<"\n";
    }
    for(int i=n-1; i>0; i--) {
        for (int k=0;k<(n-i);k++) {
            cout<<"*";
        }
        for(int j=0;j<(2*i-1); j++) {
            cout<<" ";
        }
        for (int k=0;k<(n-i);k++) {
            cout<<"*";
        }

        cout<<" ";

        cout<<"\n";
    }

    return 0;
}