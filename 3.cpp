#include<iostream>
using namespace std;

class Rectangle{
    private:
    int length;
    int breadth;
    public:
    Rectangle(int len,int brth):length(len),breadth(brth){}
    int getArea(){
        return length*breadth;
    }
};
int main(){
    Rectangle rect(8,6);
    cout<<"Area="<<rect.getArea();
    return 0;
}