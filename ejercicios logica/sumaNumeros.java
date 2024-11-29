import java.util.Scanner;
public class sumaNumeros {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int number = scanner.nextInt();

        int suma = sumaNumber(number);
        System.out.println("La suma es " + suma);
    }
    public static int sumaNumber(int number){
        int suma = 0;
        number = Math.abs(number);
        while(number >0){
            suma += number % 10;
            number /= 10;
        }
        return suma;
    }
}

