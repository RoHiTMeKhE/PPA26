#include<iostream>
using namespace std;

class array
{
public:
int *arr;
int size;
array(int length=10)
{
size = length;
arr=new int[size];
}
~array()
{
delete[]arr;
}
void accept()
{
int i=0;
cout<<"enter the elelments\n";
for(i=0;i<size;i++)
{
cin>>arr[i];
}
}
void display()
{
int i=0;
cout<<"elelments are\n";
for(i=0;i<size;i++)
{
cout<<arr[i]<<"\n";
}
}
};
int main()
{
array obj(5);
obj.accept();
obj.display();
return 0;
}