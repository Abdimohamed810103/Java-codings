package org.example.observer;

public interface FireStation {
    void registerFireStation(FireObserver fo);
    void notifyFireStation(String address);
}
