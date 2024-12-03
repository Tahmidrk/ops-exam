#include<iostream>
using namespace std;
class Vehicle{
    public:
    virtual void display(){
        cout<<"Vehicle is running."<<endl;
    }
};

class Bus: public Vehicle{
    public:
    void display(){
        cout<<"Bus is running."<<endl;
    }
};
class Car: public Vehicle{
    public:
    void display(){
        cout<<"Car is running."<<endl;
    }
};

class Bike: public Vehicle{
    public:
    void display(){
        cout<<"Bike is running."<<endl;
    }
};
int main(){
    Vehicle *v;
    Vehicle v1;
    Bus b;
    Car c;
    Bike b1;
    v=&v1;
    v->display();
    v=&b;
    v->display();
    v=&c;
    v->display();
    v=&b1;
    v->display();
    return 0;
}