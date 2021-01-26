#include <stdio.h>
/* Include other headers as needed */
int reverse(int n)
{
  static int sum=0,rem;
  if(n>0)
  {
    rem=n%10;
    sum=sum*10+rem;
    reverse(n/10);
  }
  else
    return sum;
}
int main()
{
	int n,rev;
  scanf("%d",&n);
  rev=reverse(n);
  printf("%d",rev);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
