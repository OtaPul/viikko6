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
            return;
        }

        System.out.println("Anna valmistajan nimi:");
        String manufacturer = scanner.nextLine();

        System.out.println("Anna hinta euroina:");
        if (!scanner.hasNextInt()) {
            System.out.println("Virheellinen hinta, anna numero.");
            scanner.next();
            return;
        }
        int price = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                instruments.add(new Guitar(manufacturer, price));
                break;
            case 2:
                instruments.add(new Violin(manufacturer, price));
                break;
            case 3:
                instruments.add(new Drum(manufacturer, price));
                break;
        }
        System.out.println("Soitin lisätty listaan!");
    }

    private static void listInstruments() {
        if (instruments.isEmpty()) {
            System.out.println("Ei lisättyjä soittimia.");
            return;
        }
        for (Instrument instrument : instruments) {
            System.out.println(instrument.getDetails());
        }
    }

    private static void tuneStringInstruments() {
        for (Instrument instrument : instruments) {
            if (instrument instanceof StringInstrument) {
                ((StringInstrument) instrument).tune();
            }
        }
    }

    private static void playDrums() {
        for (Instrument instrument : instruments) {
            if (instrument instanceof Drum) {
                ((Drum) instrument).playBeat();
            }
        }
    }
}

           
