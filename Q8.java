import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		boolean out = false ;
		String condi = "";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice ");
			String answer=sc.nextLine();
			
			
			
			switch(answer) {
			case "a":
				System.out.println("Incorrect!");
				out=false;
				break;
				
			case "b":
				System.out.println("Incorrect!");
				out=false;
				break;
				
			case "c":
				System.out.println("Correct!");
				out=true;
				break;
				
			case "d":
				System.out.println("Incorrect!");
				out=false;
				break;
				
			default :
				System.out.println("Incorrect your choice!");
				out=false;
				break;
			}
			if(!out) {
				System.out.println("Again? press y to continue.");
				condi=sc.nextLine();
			}	
			
		}

}



