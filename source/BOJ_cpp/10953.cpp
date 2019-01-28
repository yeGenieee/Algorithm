#include <iostream>
#include <string>

using namespace std;

int main () {
    int t;
    string a,b;

    cin>>t;

    for(int i=0; i<t; i++) {
        getline(cin, a, ',');
        getline(cin, b);
        cout<< stoi(a) + stoi(b) << "\n";
    }

    
}