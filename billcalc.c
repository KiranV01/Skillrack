#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    char inp[100];
    int i,len,sum=0,temp=0,x,c=0;
    scanf("%s%n",inp,&len);
    for(i=len-1;i>-1;i--)
    {
        if(isalpha(inp[i]))
        {
            sum+=temp;
            temp = c = 0;
        }
        else
        {
            x = inp[i] - '0';
            c++;
            temp = temp + pow(10,c-1)*x;
        }
    }
    printf("%d",sum);
}
