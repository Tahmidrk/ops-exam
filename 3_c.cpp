#include<iostream>
#include<fstream>
#include<string>
using namespace std;

int main(){
    ofstream file("order.txt");
    file<<"Order No:1"<<endl;
    file<<"List of items: Cha,Fried rice"<<endl;
    file<<"Unit price of items: 50,300"<<endl;
    file<<"Summative Price:350"<<endl;
    file.close();

    ifstream readFile("order.txt");
    string order;
    while (getline(readFile,order))
    {
        cout<<order<<endl;
    }
    readFile.close();

    return 0;
}