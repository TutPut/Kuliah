import java.util.Scanner;
public class StringExample{

	public static void main(String [] args){

		String password, pass;
		int banding;
		Scanner userinput=new Scanner(System.in);
		System.out.println("masukan password : ");
		password = userinput.next();
		banding=password.length();
		pass=password.toUpperCase();
		if(banding>=8){
			System.out.println("aturan 1. Panjang minimal 8");
		}
		if (!password.equals(password.toLowerCase())){
		    System.out.println("Aturan 2. password mengandung huruf besar");
		}
		if (!password.replaceAll("[0-9]", "").equals(password)) {
			System.out.println("Aturan 3. password mengandung angka");
		}
		if (!password.replaceAll("[a-zA-Z0-9]", "").equals(password)) {
			System.out.println("Aturan 4. password mengandung simbol");
		}
	}
}