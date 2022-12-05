import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int tempNumber;
        int result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();
        tempNumber = number;
        while(tempNumber != 0) {
            result += tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.println( number + " sayısının basamak sayıları toplamı : " + result);
    }
}
