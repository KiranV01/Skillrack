#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,arr[100],x,i;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&x);
    for(i=0;i<n;i++)
    {
        if(arr[i]<x)
            printf("%d ",arr[i]+x);
        else
            printf("%d ",arr[i]-x);
    }
}
