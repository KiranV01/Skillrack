#include<stdio.h>
#include <stdlib.h>

int main()
{
  int n,x,i,r,sum=0;
  scanf("%d\n%d",&n,&x);
  while(n>0)
  {
    r=n%10;
    sum+=r;
    n/=10;
  }
  printf("%d",sum*x);
}
