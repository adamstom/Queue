package com.company;

import java.util.List;
import java.util.Scanner;

public class DzialaniaNaPacjencie {
    public static void dodajPacjenta(List<Pacjent> listaPacjent){

        Scanner scannerPacjent = new Scanner(System.in);
        System.out.println("1.1. Podaj imię pacjenta:");
        String imie = scannerPacjent.nextLine();

        System.out.println("1.2. Podaj nazwisko pacjenta:");
        String nazwisko = scannerPacjent.nextLine();

        System.out.println("1.3. Podaj pesel pacjenta:");
        String pesel = scannerPacjent.nextLine();

        System.out.println("1.4.1. Podaj adres pacjenta - miasto:");
        String miasto = scannerPacjent.nextLine();

        System.out.println("1.4.2. Podaj adres pacjenta - ulica:");
        String ulica = scannerPacjent.nextLine();

        System.out.println("1.4.3. Podaj adres pacjenta - numer domu:");
        String numerDomu = scannerPacjent.nextLine();

        Adres adres = new Adres(miasto, ulica, numerDomu);
        Pacjent pacjentDodawany = new Pacjent(imie, nazwisko, pesel, adres);
        listaPacjent.add(pacjentDodawany);
        System.out.println("Pacjent został pomyślnie dodany");
    }
}
