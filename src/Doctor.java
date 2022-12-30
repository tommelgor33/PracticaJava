public class Doctor {
    static int id=0;
    int mainId=0;
    String name, speciality="medico";
    Doctor(){
        System.out.println("Creando el objeto doctor");
        id++;
        mainId=id;
    }

    Doctor(String name){
        System.out.println("Asignando el nombre " + name + " al doctor");
        id++;
        mainId=id;
    }

    public void showName(){
        System.out.println("Dr. " + name + ". Especialidad: " + speciality);
    }

    public void showId(){
        System.out.println("El id de " +name+ " es: " + mainId);
    }

}
