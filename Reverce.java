
public class Reverce {
	public static void main(String args[]) {
		String ABC="SABI NIRO";
		String reverce=" ";
		System.out.println("String is:"+ABC);
		int len=ABC.length();
		for(int i=len-1;i>=0;i--)
			reverce=reverce+ABC.charAt(i);
		{
			System.out.println("Reverce String is:"+reverce);
		}
	}

}
