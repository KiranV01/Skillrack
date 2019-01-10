#include<stdio.h>
#include <stdlib.h>
#include <string.h>

int count = 0;

int counter(char inp[10000],int i,int len)
{
    for(;i<len;i++)
    {
        if(inp[i]=='b')
        {
            count++;
        }
        if(!isalpha(inp[i]))
        {
            return 0;
        }
    }
}

int main()
{
    char inp[10000];
    int len,i;
    scanf("%s",inp);
    len=strlen(inp);
    for(i=0;i<len;i++)
    {
        if(inp[i]=='a')
        {
            counter(inp,i+1,len);
        }
    }
    printf("%d",count);


}
