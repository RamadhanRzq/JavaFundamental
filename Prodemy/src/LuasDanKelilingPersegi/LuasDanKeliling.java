package LuasDanKelilingPersegi;

import java.util.Scanner;

public class LuasDanKeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang = ");
        int inputPanjang = input.nextInt();
        System.out.print("Masukkan Lebar = ");
        int inputLebar = input.nextInt();

        System.out.println("Luasnya adalah = "+luas(inputPanjang,inputLebar));
        System.out.println("Kelilingnya adalah = "+keliling(inputPanjang,inputLebar));
        input.close();
    }
    private static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
}
