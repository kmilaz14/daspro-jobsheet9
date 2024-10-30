import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jmlhMahasiswa];

        double ttlLulus = 0, ttlTdkLulus = 0;
        double jmlhLulus = 0, jmlhTidakLulus = 0;

        for (int i=0; i< jmlhMahasiswa; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) + " : ");
            nilaiMhs[i]=sc.nextInt();
        }
        
        for (int i=0; i<nilaiMhs.length; i++){
            if (nilaiMhs[i]>70) {
                ttlLulus += nilaiMhs[i];
                jmlhLulus++;
            } else {
                ttlTdkLulus += nilaiMhs[i];
                jmlhTidakLulus++;
            }
        }

        double rataLulus = jmlhLulus>0? ttlLulus/jmlhLulus : 0;
        double rataTdkLulus = jmlhTidakLulus>0? ttlTdkLulus/jmlhTidakLulus : 0;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
    }
}
