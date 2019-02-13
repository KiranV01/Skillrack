#include <stdio.h>
#include <stdlib.h>
int main()
{
  int temp,prev=-99,i,n;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&temp);
    if(temp>prev)
      printf("%d ",temp);
    prev=temp;
  }
}
