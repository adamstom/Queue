package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Zadanie nr 1");
//        Queue<Integer> queue= new LinkedList<>();
//        Random random = new Random();
//        for(int i=0; i<20; i++){
//            queue.add(random.nextInt(99)+1);
//        }
//        System.out.println("Wyświetlam całą kolejkę");
//        for (Integer liczbaZListy : queue){
//            System.out.println(liczbaZListy);
//        }
//        System.out.println("Koniec wyświetlania kolejki");
//        System.out.println("Rozmiar listy: "+queue.size());
//        System.out.println(queue.peek());
//        ((LinkedList<Integer>) queue).removeFirst();
//        System.out.println(queue.peek());
//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }

        System.out.println("Zadanie 2");
        List<Pacjent> listaPacjent= new ArrayList<>();
        List<Lekarz> listaLekarz= new ArrayList<>();
        Queue<Wizyta> kolejkaWizyt= new LinkedList<>();

        System.out.println("Wczyuję dane startowe");
        DaneWejsciowe.wczytajDanePoczatkowePacjent(listaPacjent);
        DaneWejsciowe.wczytajDanePoczatkoweLekarz(listaLekarz);

        Scanner scannerMenu = new Scanner(System.in);
        String wybraneMenu;
        do{
            Menu.rysujMenu();
            wybraneMenu = scannerMenu.nextLine();
            switch (wybraneMenu){
                case "1":{
                    System.out.println("Wybrano 1 dodawanie pacjenta");
                    DzialaniaNaPacjencie.dodajPacjenta(listaPacjent);
                    System.out.println("Wyświetlam liste pacjętów");
                    System.out.println(listaPacjent);
                    break;
                }
                case "2":{
                    System.out.println("Wybrano 2 dodawanie lekarza");
                    DzialaniaNaLekarzu.dodajLekarza(listaLekarz);
                    System.out.println("Wyświetlam liste lekarzy");
                    System.out.println(listaLekarz);
                    break;
                }
                case "3":{
                    System.out.println("Wybrano 3 umówienie wizyty");
                    DzialaniaNaWizycie.dodajWizyte(listaPacjent, listaLekarz, kolejkaWizyt);
                    break;
                }
                case "4":{
                    System.out.println("Wybrano 4 wyświetlenie kolejki wizyt");
                    DzialaniaNaWizycie.wyswietlKolejkeWizyt(kolejkaWizyt);
                    break;
                }
            }
        }while(!wybraneMenu.equals("END"));
    }
}
