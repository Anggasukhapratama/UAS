package UAS;

import java.util.ArrayList;
import java.util.Scanner;

public class belanja {

    private String namabarang;
    private int hargabarang;
    private int jumlahbelanja;

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getHargabarang() {
        return hargabarang;
    }

    public void setHargabarang(int hargabarang) {
        this.hargabarang = hargabarang;
    }

    public int getJumlahbelanja() {
        return jumlahbelanja;
    }

    public void setJumlahbelanja(int jumlahbelanja) {
        this.jumlahbelanja = jumlahbelanja;


    }

    public belanja() {

    }

    public belanja(String nama, String harga, int belanja) {
        this.namabarang = namabarang;
        this.hargabarang = hargabarang;
        this.jumlahbelanja = jumlahbelanja;
    }



    void print() {
        System.out.println("nama barang : " + this.namabarang);
        System.out.println("harga barang: " + this.hargabarang);
        System.out.println("jumlah belanja      : " + this.jumlahbelanja);
    }


        public static void main(String[] args) {
            int jum = 4;
            ArrayList<belanja> p = new ArrayList<>();
            for (int index = 0; index < jum; index++) {
                belanja s = new belanja();
                Scanner sc = new Scanner(System.in);
                System.out.println("type item name = ");
                s.setNamabarang(sc.nextLine());
                System.out.println("type item price =");
                s.setHargabarang(sc.nextInt());
                System.out.println("type item QYT = ");
                s.setJumlahbelanja(sc.nextInt());
                p.add(s);
            }
            System.out.println(".....................................");
            System.out.println("total belanja :%60s", new belanja().Cetakinvoice(p));
        }


    }

