package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Instrument> instruments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1) Lisää soitin");
            System.out.println("2) Listaa soittimet");
            System.out.println("3) Viritä kielisoittimet");
            System.out.println("4) Soita rumpuja");
            System.out.println("0) Lopeta ohjelma");

            if (!scanner.hasNextInt()) {
                System.out.println("Virheellinen syöte, anna numero.");
                scanner.next(); // Tyhjennä virheellinen syöte
                continue;
            }
            int choice = scanner.nextInt();
            scanner.nextLine(); // Puhdista rivinvaihto

            switch (choice) {
                case 1:
                    addInstrument();
                    break;
                case 2:
                    listInstruments();
                    break;
                case 3:
                    tuneStringInstruments();
                    break;
                case 4:
                    playDrums();
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    return;
                default:
                    System.out.println("Virheellinen valinta.");
            }
        }
    }

    private static void addInstrument() {
        System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");

        if (!scanner.hasNextInt()) {
            System.out.println("Virheellinen syöte, anna numero.");
            scanner.next();
            return;
        }
        int type = scanner.nextInt();
        scanner.nextLine();

        if (type < 1 || type > 3) {
            System.out.println("Virheellinen soitinvalinta.");
           
