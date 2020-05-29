#include<iostream>
using namespace std;
int main(){
  int n,odd=0,even=0;
  cin>>n;
  for(int i=0;i<n;i++){
    int g;cin>>g;
    g%2==0?even++:odd++;
  }
  cout<<odd<<"\n"<<even;
  return 0;
}