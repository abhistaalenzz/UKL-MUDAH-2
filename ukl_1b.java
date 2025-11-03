import java.util.Scanner;

public class ukl_1b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("CEK BILANGAN GANJIL / GENAP");
        System.out.print("Masukkan Bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan= genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan=  ganjil.");
        }

        input.close();
}
}
