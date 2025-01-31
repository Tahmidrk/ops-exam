#include<iostream>
#include<string>
using namespace std;

class ticket{
    private:
    int quantity;
    int seat[10];
    string coachNo;
    string time;
    string date;
    double price;

    public:
    ticket(){
        cout<<"Enter details of your reservation:"<<endl;
        cout<<"Enter quantity:";
        cin>>quantity;
        cout<<"Enter seat numbers:";
        for (int i = 0; i < quantity; i++)
        {
            cin>>seat[i];
        }
        cout<<"Enter coach(AC/General):";
        cin>>coachNo;
        cout<<"Enter time:";
        cin>>time;
        cout<<"Enter date:";
        cin>>date;
    }

        void display(){
            cout<<"Ticket details:"<<endl;
            cout<<"Quantity:"<<quantity<<endl;
            cout<<"Seat no:";
            for (int i = 0; i < quantity; i++)
            {
                cout<<seat[i]<<" ";
            }
            cout<<endl;
            cout<<"Coach:"<<coachNo<<endl;
            cout<<"Time:"<<time<<endl;
           cout<<"Date:"<<date<<endl;


        }
            double ticketprice(){
                if (coachNo=="AC")
                {
                    price=1000*quantity;
                }
                else{
                    price=500*quantity;
                }
                return price;
            }
            //save the details to a file
    void savetofile(){
        ofstream file("ticket.txt");
        file<<endl<<"Ticket details:";
        file<<"Quantity:"<<quantity<<endl;
        file<<"Seat no:";
        for (int i = 0; i < quantity; i++)
        {
            file<<seat[i]<<" ";
        }
        file<<endl;
        file<<"Coach:"<<coachNo<<endl;
        file<<"Date:"<<date<<endl;
        file<<"Time:"<<time<<endl;
        file<<"Price:"<<ticketprice()<<endl;
        file.close();

    }
    
    
};
int main(){
    ticket t;
    t.display();
    cout<<"Total price:"<<t.ticketprice()<<endl;
    t.savetofile();
    ifstream file("ticket.txt");
    string line;
    while (getline(file,line))
    {
        cout<<line<<endl;
    }
}
