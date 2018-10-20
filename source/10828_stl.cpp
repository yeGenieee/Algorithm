#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main() {
    int n;
    cin>>n;

    stack<int> st;

    for(int i=0;i<n;i++) {
        string cmd;
        cin>>cmd;

       if (cmd == "push") {
            int num;
            cin>>num;
            st.push(num);
        } else if(cmd == "size") {
            cout<<st.size()<<"\n";
        } else if (cmd == "top") {
            cout<<(st.empty() ? -1 : st.top())<<"\n";
        } else if (cmd == "empty") {
            cout<<st.empty()<<"\n";
        } else if (cmd == "pop") {
            cout<<(st.empty() ? -1 : st.top()) <<"\n";
            if (!st.empty()){
                st.pop();
            }
        } else {
            
        }
    }

    return 0;
}