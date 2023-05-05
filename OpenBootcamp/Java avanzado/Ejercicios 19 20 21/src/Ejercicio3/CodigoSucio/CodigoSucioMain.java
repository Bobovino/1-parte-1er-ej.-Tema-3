package Ejercicio3.CodigoSucio;

import java.util.ArrayList;
import java.util.Scanner;

public class CodigoSucioMain {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some words:");
        for (int i = 0; i < 5; i++) {
            words.add(scanner.nextLine());
        }

        System.out.println("The words you entered are:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
