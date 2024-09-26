package com.april17.MultiThreadingcorrectcode;

class PetrolPump {
    public synchronized void refillCar(String carName) {
        System.out.println(carName + " started refilling...");
        try {
            Thread.sleep(1000); // Simulate refilling time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(carName + " completed refilling!");
    }
}

class Car implements Runnable {
    private String name;
    private PetrolPump petrolPump;

    public Car(String name, PetrolPump petrolPump) {
        this.name = name;
        this.petrolPump = petrolPump;
    }

    @Override
    public void run() {
        petrolPump.refillCar(name);
    }
}

public class PetrolPumpSimulation {
    public static void main(String[] args) {
        PetrolPump petrolPump = new PetrolPump();

        Car[] cars = new Car[5];
        Thread[] carThreads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            cars[i] = new Car("Car " + (i + 1), petrolPump);
            carThreads[i] = new Thread(cars[i]);
            carThreads[i].start();
        } 

        for (int i = 0; i < 5; i++) {
            try {
                carThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
