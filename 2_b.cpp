#include<iostream>
using namespace std;

class Vechile{
    public:
    Vechile(){
        cout<<"This is a vechicle"<<endl;
    }
};
class Car: public Vechile{
    public:
    Car(){
        cout<<"This is car"<<endl;
    }
};

class Bus:public Car{
    public:
    Bus(){
        cout<<"This is bus"<<endl;
    }
};

int main(){
    Bus b;
    return 0;
}