package com.april17.MultiThreadingcorrectcode;


class Patient extends Thread {
    private int id;

    public Patient(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Patient " + id + " has arrived at the hospital.");
            synchronized (HealthcareSystem.class) {
                HealthcareSystem.treatPatient();
            }
            System.out.println("Patient " + id + " has been treated and is leaving.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class HealthcareSystem {
    private static int patientsTreated = 0;

    public static synchronized void treatPatient() throws InterruptedException {
        patientsTreated++;
        System.out.println("Patient " + patientsTreated + " is being treated by Doctor " + patientsTreated);
        Thread.sleep(200); // Simulate medical treatment time
    }

    public static void main(String[] args) {
        int numPatients = 5;

        for (int i = 1; i <= numPatients; i++) {
            Patient patient = new Patient(i);
            patient.start();
        }
    }
}
