package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Instrument> instruments = new ArrayList<>();

        while (true) {
            System.out.println("\n1) Lisää soitin");
            System.out.println("2) Listaa soittimet");
            System.out.println("3) Viritä kielisoittimet");
            System.out.println("4) Soita rumpuja");
            System.out.println("0) Lopeta ohjelma");
            System.out.print("Valinta: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut: ");
                    String instrumentType = scanner.nextLine();
                    
                    if (!instrumentType.matches("[123]")) {
                        System.out.println("Virheellinen soitinvalinta.");
                        break;
                    }

                    System.out.print("Anna valmistajan nimi: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Anna hinta euroina: ");

                    int price;
                    try {
                        price = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Virheellinen syöte, anna numero.");
                        break;
                    }

                    switch (instrumentType) {
                        case "1":
                            instruments.add(new Guitar(manufacturer, price));
                            break;
                        case "2":
                            instruments.add(new Violin(manufacturer, price));
                            break;
                        case "3":
                            instruments.add(new Drum(manufacturer, price));
                            break;
                    }
                    System.out.println("Soitin lisätty listaan!");
                    break;

                case "2":
                    if (instruments.isEmpty()) {
                        System.out.println("Ei lisättyjä soittimia.");
                    } else {
                        for (Instrument instrument : instruments) {
                            System.out.println(instrument.getDetails());
                        }
                    }
                    break;
                
                case "3":
                    for (Instrument instrument : instruments) {
                        if (instrument instanceof StringInstrument) {
                            ((StringInstrument) instrument).tune();
                        }
                    }
                    break;
                
                case "4":
                    for (Instrument instrument : instruments) {
                        if (instrument instanceof Drum) {
                            ((Drum) instrument).playBeat();
                        }
                    }
                    break;
                
                case "0":
                    System.out.println("Kiitos ohjelman käytöstä.");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Virheellinen valinta.");
                    break;
            }
        }
    }
}
