#include<iostream>
using namespace std;

class Square{
    public:
    int square(int x){
        return x*x;
    }
    double square(double x){
        return x*x;
    }
};

int main(){
    Square s;
    cout<<"Square 1:"<<s.square(10)<<endl;
    cout<<"Square 2:"<<s.square(2.2)<<endl;
    return 0;
}