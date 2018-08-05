package com.company;

import java.util.List;

import static com.company.Specjalizacja.GERIATRA;
import static com.company.Specjalizacja.LARYNGOLOG;
import static com.company.Specjalizacja.RODZINNY;

public class DaneWejsciowe {
    public static void wczytajDanePoczatkowePacjent(List<Pacjent> listaPacjent){

        Adres adres1 = new Adres("Szczecin","Wąska","7/3");
        Pacjent pacjent1 = new Pacjent("Tomek", "Kowalski","1", adres1);
        listaPacjent.add(pacjent1);

        Adres adres2 = new Adres("Szczecin","Azbestowa","5D");
        Pacjent pacjent2 = new Pacjent("Marek", "Nowak","2", adres2);
        listaPacjent.add(pacjent2);

        Adres adres3 = new Adres("Koszalin","Czeremchowa","21");
        Pacjent pacjent3 = new Pacjent("Danuta", "Zych","3", adres3);
        listaPacjent.add(pacjent3);

        Adres adres4 = new Adres("Szczecin","Kormoranów","2C/5");
        Pacjent pacjent4 = new Pacjent("Ania", "Tęcza","4", adres4);
        listaPacjent.add(pacjent4);
    }

    public static void wczytajDanePoczatkoweLekarz(List<Lekarz> listaLekarz) {

        Adres adres1 = new Adres("Szczecin", "Cwiartki", "3/4");
        Lekarz lekarz1 = new Lekarz("Halina","Kiepska","11",adres1,LARYNGOLOG);
        listaLekarz.add(lekarz1);

        Adres adres2 = new Adres("Szczecin", "Wątrobowa", "3U");
        Lekarz lekarz2 = new Lekarz("Helena","Paździoch","12",adres2,GERIATRA);
        listaLekarz.add(lekarz2);

        Adres adres3 = new Adres("Szczecin", "Plac Rodłą", "1A");
        Lekarz lekarz3 = new Lekarz("Arnold","Boczek","13",adres3,RODZINNY);
        listaLekarz.add(lekarz3);
    }
}
