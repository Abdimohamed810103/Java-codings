package org.example.DecoraterPattern;

public class Nuts extends CakeDecorater{
    public Nuts(Cake cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithNuts();
    }

    private String decorateWithNuts() {
        return "with nuts";
    }


}
