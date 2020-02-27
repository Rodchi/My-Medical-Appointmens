package Model;

/**
 * Esta es la superclase del programa
 *
 * No en todos los casos se necesita reeutilizar
 * todos los comportamientos.
 *
 * una clase abstracta no permite crear objetos o intancias
 *
 *
 * */
public abstract class User {

    /*Datos comunes del programa*/
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;




    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()>8){
            System.out.println("El número telefónico deber ser de 8 dígitos máximo");
        } else if(phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;
        }
    }

    @Override //Este método no es propio de la clase user sino que es un método extraido de la clase padre
    public String toString() {
        return "User : "+ name + ", Email: "+email +
                "\nAddress: " +address+". Phone: "+phoneNumber ;
    }

    /**
     * Método abstracto solo se declara
     * tiene varioscomportamientos  en diferentes clases
     *
     * NO lleva llaves
     *  */
    public abstract void showDataUser();

}
