import java.util.*;
public class game{
    public static void main(String args[])
    {
        Play p=new Play();
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println();
            System.out.println("ENTER YOUR CHOICE");
            System.out.println();
            System.out.println("1.Enter the game");
            System.out.println("2.Exit the game");
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:p.playgame();
                       break;
                case 2:System.exit(0);
                default:System.out.println("Wrong choice");

            }
        }
    }
}
class Play{
    void playgame()
    {
        Random ran=new Random();
        Scanner s=new Scanner(System.in);
        int num=ran.nextInt(100);
        for(int i=0;i<5;i++)
        {
            System.out.println("GUESS A NUMBER");
            int r1=s.nextInt();
            if(r1==num)
            {
                System.out.println("HURRY!! YOU ARE CORRECT");
                break;
            }
            else if(r1<num)
            {
                System.out.println("Too Low");
            }
            else{
                 System.out.println("TOO HIGH");
            }
        }
        System.out.println("The correct answer is "+num);
    }
}