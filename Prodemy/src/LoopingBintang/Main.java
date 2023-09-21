package LoopingBintang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah bintang yang akan dicetak : ");
        int jumlahBintang = input.nextInt();

        for(int i = 0; i < jumlahBintang; i++) {
            for(int j = 0; j < jumlahBintang; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 0; i < jumlahBintang; i++) {
            for(int j = 0; j < jumlahBintang; j++) {
                System.out.print("* ");
                if( i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 0; i < jumlahBintang; i++) {
            for(int j = 0; j < jumlahBintang; j++) {
                System.out.print("* ");
                if( i + j == jumlahBintang - 1){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 0; i < jumlahBintang; i++) {
            for(int j = 0; j < jumlahBintang; j++) {
                System.out.print("* ");
                if( i == j){
                    break;
                } else if (i + j == jumlahBintang - 1){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
