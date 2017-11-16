import java.util.Scanner;

public class Daypark {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int s =12345;

    	System.out.println("WELCOME TO THE BANK OF MITCHELL");
     	System.out.print("ENTER YOUR PIN :");

     	int i = sc.nextInt();
     	System.out.println(i);
    while(i != s){
    	System.out.println("INCORRECT PIN.TRY AGAIN.");
    	System.out.print("ENTER YOUR PIN :");

    	Scanner sd = new Scanner(System.in);
    	int d = sc.nextInt();
    	i=d;

    }
    System.out.println("PIN ACCEPTED.YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");

    }



}




