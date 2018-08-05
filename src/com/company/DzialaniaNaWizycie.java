package com.company;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DzialaniaNaWizycie {
    public static void dodajWizyte(List<Pacjent> listaPacjent, List<Lekarz> listaLekarz, Queue<Wizyta> kolejkaWizyt){
        System.out.println("3.1 Podaj pesel pacjenta z poniższej listy:");
        for(Pacjent pacjent : listaPacjent){
            System.out.println(pacjent);
        }
        Scanner scannerWizyta = new Scanner(System.in);
        String odczytanyPeselPacjenta = scannerWizyta.nextLine();
        Pacjent umawianyPacjent = null;

        for(Pacjent pacjent : listaPacjent){
            if(pacjent.getPesel().equals(odczytanyPeselPacjenta)){
                umawianyPacjent=pacjent;
                break;
            }
        }
        System.out.println("Umawiasz pacjenta: " + umawianyPacjent.toString());

        System.out.println("3.2 Podaj pesel lekarza z poniższej listy:");
        for(Lekarz lekarz : listaLekarz){
            System.out.println(lekarz);
        }
        String odczytanyPeselLekarza = scannerWizyta.nextLine();
        Lekarz umawianyLekarz = null;
        for(Lekarz lekarz : listaLekarz){
            if(lekarz.getPesel().equals(odczytanyPeselLekarza)){
                umawianyLekarz=lekarz;
                break;
            }
        }
        System.out.println("Umawiasz się do lekarza: " + umawianyLekarz.toString());

        kolejkaWizyt.add(new Wizyta(umawianyPacjent, umawianyLekarz));
        System.out.println("Wizyta umówiona");
    }

    public static void wyswietlKolejkeWizyt(Queue<Wizyta> kolejkaWizyt){
        for(Wizyta wizyta: kolejkaWizyt){
            System.out.println(wizyta.toString());
        }
    }
}
