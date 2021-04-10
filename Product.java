
package inventory1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Product {
    Scanner run = new Scanner(System.in);
    int semua;

    int[] kodebarang = new int[50];
    int[] harga = new int[50];
    int[] stok = new int[50];
    int[] nilai = new int[50];
    String[] nama = new String[50];

    public Product(){

    }
    public void masukkanData(){
        try{
            for(int i=0;i < semua;i++){
                System.out.println("Produk nomor"+(i+1));
                System.out.println("Nama produk \t \ttekan 0 jika tidak jadi");

                run.nextLine();
                kodebarang[i]=i+1;
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }

                System.out.println("Harga produk : ");
                harga[i]= run.nextInt();
                System.out.println("Stok produk : ");
                stok[i]= run.nextInt();
                nilai[i]=stok[i]*harga[i];
            }
        }catch (InputMismatchException e){
            System.out.println("Nomer dimasukkan harus angka ");
            run.nextLine();
            menu();
        }
    }
    public void menu(){
        do{
            System.out.println("Masukkan nomer produk : ");
            semua = run.nextInt();

            if (semua <= 0){
                System.out.println("Inputan lebih dari 0");
            }else {
                masukkanData();
            }
        }while (semua <= 0);
    }
    public void getnilaidata(){
        for (int i =0; i < semua; i++){
            System.out.println("Nomor produk : "+kodebarang[i]);
            System.out.println("Nama produk : "+ nama[i]);
            System.out.println("Harga produk : "+harga[i]);
            System.out.println("Stok produk : "+stok[i]);
            System.out.println("Nilai produk : "+nilai[i]);
        }
    }
}
