package Model;

import java.util.ArrayList;
import java.util.Date;

public  class Patient extends User implements ISchedulable {

    private String birthday;
    private double weight;
    private double height;
    private String blood;


    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses= new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this ,doctor);
        appointmentDoctor.shedulable(date,time);
        appointmentDoctors.add(appointmentDoctor);

    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }


    public Patient(String name, String email){
        //recibe name e email de la clase padre
        super(name,email);

        //más instrucciones

    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    // 54.5 Kg String
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }


    @Override
    public String toString() {
        //Esto permite reescribir lo que hace el super
        return super.toString() + "\nAge: "+birthday + "\nWeigtnh: "+getWeight() +"\nHeight: "+ getHeight() + "BloodType: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }

    @Override
    public void shedulable(Date date, String time) {

    }
}
