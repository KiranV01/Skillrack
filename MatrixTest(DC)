#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,m,mat[100][100],rem,i,j,k;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&mat[i][j]);
        }
    }
    scanf("%d",&m);
    rem=m%n;
    printf("%d\n",rem);
    for(i=0;i<n;i++)
    {
        if(i%2==0)
        {
            for(k=n-rem;k<n;k++)
            {
                printf("%d ",mat[i][k]);
            }
            for(k=0;k<n-rem;k++)
            {
                printf("%d ",mat[i][k]);
            }
            printf("\n");
        }
        else
        {
            for(k=rem;k<n;k++)
            {
                printf("%d ",mat[i][k]);
            }
            for(k=0;k<rem;k++)
            {
                printf("%d ",mat[i][k]);
            }
            printf("\n");
            
        }
    }
    


}
