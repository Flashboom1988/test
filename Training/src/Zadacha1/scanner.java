package Zadacha1;

import java.util.Locale;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one = scan.nextLine();
        String two = scan.nextLine();
        String three = scan.nextLine();

        System.out.println(three);
        System.out.println(two.toUpperCase());
        System.out.println(one.toLowerCase());
    }
}
