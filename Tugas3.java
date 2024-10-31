import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String key;

        System.out.print("Masukkan nama makananan yang ingin dicari: ");
        key = input.nextLine();

        boolean tersedia = false;

        for (int i=0; i<menu.length; i++){
            if (key.equalsIgnoreCase(menu[i])) {
                tersedia = true;
                break;
            }
        }

        if (tersedia) {
            System.out.println("Makanan " + key + " tersedia di menu.");
        } else {
            System.out.println("Makanan " + key + " tidak ada di menu.");
        }

    }
}