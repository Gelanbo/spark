#include<iostream>
using namespace std;
int main(){
	int n;
	float f1=0,f2=1,f;			//��ֵf1Ϊ���е�1��F(1)=0��f2Ϊ���е�2��f(2)=1 
	cout<<f1<<" "<<f2<<" "; 	//������е�һ��͵ڶ��� 
	for(n=0;n<98;n++){			//�ӵ�3������,���ʣ��98�� 
		f=f1+f2;
		cout<<f<<" ";
		f1=f2;
		f2=f;
	}
	return 0;
}
