package Model;

import jdk.nashorn.internal.runtime.StoredScript;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//si user es abstracto Doctor debe serlo
// si un método de user es abstacto más que nada
public class Doctor extends User { //Clase exterior

    //atributos
    //Solo el doctor puede crear citas
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments= new ArrayList<>();

    public Doctor(String name, String email){
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }




    //Coleccion de objetos

    //método a nivel clase doctor

    //CONSTRUCTOR

    public void addAvailableAppointment(String date, String time){

        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " +speciality+"\nAvailable: " + availableAppointments.toString();


    }

    /**
     * Esta clase genera una cita
     * */
    public static class AvailableAppointment{ //Clase anidada
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");


        public AvailableAppointment(String date, String time) { //Método
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {

            return date;
        }

        public String getDate() {
            //bandera
            return format.format(date);

        }


        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment \nDate: "+ date +"\nTime : " + time;
        }
    } //tiene que ser de a fuerza estatica

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");
    }

}
