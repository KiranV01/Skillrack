#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
  char inp[1000];
  scanf("%s",inp);
  for(int i=0;inp[i]!='\0';i++)
  printf("%.2f ",sqrt(inp[i]-'0'));
}

/*
input: 123456
output:
1.00 1.41 1.73 2.00 2.24 2.45 
*/
