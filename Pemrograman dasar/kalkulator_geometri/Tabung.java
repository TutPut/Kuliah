package kalkulator_geometri;
public class Tabung {
private int r;
private int t;
private double π;
private double V;
public Tabung() {
r = 0;
t = 0;
π = 0;
V = 0;
}
public Tabung(int r, int t, double π) {
this.r=r;
this.t=t;
this.π=π;
this.V=π*r*r*t;
}
public int getr(){
return r;
}
public void setr(int r){
this.r=r;
}
public int gett(){
return t;
}
public double getπ() {
return π;
}
public void setπ(double π) {
this.π = π;
}
public double getL(){
return V=π*r*r*t;
}
public void setL(double L) {
this.V = V;
}
public String toString () {
return "jari jari lingkaran ="+r+"\nTinggi tabung = "+ t+"\nVolume Tabung = "+V;
}
}
