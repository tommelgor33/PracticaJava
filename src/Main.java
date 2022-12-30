import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        Doctor mydoctor = new Doctor();
        mydoctor.name = "Roberto";
        mydoctor.showName();
        mydoctor.showId();
        System.out.println();

        Doctor mydoc2 = new Doctor("andrea");
        mydoc2.showId();

        showMenu();

    }
}