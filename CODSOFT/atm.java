import java.util.*;
class atm
{
    String name;
    int AccountNo;
    String AccountType;
    int balance=0;                 
    public static void main(String args[])
    {
           Account a=new Account() ;
            Scanner s=new Scanner(System.in);
            System.out.println("ENTER THE NAME OF DEPOSITER");
            a.name=s.next();
            System.out.println("ENTER THE ACCOUNT NUMBER");
            a.AccountNo=s.nextInt();
            System.out.println("ENTER THE ACCOUNT TYPE");
            System.out.println("1.savings 2.current ");
            int ch=s.nextInt();
           while(true)
           {
            switch(ch)
             {
                    case 1:a.savings_account();break;
                    case 2:a.current_account();break;
                    default: System.out.println("wrong choice");
              }
           }
            
     }
      void savings_account()
      {
                  Scanner s=new Scanner(System.in);
                  System.out.println("ENTER YOUR CHOICE");
                  System.out.println("1.deposite");
                  System.out.println("2.withdraw");
                  System.out.println("3.display");
                  System.out.println("4.exit");
                  int b=s.nextInt();
                  switch(b)
                  {
                        case 1:deposite();break;
                        case 2:withdraw();break;
                        case 3:display();break;
                        case 4:System.exit(0);
                        default:System.out.println("wrong choice");
                  }
                  
       }
       void current_account()
       {
             System.out.println("CANNOT WITHDRAW FROM CURRENT ACCOUNT");
        }
       void deposite()
       {
             Scanner s=new Scanner(System.in);
              System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
              int amount=s.nextInt();
              balance=balance+amount;
        }
      void withdraw()
       {
             Scanner s=new Scanner(System.in);
             if(balance<=0)
             {
                      System.out.println("YOUR ACCOUNT BALANCE IS NOT SUFFICIENT");
              }
              else
              {
                      System.out.println("enter the amount to be withdrawn");
                      int ammout_withdrawn=s.nextInt();
                      balance=balance-ammout_withdrawn;
               }
       }
       void display()
        {

            System.out.println("the total balance is"+balance);
        }   
}