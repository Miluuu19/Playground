#include<iostream>
using namespace std;
int main()
{
  int famt,fdist,fship,samt,sdist,sship,aamt,adist,aship,fd,sd,ad,f,s,a,ft,st,at;
  cin>>famt>>fdist>>fship;
  cin>>samt>>sdist>>sship;
  cin>>aamt>>adist>>aship;
  fd=(famt*fdist)/100;
  f=famt-fd;
  ft=f+fship;  
  sd=(samt*sdist)/100;
  s=samt-sd;
  st=s+sship;
  ad=(aamt*adist)/100;
  a=aamt-ad;
  at=a+aship;
  cout<<"In Flipkart Rs."<<ft<<"\n"<<"In Snapdeal Rs."<<st<<"\n"<<"In Amazon Rs."<<at;
  if(ft<=st && ft<=at)
    cout<<"\nHe will prefer Flipkart";
  else if(st<ft && st<at)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";  
}