#include<stdio.h>
int main()
{
  //Type your code here
  int num,num1,num2,num3;
  scanf("%d",&num);
  num1=num/100;
  num2=num%10;
  num3=num1+num2;
  printf("%d",num3);
  return 0;
}