import java.sql.SQLOutput;

class Test{
    int a,b;
    Test(int a,int b){
        this.a=a;
        this.b=b;
    }
    void math(Test o){
        o.a*=2;
        o.b/=2;
    }
}
public class PassObjRef{
    public static void main(String[] args) {
        Test ob=new Test(15,20);
        System.out.println("ob.a & ob.b before call= "+ob.a+" "+ob.b);
        ob.math(ob);
        System.out.println("ob.a & ob.b after call= "+ob.a+" "+ob.b);

    }
}
