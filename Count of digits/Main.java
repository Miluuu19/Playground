#include<iostream>
#include <bits/stdc++.h> 
using namespace std; 
  
int main()
{ int n;
 cin>>n;
    int count = 0; 
   do { 
        n = n / 10; 
        ++count; 
    }  while (n != 0);
    cout<<count; 
} 
  
