package me.karunarathne.Kuppiya;

public class Patient {
    String name;
    int age;
    Gender gender;
    String symptoms;
    String admittedHospital;

    public Patient(String name, int age, Gender gender, String symptoms, String admittedHospital) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.symptoms = symptoms;
        this.admittedHospital = admittedHospital;
    }

    public void takeVaccine () {
        System.out.println(this.name + "- Ouch.... [injected...!]");
    }
}
