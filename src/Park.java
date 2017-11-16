import java.util.Scanner;

public class Park {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int s = 12345;

    	System.out.println("WELCOME TO THE BANK OF MITCHELL");
    	System.out.print("ENTER YOUR PIN :");

    	int i = sc.nextInt();
    	while(i != s){
    		System.out.println("INCORRECT PIN.TRY AGAIN.");
    		System.out.print("ENTER YOUR PIN :");

    		int d = sc.nextInt();
    		i = d;

    }
    
    	System.out.println("PIN ACCEPTED.YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    	sc.close();

    }

}




