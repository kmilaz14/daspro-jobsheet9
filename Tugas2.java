import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlhPesanan = input.nextInt();
        input.nextLine();

        String[] namaPesanan = new String[jmlhPesanan];
        double[] hargaPesanan = new double[jmlhPesanan];

        for (int i=0; i < jmlhPesanan; i++){
            System.out.print("Masukkan nama makanan/minuman ke-" + (i+1) + ": ");
            namaPesanan[i]=input.nextLine().toLowerCase();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine();
        }

        double totalBiaya = 0;
        for (int i=0; i<hargaPesanan.length; i++){
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("-----Daftar Pesanan-----");
        for (int i=0; i <jmlhPesanan; i++){
            System.out.println((i+1) + ". " + namaPesanan[i] + " - Rp. " + hargaPesanan[i]);
        }

        System.out.println("Total biaya: Rp. " + totalBiaya);
        System.out.println("------------------------");

    }
}
