#include<iostream>
#include<string>
using namespace std;

void print(int x){
    cout<<"Printing int:"<<x<<endl;
}
void print(double x){
    cout<<"Printing float:"<<x<<endl;
}

void print(string s){
    cout<<"Printing string:"<<s<<endl;
}

int main(){
    print(4);
    print(400.73);
    print("C++ is fun");

    return 0;

}