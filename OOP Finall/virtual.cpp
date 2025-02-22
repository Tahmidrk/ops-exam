#include<iostream>
using namespace std;
class Vehicle{
    public:
    virtual void display(){
        cout<<"Vehicle"<<endl;
    }
};
class Bus:public Vehicle{
    public:
    void display(){
        cout<<"Bus"<<endl;
    }
};
class Car:public Vehicle{
    public:
    void display(){
        cout<<"Car"<<endl;
    }
};
class Bike:public Vehicle{
    public:
    void display(){
        cout<<"Bike"<<endl;
    }
};

int main(){
    Vehicle *v;
    Vehicle v1;
    Bus b;
    Car c;
    Bike bk;
    v=&v1;
    v->display();
    v=&b;
    v->display();
    v=&c;
    v->display();
    v=&bk;
    v->display();
    return 0;
}