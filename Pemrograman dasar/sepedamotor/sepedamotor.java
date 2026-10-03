package sepedamotor;
public class sepedamotor {
private String merek;
private int full_bensin;
private String warna;
private int jumlah_roda;
public sepedamotor () {
merek="";
full_bensin=0;
warna="";
jumlah_roda=0;
}
public sepedamotor(String merek, int full_bensin, String warna, int jumlah_roda) {
this.merek=merek;
this.full_bensin=full_bensin;
this.warna=warna;
this.jumlah_roda=jumlah_roda;
}
public String getmerk() {
return merek;
}
public int full_bensin() {
return full_bensin;
}
public String getwarna() {
return warna;
}
public int getjumlah_roda() {
return jumlah_roda;
}
public void setmerek(String merek) {
this.merek=merek;
}
public void setfull_bensin(int full_bensin) {
this.full_bensin=full_bensin;
}
public void setwarna(String warna) {
this.warna=warna;
}
public void setjumlah_roda(int jumlah_roda) {
this.jumlah_roda=jumlah_roda;
}
public String toString() {
return "\nMerek = "+merek+"\nFull bensin = "+full_bensin+"\nWarna = "+warna+"\nJumlah roda = "+jumlah_roda;
}
}
