
package mobile;

public class MainClass {

   
    public static void main(String[] args) {
        // TODO code application logic here
       Mobile m1=new Mobile("Lamia","0187724354",50.00,"robi",false);
       m1.recharge(20);
       m1.callSomeone(5);
       m1.showInfo();
       System.out.println("---------------------------------------------");
       Mobile m2=new Mobile("Lamia","0187724354",50.00,"robi",true);
       m2.recharge(20);
       m2.callSomeone(5);
       m2.showInfo();
       System.out.println("---------------------------------------------");
       Mobile m3=new Mobile("amia","01238976435",5.00,"robi",false);
       m3.recharge(2);
       m3.callSomeone(15);
       m3.showInfo();
    }
    
}
