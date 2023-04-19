package org.example.observer;

public class Main {
    public static void main(String[] args) {
        FireStationRegister fireStationRegister = new FireStationRegister();
        fireStationRegister.registerFireStation((String adress)->{
            if (adress.contains("Angered")) {
                System.out.println("Fire alert: Waxaa lagaa rabaa Angered in aad ka gaarto sxb");
            }
        });
        fireStationRegister.registerFireStation((String adress)->{
            if (adress.contains("Hisingen")) {
                System.out.println("Fire alert: Waxaa lagaa rabaa Hisingen in aad ka gaarto sxb");
            }
        });

        fireStationRegister.notifyFireStation("Hisingen : Waxaa lagaa rabaa Hisingen in aad ka gaarto sxb");




    }
}
