package ui;

import Model.Doctor;
import Model.Patient;
import Model.UIDoctorMenu;
import Model.UIPatientMenu;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class UIMenu {
    public static final String[] MONTHS ={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");
        boolean var0 = false;

        int response;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch(response) {
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while(response != 0);
    }

    static void showPatientMenu(){
        int response=0;
        do{
            System.out.println("\n\n");
            System.out.println("Model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i <4 ; i++) {
                        System.out.println(i + ". "+MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }

        }while (response!=0);
    }

    private static void authUser(int userType){
        //userType == 1 Doctor
        //userType == 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez","alejandro@gmail.com"));
        doctors.add(new Doctor("Karen Sosa","rocio@gmail.com"));
        doctors.add(new Doctor("Rocio Gómez","alejandro@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Anahi Salgado","anahi@gmail.com"));
        patients.add(new Patient("Roberto Rodriguéz","roberto@gmail.com"));
        patients.add(new Patient("Carlos Sánchez","carlos@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: Example: name@gmail.com");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType==1){
                for(Doctor d:doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect=true;
                        //obtener datos del usuario loggeado
                        doctorLogged=d;
                        //Show doctor menu
                        doctorLogged =d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType==2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect=true;
                        patientLogged=p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }while(!emailCorrect);

    }
}
