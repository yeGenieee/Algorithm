#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;

    string a;
    string b;

    while(t--) {
        getline(cin, a, ",");
        getline(cin, b);
        cout << stoi(a) + stoi(b) << '\n';
    }
}