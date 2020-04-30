#include <iostream>
#include <string>
#include <stack>

using namespace std;

struct Stack {
    int data[1000];
    int size;
    
    Stack() {
        size = 0;
    }
    
    int size() {
        return size;
    }

    bool empty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void push (int num) {
        data[size] = num;
        size+=1; 
    }

    int top() {
        if (empty()) {
            return data[size-1];
        } else {
            return -1;
        }
    }

    int pop() {
        if(empty()) {
            return -1;
        } else {
            size -= 1;
            return data[size];
        }
    }
    
};

int main() {
    int n;

    cin>>n;

    Stack st;

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
            cout<<st.top()<<"\n";
        } else if (cmd == "empty") {
            cout<<st.empty()<<"\n";
        } else if (cmd == "pop") {
            cout<<st.pop()<<"\n";
        } else {
            
        }
    }

    return 0;
}