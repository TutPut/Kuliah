import java.util.Scanner;

public class toko_gitar {

	public static void main(String[] args) {

		Scanner input;
		int masuk;

		System.out.println("1. gitar akustik");
		System.out.println("2. gitar klasik");
		System.out.println("3. gitar listrik");
		System.out.println("4. bass");
		System.out.println("5. gk jadi beli");
		System.out.print("Pilih 1-5: ");
		input =new Scanner(System.in);
		masuk = input.nextInt();

		if (masuk == 1) {
			
			System.out.println("gitar akustik");
			System.out.println("harga : Rp500.000");

		}else if (masuk == 2){

			System.out.println("gitar klasik");
			System.out.println("harga : Rp700.000");

		}else if(masuk == 3) {

			System.out.println("gitar listrik");
			System.out.println("harga : Rp7.000.000");

		}else if (masuk == 4) {
		
			System.out.println("bass");
			System.out.println("harga : Rp2.000.000");

		}else {
			System.out.println("yahh gk jd beli T_T");

		}
	}
}