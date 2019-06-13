// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here
  int num,count=0,i;
  scanf("%d",&num);
  if(num==0)
    printf("neither");
  else
  {
  for(i=1;i<=num;i++)
  {
    
    if(num%i == 0)
      count++;
  } 
  if(count==2)
  {
    printf("prime");
  }
  else 
    printf("composite");
  }
   
  return 0;
}
  
  
  
  