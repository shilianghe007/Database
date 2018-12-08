#include<iostream>;
#include<iomanip>;
using namespace std;

//��һ��double����ת����2������
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

//ȥ������
void eraseDigital(char * pStri1)
{
	char pStri2[10];
	int i = 0;
	while ('\0' != * (pStri1 + i))						//i��������ַ����ĳ���
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

//��һ��double�����ֵ�2�������ַ���
double ReverseDouble(double Val)
{
	char* pPointer = (char *)&Val;
	for (int i = 0;i < sizeof(Val)/2;i++)			//i����4
	{
		char c = pPointer[i];
		pPointer[i] = pPointer[sizeof(Val) - i - 1];
		pPointer[sizeof(Val) - i - 1] = c;
	}
	return Val;
}

//ģ�庯��
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
	char BitArray[65] = {0};		//����һ�����������洢2��������
	Double2Bit(x,BitArray);			//������ĵ�ַ��Ϊ�β�
	cout << BitArray;
	char * a = "dawdaw234";
	eraseDigital(a);				//ȥ���ַ����е�����
	cout << ReverseDouble(x);		//���double�����ֵ�������γɵ�����
	ReverseT<double>(x);
	return 0;
}
