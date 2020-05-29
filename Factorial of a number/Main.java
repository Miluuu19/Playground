#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,fact;
  cin>>n;
  fact=1;
  int i;
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  cout<<fact;
}