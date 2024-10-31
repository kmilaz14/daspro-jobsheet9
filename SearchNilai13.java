import java.util.Scanner;

public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlhNilai = sc.nextInt();
        int[] nilaiMhs = new int[jmlhNilai];

        for (int i = 0; i< jmlhNilai; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i]=sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int i=0;
        while (i < jmlhNilai){
            if (nilaiMhs[i] == key) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i+1));
                break;
            }
            i++;
        }
        if (i == jmlhNilai) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
