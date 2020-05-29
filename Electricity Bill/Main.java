#include<iostream>
using namespace std;
int main()
{
  int unit,y;
  cin>>unit;
  if(unit<=200){
    y=(int)unit*0.5;
  	cout<<"Rs."<<y;
  }
  else if(unit<=400)
    cout<<"Rs."<<unit*0.65+100;
  else if(unit<=600)
    cout<<"Rs."<<unit*0.80+200;
  else
    cout<<"Rs."<<unit*1.25+425;
}