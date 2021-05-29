import java.util.Scanner;

class Estudiante{
    public long id;
    public String nombre;
    public String apellido;
    public String usuario;
}

class Calculo{
    public int calificaciones []= new int[5];
    public int i;
    public int suma = 0;
    public int promedio = 0;

}

public class Calificación {

    public static void main(String[] args) {
        Estudiante nuevoEstudiante = new Estudiante();
        Calculo nuevoCalculo = new Calculo();

        Scanner SC = new Scanner(System.in);

        System.out.println("Cual es tu nombre? ");
        nuevoEstudiante.usuario = SC.nextLine();

        System.out.println("Cual es el Nombre del Estudiante?");
        nuevoEstudiante.nombre = SC.nextLine();
        System.out.println("Cual es el Apellido del Estudiante?");
        nuevoEstudiante.apellido = SC.nextLine();
        System.out.println("Cual es el ID del Estudiante?");
        nuevoEstudiante.id = SC.nextInt();

        System.out.println("Ingresa las Calificaciones de las 5 Clases: ");
        for (nuevoCalculo.i=0; nuevoCalculo.i<5; nuevoCalculo.i++){
            nuevoCalculo.calificaciones[nuevoCalculo.i] = SC.nextInt();
            nuevoCalculo.suma = nuevoCalculo.suma + nuevoCalculo.calificaciones[nuevoCalculo.i];
        }

        nuevoCalculo.promedio = nuevoCalculo.suma / 5;

        System.out.println("                              ");
        System.out.println("|----------------------------|");
        System.out.println("|  Reporte de Calificaciones |");
        System.out.println("|----------------------------|");
        System.out.println("Usuario: " + nuevoEstudiante.usuario);
        System.out.println("Nombre del Estudiante: " + nuevoEstudiante.nombre + " " + nuevoEstudiante.apellido);
        System.out.println("ID del Estudiante: " + nuevoEstudiante.id);
        System.out.println("Calificación 1: " + nuevoCalculo.calificaciones[0]);
        System.out.println("Calificación 2: " + nuevoCalculo.calificaciones[1]);
        System.out.println("Calificación 3: " + nuevoCalculo.calificaciones[2]);
        System.out.println("Calificación 4: " + nuevoCalculo.calificaciones[3]);
        System.out.println("Calificación 5: " + nuevoCalculo.calificaciones[4]);
        System.out.println("Promedio: " + nuevoCalculo.promedio);

        if(nuevoCalculo.promedio < 50){
            System.out.println("Calificación: F! :(");
        } else if (nuevoCalculo.promedio >= 51 && nuevoCalculo.promedio <= 60){
            System.out.println("Calificación: E! :(");
        } else if (nuevoCalculo.promedio >= 61 && nuevoCalculo.promedio <= 70){
            System.out.println("Calificación: D! :/");
        } else if (nuevoCalculo.promedio >= 71 && nuevoCalculo.promedio <= 80){
            System.out.println("Calificación: C! :|");
        } else if (nuevoCalculo.promedio >= 81 && nuevoCalculo.promedio <= 90){
            System.out.println("Calificación: B! :)");
        } else if (nuevoCalculo.promedio >= 91 && nuevoCalculo.promedio <= 100){
            System.out.println("Calificación: A! :D");
        } else {
            System.out.println("Error!");
        }
    }
}
