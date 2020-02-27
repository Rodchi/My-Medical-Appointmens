package Model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable {
    private int id;
    private Patient Patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Model.Patient patient, Doctor doctor) {
        Patient = patient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Model.Patient getPatient() {
        return Patient;
    }

    public void setPatient(Model.Patient patient) {
        Patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time + " hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void shedulable(Date date, String time) {
        this.date=date;
        this.time=time;
    }
}
