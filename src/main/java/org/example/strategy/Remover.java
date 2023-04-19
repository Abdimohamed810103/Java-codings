package org.example.strategy;

public class Remover {
   public static String removeWhiteSpace(String s, RemoverInterface removerInterface){
       return removerInterface.removeWhiteSpace(s);
   }
   public static boolean checkIflimitIsReached(Send amount, LimitLoan loan){
       return loan.reachedTheLimit(amount);
   }
}
