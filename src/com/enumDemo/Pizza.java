package com.enumDemo;

public class Pizza {
    PizzaStatus status;
    public enum PizzaStatus{
        ORDERED(5){
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY(2),
        DELIVERED(0);
        private int timeToDelivery;

        public boolean isOrdered() {return false;}

        public boolean isReady() {return false;}

        public boolean isDelivered(){return false;}
        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        PizzaStatus (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }
    }

    public static void main(String[] args) {
    }
}
