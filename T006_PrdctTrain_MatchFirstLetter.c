#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int i,j;
int main()
{
    char str1[100],str2[100];
    int len1,len2,flag=0;
    scanf("%s\n%s",str1,str2);
    for(i=0;str1[i]!='\0';i++)
    {
        if(str1[i]==str2[0] && flag==0)
        {
            printf("%s\n",str2);
            flag++;
        }
        else
            printf("%c\n",str1[i]);
    }
}
/*
Input: playground
       ginger
Output:
p
l
a
y
ginger
r
o
u
n
d
*/
