package soal2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hitung_bangun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double panjang, lebar, tinggi;
        double hasil_luas, volume;
        System.out.println("===================");
        System.out.println("Input data Balok");
        System.out.println("===================");
        System.out.print("Inputkan panjang balok : ");
        panjang = Double.parseDouble(br.readLine());
        if (panjang < 0){
            System.out.println("Inputan harus bilangan positif");
            System.exit(0);
        }
        System.out.print("Inputkan lebar balok : ");
        lebar = Double.parseDouble(br.readLine());
        if (lebar < 0){
            System.out.println("Inputan harus bilangan positif");
            System.exit(0);
        }
        System.out.print("Inputkan tinggi balok : ");
        tinggi = Double.parseDouble(br.readLine());
        if (tinggi < 0){
            System.out.println("Inputan harus bilangan positif");
            System.exit(0);
        }
        System.out.println("===================");
        System.out.println("1. Hitung luas balok");
        System.out.println("2. Hitung volume balok");
        System.out.println("Pilihan anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1 -> {
                hasil_luas = (panjang * lebar) + (panjang * tinggi) + (lebar * tinggi);
                hasil_luas = hasil_luas * 2;
                System.out.println("Luas permukaan balok : " + hasil_luas + " cm");
            }
            case 2 -> {
                volume = panjang * lebar * tinggi;
                System.out.println("volume balok : " + volume + " cm");
            }
        }

    }
}
