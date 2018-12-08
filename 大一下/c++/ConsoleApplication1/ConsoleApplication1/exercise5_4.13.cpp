#include<iostream>;
#include<iomanip>;
using namespace std;

//将一个double型数转换成2进制数
void Double2Bit(double dVal,char * pArray)
{
	const int B = 8 * sizeof(dVal);
	int i;
	for (i = 0 ; i < B; i++)
	{
		int M = (int)dVal >> i & 0x01;
		pArray[i] = (M == 1) ? 1 : 0;
	}
}

//去掉数字
void eraseDigital(char * pStri1)
{
	char pStri2[10];
	int i = 0;
	while ('\0' != * (pStri1 + i))						//i用来求该字符串的长度
	{
		i++;
	}
	int j = 0,k = 0;
	while (k <= i - 1 )
	{
		if (*(pStri1 + k) > 57)
		{
			*(pStri2 + j) = *(pStri1 + k);
			j++;
			k++;
		}
		else
		{
			k++;
		}
	}
	cout << pStri2;
}

//将一个double型数字的2进制数字反序
double ReverseDouble(double Val)
{
	char* pPointer = (char *)&Val;
	for (int i = 0;i < sizeof(Val)/2;i++)			//i等于4
	{
		char c = pPointer[i];
		pPointer[i] = pPointer[sizeof(Val) - i - 1];
		pPointer[sizeof(Val) - i - 1] = c;
	}
	return Val;
}

//模板函数
template<class T>
T ReverseT(T Val)
{
	char * pPointer = (char *)&Val;
	for (int i = 0;i < sizeof(Val)/2;i++)
	{
		char c = pPointer[i];
		pPointer[i] = pPointer[sizeof(Val) - i - 1];
		pPointer[sizeof(Val) - i - 1] = c;
	}
	return Val;
}

int exercise5main()
{
	double x = 3.14;
	char BitArray[65] = {0};		//申明一个数组用来存储2进制数字
	Double2Bit(x,BitArray);			//将数组的地址作为形参
	cout << BitArray;
	char * a = "dawdaw234";
	eraseDigital(a);				//去掉字符串中的数字
	cout << ReverseDouble(x);		//输出double型数字倒序后新形成的数字
	ReverseT<double>(x);
	return 0;
}
