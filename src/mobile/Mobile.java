
package mobile;


public class Mobile {
     private String mobileOwnerName="";
     private String mobileNumber="";
     private double mobileBalance=0.00;
     private String mobileOsName="";
     private boolean lock=false;
     
     public Mobile()
     {
         
     }
     public Mobile(String mobileOwnerName,String mobileNumber,double mobileBalance,String mobileOsName,boolean lock)
     {
         this.mobileOwnerName=mobileOwnerName;
         this.mobileNumber=mobileNumber;
         this.mobileBalance=mobileBalance;
         this.mobileOsName=mobileOsName;
         this.lock=lock;
     }
     
     public void showInfo()
     {
         System.out.println("Owner name: "+this.mobileOwnerName);
         System.out.println("mobile no: "+ this.mobileNumber);
         System.out.println("Balance: "+this.mobileBalance);
         System.out.println("Os name: "+this.mobileOsName);
         if(this.lock==true)
         {
             System.out.println("phone is lock");
         }
         else
         {
             System.out.println("phone is unlock");
         }
     }
     public void recharge(int amount)
     {
         if(this.lock==false)
         {
            this.mobileBalance+=amount;
            System.out.println("Balance after recharging "+this.mobileBalance);
         }
         else
         {
             System.out.println("can not recharge");
         }
     }
     public void callSomeone(int timeDuration)
     {
         
         if(this.lock==false)
         {
             if(this.mobileBalance>=timeDuration)
             {
                this.mobileBalance-=timeDuration;
                System.out.println("time duration "+timeDuration+"minutes. Current Balance"+this.mobileBalance);
             }
             else
             {
                 System.out.println("not enough balance");
             }
         }
         else
         {
             System.out.println("can not call");
         }
         }
         
     }
  

     

