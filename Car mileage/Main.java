#include<iostream>
using namespace std;
int main()
{
  int p,d,t;
  float m;
  cin>>m>>p>>d;
  t=p*m;
  if(t>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}
