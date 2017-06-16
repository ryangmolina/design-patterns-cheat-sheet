package com.designpatterns.creational.builder;

/**
 * To avoid multiple parameters in Constructor
 */
public class Cake {

    private double sugar;
    private double butter;
    private double milk;

    public static class CakeBuilder {
        private double sugar;
        private double butter;
        private double milk;

        public CakeBuilder sugar(double sugar) {
            this.sugar = sugar;
            return this;
        }

        public CakeBuilder butter(double butter) {
            this.butter = butter;
            return this;
        }

        public CakeBuilder milk(double milk) {
            this.milk = milk;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }


    private Cake(CakeBuilder builder) {
        this.sugar = builder.sugar;
        this.milk = builder.milk;
        this.butter = builder.butter;
    }

    @Override
    public String toString() {
        return String.format("Cake sugar: %f milk: %f butter: %f", sugar, milk, butter);
    }
}
