#include<iostream>
using namespace std;
int main()
{
   int w,a,c,ta,tc,total;
   cin>>w>>a>>c;
   ta=a*75;
   tc=30*c;
   total=ta+tc;
   if(total<=w)
      cout<<"Boat is stable";
   else
      cout<<"Boat will drow";
}