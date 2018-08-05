package com.company;

import java.util.List;
import java.util.Scanner;

import static com.company.Specjalizacja.*;

public class DzialaniaNaLekarzu {
    public static void dodajLekarza(List<Lekarz> listaLekarz){

        Scanner scannerLekarz = new Scanner(System.in);
        System.out.println("2.1. Podaj imię lekarza:");
        String imie = scannerLekarz.nextLine();

        System.out.println("2.2. Podaj nazwisko lekarza:");
        String nazwisko = scannerLekarz.nextLine();

        System.out.println("2.3. Podaj pesel lekarza:");
        String pesel = scannerLekarz.nextLine();

        System.out.println("2.4.1. Podaj adres lekarza - miasto:");
        String miasto = scannerLekarz.nextLine();

        System.out.println("2.4.2. Podaj adres lekarza - ulica:");
        String ulica = scannerLekarz.nextLine();

        System.out.println("2.4.3. Podaj adres lekarza - numer domu:");
        String numerDomu = scannerLekarz.nextLine();

        System.out.println("2.5. Podaj id specjalizacji lekarza do wyboru masz:");
        for(Specjalizacja specjalizacja : Specjalizacja.values()){
            System.out.println(specjalizacja.getId()+ " "+specjalizacja);
        }
        int specjalizacjaId = scannerLekarz.nextInt();
        Specjalizacja wybranaSpecjalizacja = null;
        switch (specjalizacjaId){
            case 1:{
                wybranaSpecjalizacja=BRAK;
                break;
            }
            case 2:{
                wybranaSpecjalizacja=LARYNGOLOG;
                break;
            }
            case 3:{
                wybranaSpecjalizacja=PEDIATRA;
                break;
            }
            case 4:{
                wybranaSpecjalizacja=RODZINNY;
                break;
            }
            case 5:{
                wybranaSpecjalizacja=GERIATRA;
                break;
            }
        }

        Adres adres = new Adres(miasto, ulica, numerDomu);
        Lekarz dodawanyLekarz = new Lekarz(imie, nazwisko, pesel,adres, wybranaSpecjalizacja);
        listaLekarz.add(dodawanyLekarz);
        System.out.println("Lekarz został pomyślnie dodany");
    }
}
