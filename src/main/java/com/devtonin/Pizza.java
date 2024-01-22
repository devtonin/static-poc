package com.devtonin;

public class Pizza {
    private static String cookedCount;
    private boolean isThinCrust;

    public static class PizzaSalesCounter {
        private static String orderedCount;
        public static String deliveredCount;

        PizzaSalesCounter() {
            System.out.println("Static field of enclosing class is " + Pizza.cookedCount);
            System.out.println("Static field of enclosing class is " + new Pizza().isThinCrust);
        }
    }

    Pizza () {
        System.out.println("Non private static field of static class is "
        + PizzaSalesCounter.deliveredCount); // null
      System.out.println("Private static field of static class is "
        + PizzaSalesCounter.orderedCount); //false
    }

    public static void main(String[] a) {
        new Pizza.PizzaSalesCounter();
 }
}
