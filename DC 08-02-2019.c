#include<stdio.h>
#include <stdlib.h>

int main()
{
    int arr[100],n,i;
    scanf("%d",&n);
    for(i=0;i<n;i++)
        scanf("%d ",&arr[i]);
    for(i=1;i<n-1;i++)
    {
        if(arr[i]<=arr[0] || arr[i]>=arr[n-1])
        {
            printf("NO");
            return 0;
        }
    }
    printf("YES");
}
