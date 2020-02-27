package Model;

public class Nurse extends User {
    private String speciality;

    public Nurse (String name, String email){
        super(name , email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Verde");
        System.out.println("Departamentos: Pediatría," +
                "Cancerología");
    }
}
