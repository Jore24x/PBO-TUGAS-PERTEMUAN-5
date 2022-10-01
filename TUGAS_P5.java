import java.util.Scanner;

public class TUGAS_P5 {
Scanner sc = new Scanner(System.in);

    private String menu , menu2 ;
    private int alas , tinggi , jari2   ;
    private double luas , phi ;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public void loop(){
        menu();
        menu2();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("pilih luas yang ingin di cari (lingkaran/segitiga): ");
        menu = sc.nextLine().toLowerCase();

        if (menu.equals("lingkaran")) {
            luasLingkaran();
        }
        else if (menu.equals("segitiga")) {
            luasSegitiga();

        }
        else {
            System.out.println("menu yang anda pilih invalid");
            menu();
        }


    }

    public void menu2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Apakah anda ingin menginput lagi? (y/n): ");
        menu2 = sc.nextLine().toLowerCase();

        if (menu2.equals("y")) {
            loop();
        }
        else if (menu2.equals("n")) {
            System.out.println("Have a good day! ");

        }
        else {
            System.out.println("Input salah");
            System.out.println("");
            menu2();
        }


    }


    public void luasLingkaran(){
        this.phi = 3.14;
        System.out.print("Jari-jari : ");
        this.jari2 = sc.nextInt();
        System.out.println("Phi = " + this.phi);
        this.luas = this.jari2 * this.jari2 * this.phi;
        System.out.print("Luas lingkaran = " + this.luas);

    }
    public void luasSegitiga(){
        System.out.print("alas : ");
        this.alas = sc.nextInt();
        System.out.print("Tinggi : ");
        this.tinggi = sc.nextInt();

        this.luas = this.alas * this.tinggi * 0.5;
        System.out.print("Luas = " + this.luas);

    }

}

class mencariLuas {
    


    

    public static void main(String[] args) {
        TUGAS_P5 luas = new TUGAS_P5();
        luas.loop();


    }

    
    }


