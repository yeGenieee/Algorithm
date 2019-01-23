#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main() {
    int t;
    cin>>t;

    stack<int> st;

    for(int i=0;i<t;i++) {
        string cmd;
        cin>>cmd;

        for (int j=0; j<cmd.length();j++) {
            if ( cmd[j] == '(') {
                st.push(cmd[j]);
            } else {
                if (st.empty()) {
                    cout<<"NO"<<"\n";
                    break;
                } else {
                    if (st.top() == '(') {
                        continue;
                    } else {
                        
                    }
                }
            }
        }
    }


}