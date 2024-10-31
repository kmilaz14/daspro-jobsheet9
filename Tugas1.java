import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai yang akan diinput: ");
        int jmlhNilai = sc.nextInt();

        int[] nilaiMhs = new int[jmlhNilai];
        int total = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for(int i=0; i<jmlhNilai; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            if (i==0) {
                nilaiTertinggi = nilaiMhs[i];
                nilaiTerendah = nilaiMhs[i];
            } else {
                if (nilaiMhs[i] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhs[i];
                }
                if (nilaiMhs[i] < nilaiTerendah) {
                    nilaiTerendah = nilaiMhs[i];
                }
            }
        }

        double rataRata = (double) total/jmlhNilai;

        System.out.println("Semua nilai yang telah dimasukkan:");

        for (int i=0; i< nilaiMhs.length; i++){
            System.out.println(nilaiMhs[i] + " ");
        }

        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

    }
}
