#include <iostream>
#include <cstdio>

using namespace std;

int main () {
    char str[100];

    while ( (scanf("%10s", str)) == 1) {
        cout<<str<<"\n";
    }

    return 0;
    
}