
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Core
        int price = 0, total = 0,payment = 0,initialPayment=0,
              //looping purposes
                j=0, q = 0,a=1,
            //Arrays//
                total1[] = new int[3],items[]=new int[3],quantity [] =new int[3] ;

        double money=0,payment1=0;
        String order ="",choice,item [] = new String[3];
        boolean loop = true;
        while(true)
        {
           System.out.print("Enter your name: ");
            String name = input.next();

            do
            {
                System.out.println("Welcome to Tab's Coffee Shop Mr./Ms." + name +"\n");
                System.out.println("Coffee Menu ");
                System.out.println("A.Espresso P50 \nB.Cappucinno P65 \nC.Latte  P100\n");

                for(int i = 0;i<1;i++)
                {
                    System.out.print("Select your order Mr." + name + ": ");
                    order = input.next();
                    switch(order)
                    {
                        case "A":case"a":
                        System.out.println("\nYou ordered Espresso");
                        price=50;
                        item[0]="Espresso";
                        items[0] = 1;
                        q=0;
                        break;
                        case "B":case"b":
                        System.out.println("\nYou ordered Cappucinno");
                        price=65;
                        item[1]="Cappucinno";
                        items[1]= 1;
                        q=1;
                        break;
                        case "C":case"c":
                        System.out.println("\nYou ordered Latte");
                        price=100;
                        item[2]="Latte";
                        items[2] = 1;
                        q=2;
                        break;
                        default:
                            System.out.println("\nNot in the list");
                            i--;
                            input.nextLine();
                    }
                }
                do
                {
                    System.out.print("Quantity:");
                    if(input.hasNextInt())
                    {
                        quantity[q] = input.nextInt();
                        total1[q] =price *quantity[q];
                        total = price * quantity[q];
                        initialPayment += total;
                        payment1 = initialPayment;
                            break;
                    }else
                    {
                        System.out.println("Invalid Input");
                        loop = false;
                        input.next();
                    }

                }while(loop==false);
                System.out.println("\nInitial Payment: " + initialPayment);
                do
                {
                    System.out.print("Do you want to order again? y/n: " );
                    choice = input.next();
                    System.out.println();
                    if(choice.equalsIgnoreCase("y"))
                    {
                        q=0;
                        break;
                    }else if(choice.equalsIgnoreCase("n"))
                    {
                        break;
                    }
                }while(!choice.equalsIgnoreCase("n"));
            }while(choice.equalsIgnoreCase("y"));

            System.out.println("Total Payment: " + initialPayment);
            do
            {
                do
                {
                    System.out.print("Enter money:");
                    if(input.hasNextInt())
                    {
                        payment = input.nextInt();
                        money=payment;
                    }else
                    {
                        System.out.println("Invalid input");
                        payment=0;
                        input.next();
                    }
                }while(payment==0);
                if(payment<initialPayment)
                {
                    System.out.println("Insufficient Money");

                }
            }while(payment<initialPayment);

            double change = payment - initialPayment;
            System.out.println("------------------------------------------------");
            System.out.println("                 Receipt no."+a);

            System.out.println("    Items         Qty         Price        Total");
                if (items[0] == 1)
                {
                    System.out.println( j+1+"." + item[0]+"         "+ quantity[0] + "          P50" +"          P"+total1[0]);
                    j++;
                }
                if (items[1] == 1) {
                    System.out.println( j+1+"." + item[1]+"       "+ quantity[1] + "          P65" +"          P"+total1[1]);
                    j++;
                }
                if (items[2] == 1) {
                    System.out.println(j + 1 + "." + item[2] + "            " + quantity[2] + "          P100" + "         P" + total1[2]);
                }
            System.out.println("------------------------------------------------");
            System.out.println("Total                                      P"+payment1);
            System.out.println("Money                                      P"+money);
            System.out.println("Change                                     P"+change+"\n");
            System.out.println("             Thank you for buying \n               Tab's Coffee Shop");
            System.out.println("************************************************");
            initialPayment =0; j=0;
            item[0] = null;
            item[1] = null;
            item[2] = null;
            items[0]=0;
            items[1]=0;
            items[2]=0;
            q=0;
            a++;
        }
    }
}