#include<iostream>
using namespace std;

template<class T>
T max(T x,T y)
{
	if(x>y)
	{
	return x; 
	}
	else
	{ return y;
	}
}
int main()
{
	int i=10,j=10,iret;
	double a=3.10,b=6.10,dret;
	iret=max(i,j);
	cout<<"max is "<iret<<"\n";
	dret=max(a,b);
	cout<<"max is "<<dret<<"\n";


	return 0;
}