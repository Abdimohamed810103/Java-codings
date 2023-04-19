package org.example.strategy;

public class Send {
    private int totalAmount;

    @Override
    public String toString() {
        return "Send{" +
                "totalAmount=" + totalAmount +
                '}';
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Send(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
