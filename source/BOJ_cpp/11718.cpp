#include <cstdio>

int main() {
    char str[111];

    while(scanf("%[^\n]\n" ,str) == 1) {
        printf("%s\n" , str);
    }
    
    return 0;
}