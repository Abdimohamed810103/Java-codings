package org.example.decoratorLamda;



public class Cake {
    private final String decorator;

    public Cake(String decorator) {
        this.decorator = decorator;
    }

    public Cake decorate(String decorator){
         return new Cake(getDecorations() + decorator);
    }

    public String getDecorations() {
    return decorator;
    }
}
