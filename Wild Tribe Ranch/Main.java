#include<iostream>
int main()
{
  int a,b;
  std::cin>>a;
  std::cin>>b;
  if(b<a)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(b>a)
  {
    std::cout<<"Sorry, you can't enter";
  }
  else if(b==a)
  {
    
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
}