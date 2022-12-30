
public class Patient {
    static int id;
    String name, email, address, phoneNumber, birthday,  blood;
    double weight, height;

    private String attribute3;

    public void Patiente(String name, String email){
        this.name = name;
        this.email = email;
        id++;


    }
}