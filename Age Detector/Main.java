#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(a<b)
    cout<<b-a;
  else{
    b+=100;
    cout<<b-a;
  }
}
