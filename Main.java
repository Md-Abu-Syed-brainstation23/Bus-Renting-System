import java.util.Scanner;

public class Main{
    //drive method2
    public static void main(String [] l)
     {
        
        {System.out.println("Please choose a type of ticket:\n");
        System.out.println("1.Regular Ticket");
        System.out.println("2.Student Ticket");
        System.out.println("3.Vip Ticket");
        Scanner input = new Scanner(System.in);
        int choice=input.nextInt();
        input.nextLine(); // add this line to consume the newline character
        System.out.println("Enter passenger name:");
        String passName=input.nextLine();
        System.out.println("Enter seat number:");
        String seatNum=input.nextLine();
        switch(choice)
         {
            case 2:
            System.out.println("Enter discount percentage(%):");
            double discount=input.nextDouble();
            StudentTicket st=new StudentTicket(seatNum, passName,discount);
            break;
            case 3:
            System.out.println("Wifi service available?(true/false):");
            String ws=input.nextLine();
            System.out.println("TV available?(true/false):");
            String ts=input.nextLine();
            VipTicket vt=new VipTicket(seatNum,passName,Boolean.parseBoolean(ws),Boolean.parseBoolean(ts));
            break;


            
         }
         System.out.println("Ticket booking done successfully!");
         input.close();
        }

     } 
}
