
public class Armstrong {
	public static void main(String args[]) {
		int num=371;
		int x,temp;
		int sum=0;
		x=num;
		while(x!=0) {
			temp=x%10;
			sum=sum+(temp*temp*temp);
			x/=10;
		}
		if (sum==num)
			System.out.println(num+"is a Armstrong num");
		else
			System.out.println(num+"is not a Armstrong num");
		
	}

}
