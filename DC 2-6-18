#include<stdio.h>
#include <stdlib.h>

int isVowel(char a)
{
    a=tolower(a);
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
    {
        return 1;
    }
    else
    return 0;
}
int main()
{
    char inp[1000];
    int count=0,i;
    scanf("%s",inp);
    for(i=0;inp[i]!='\0';i++)
    {
        if(isVowel(inp[i]))
        {
            if(isVowel(inp[i+1]))
            {
                count++;
            }
        }
    }
    printf("%d",count);


}
