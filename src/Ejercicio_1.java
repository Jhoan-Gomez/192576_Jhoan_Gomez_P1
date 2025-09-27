import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     System.out.println("Ingrese número 1:");
     int numero1 = sc.nextInt();
     System.out.println("Ingresé número 2:");
     int numero2 = sc.nextInt();
    if (numero1 > numero2) {
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        System.out.println("La suma es " + suma + " y la resta es " + resta);
    }

    if (numero1 == numero2 && numero2 != 0) {
        int multi = numero1 * numero2;
        int divi = numero1 / numero2;
        System.out.println("La multiplicación es " + multi + " y la división es " + divi);
    }

    if (numero1 == numero2 && numero2 == 0) {
        int multi = numero1 * numero2;
        System.out.println("Division no definida");
    }

    if (numero1 < numero2) {
        System.out.println("No se hacen operaciones");
    }
}
}
