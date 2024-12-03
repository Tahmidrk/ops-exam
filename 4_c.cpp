#include <iostream>
using namespace std;

class Animal {
public:
    Animal() {
        cout << "Animal Constructor" << endl;
    }
    ~Animal() {
        cout << "Animal Destructor" << endl;
    }
};

class Tiger : public Animal {
public:
    Tiger() {
        cout << "Tiger Constructor" << endl;
    }
    ~Tiger() {
        cout << "Tiger Destructor" << endl;
    }
};

int main() {
    Tiger t;  // Create an object of class Tiger
    Animal a; // Create an object of class Animal
    return 0; // Objects are destroyed as they go out of scope
}
