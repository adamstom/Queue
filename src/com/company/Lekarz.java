package com.company;

public class Lekarz extends Pacjent{
    private Specjalizacja specjalizacja;

    public Lekarz(String imie, String nazwisko, String pesel, Adres adres, Specjalizacja specjalizacja){
        super(imie, nazwisko, pesel, adres);
        this.specjalizacja=specjalizacja;
    }

    public Specjalizacja getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(Specjalizacja specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
//        return "Lekarz{" +Pacjent+
//                "specjalizacja=" + specjalizacja +
//                '}';
        return "Lekarz{" +
                "imie='" + this.getImie() + '\'' +
                ", nazwisko='" + this.getNazwisko() + '\'' +
                ", pesel=" + this.getPesel() +
                ", adres=" + this.getAdres() +
                "specjalizacja=" + specjalizacja +
                '}';
    }
}
