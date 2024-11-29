import java.util.Scanner;
public class anidado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int num = scanner.nextInt();

        for(int i = 1; i<= num; i++){
            for(int j = 1; j<= num-1; j++){
                System.out.print(" "); 
            }
            for(int k= 1; k<=(2*i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
