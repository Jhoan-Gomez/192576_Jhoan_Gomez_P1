import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     System.out.println("Ingresé Nota 1:");
     double nota1 = sc.nextDouble();
     System.out.println("Ingresé Nota 2:");
     double nota2 = sc.nextDouble();
     System.out.println("Ingresé Nota 3:");
     double nota3 = sc.nextDouble();

     double promedio = (nota1 + nota2 + nota3) / 3;
     System.out.println("El Promedio es " + promedio);
     if (promedio >= 4.5) {
            System.out.println("Promocionado");
     }
     if (promedio < 4.5 && promedio > 4.0) {
            System.out.println("Regular");
     }
     if (promedio <= 4.0) {
            System.out.println("Reprobado");
     }
}
}
