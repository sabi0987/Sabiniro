
public class P3 {
	 public static void main(String args[]) {
		 int n=7;
		 for(int i=1;i<=n;i++)
		 {
			 int j;
			 for(j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 while (j<8) {
				 System.out.print("*");
				 j++;
			 }
			 System.out.println();
		 }
	 }

}
