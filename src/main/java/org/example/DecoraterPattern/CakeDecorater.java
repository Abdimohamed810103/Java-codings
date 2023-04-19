package org.example.DecoraterPattern;

public class CakeDecorater implements Cake{

    private final Cake cake;

    public CakeDecorater(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String decorate() {
        return cake.decorate();
    }
}
