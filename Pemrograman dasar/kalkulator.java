public class kalkulator{

public static void main(String [] args){

int x = 44;
int y = 14;
int hasil;

System.out.println("angka pertama = " + x);
System.out.println("angka kedua = " + y);

hasil = x + y;
System.out.println("hasil penambahan = " + hasil);

hasil = x / y;
System.out.println("hasil pembagian menggunakan int = " + hasil);

double Hasil = (double) x / y;
System.out.println("hasil pembagian double = " + Hasil);

hasil = x * y;
System.out.println("hasil perkalian = " + hasil);

hasil = x - y;
System.out.println("hasil pengurangan = " + hasil);

hasil = x % y;
System.out.println("hasil modulus = " + hasil);
}
}
