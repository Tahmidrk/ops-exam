#include<iostream>
using namespace std;

class Rectangle{
    private:
    int length;
    int breadth;
    public:
    Rectangle(double len,double brth):length(len),breadth(brth){}
    int getArea(){
        return length*breadth;
    }
};
int main(){
    Rectangle rect(8.9,6.7);
    cout<<"Area="<<rect.getArea();
    return 0;
}