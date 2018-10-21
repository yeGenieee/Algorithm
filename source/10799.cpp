#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main() {
    string cmd;
    cin >> cmd;

    int n = cmd.length();

    stack<int> st;

    int cnt = 0;

    for (int i=0; i<n; i++) {

        if (cmd[i] == '(') {
            st.push(i);
        } else {
            if (st.top()+1 == i) {
                st.pop();
                cnt += st.size();
            } else {
                st.pop();
                cnt += 1;
            }
        }
    }
    cout << cnt << '\n';
}