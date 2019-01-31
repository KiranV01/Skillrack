#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    char inp[1000];
    int i,len,sum=0,temp=0,x,c=0;
    scanf("%[^\n]%n",inp,&len);
    printf("\n%s \n%d",inp,len);
    for(i=len-1;i>-1;i--)
    {
        if(isdigit(inp[i]))
        {
            x = inp[i] - '0';
            c++;
            temp = temp + pow(10,c-1)*x;
            //printf("temp : %d  %c\n",temp,inp[i]);
            }
        else
        {
            sum+=temp;
            //printf("Sum %d  %d %c \n",sum,temp,inp[i]);
            temp = c = 0;
        }
    }
    sum+=temp;
    printf("\n%d",sum);
}
