package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class FireStationRegister implements FireStation{
   private final List<FireObserver> fireObserverList = new ArrayList<>();
    @Override
    public void registerFireStation(FireObserver fo) {
        if (fo != null) {
            fireObserverList.add(fo);
        }
    }

    @Override
    public void notifyFireStation(String address) {
        if (address != null) {
            for (FireObserver f:fireObserverList) {
                f.fire(address);
            }
        }
    }
}
