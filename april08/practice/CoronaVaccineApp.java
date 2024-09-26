package com.april08.practice;

class VaccineEligibility {
    private int age;
    private boolean hasHealthCondition;

    public VaccineEligibility(int age, boolean hasHealthCondition) {
        this.age = age;
        this.hasHealthCondition = hasHealthCondition;
    }

    public boolean isEligible() {
        return (age >= 18 && (age < 60 || hasHealthCondition));
    }
}

class DoseBooking {
    private boolean booked;

    public void bookDose() {
        if (booked) {
            throw new RuntimeException("Dose already booked.");
        } else {
            booked = true;
        }
    }

    public boolean isDoseBooked() {
        return booked;
    }
}

class User {
    private String name;
    private VaccineEligibility eligibility;
    private DoseBooking doseBooking;

    public User(String name, int age, boolean hasHealthCondition) {
        this.name = name;
        this.eligibility = new VaccineEligibility(age, hasHealthCondition);
        this.doseBooking = new DoseBooking();
    }

    public boolean isEligible() {
        return eligibility.isEligible();
    }

    public void bookDose() {
        if (!isEligible()) {
            throw new RuntimeException("You are not eligible for the vaccine.");
        }
        doseBooking.bookDose();
        System.out.println("Dose booked successfully for " + name);
    }

    public boolean isDoseBooked() {
        return doseBooking.isDoseBooked();
    }
}

public class CoronaVaccineApp {
    public static void main(String[] args) {
        User user1 = new User("Ramesh", 25, false);
        User user2 = new User("Suresh", 17,false);

        Thread thread1 = new Thread(() -> {
            user1.bookDose();
        });

        Thread thread2 = new Thread(() -> {
            try {
                user2.bookDose();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        });

        thread1.start();
        thread2.start();
    }
}
