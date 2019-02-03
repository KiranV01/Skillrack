#include<stdio.h>
#include <stdlib.h>

int main()
{
    char a='A';
    int i,j,k,n,c=1;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i-1;j++)
            printf("*");
        printer(a,i,c);
        printf("\n");
        c++;
    }
}
void printer(char a,int i,int c)
{
    int j,k;
    for(j=0;j<c;j++)
        printf("%c",a++);
    a-=2;
    for(k=0;k<c-1;k++)
        printf("%c",a--);
}

/*
Input: 4
Output:
***A
**ABA
*ABCBA
ABCDCBA
*/
