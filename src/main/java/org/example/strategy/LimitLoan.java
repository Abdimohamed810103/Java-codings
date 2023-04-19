package org.example.strategy;

public interface LimitLoan {
    boolean reachedTheLimit(Send amount);
}
