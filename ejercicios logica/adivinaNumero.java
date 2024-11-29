import java.util.Scanner;
public class adivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese la palabra");
        String palindromo = scanner.nextLine();
        
        
        char[] arrayPalindromo = palindromo.toCharArray();

        for(int i = 0 ; i < arrayPalindromo.length; i++){
            System.out.println(arrayPalindromo[i]);
            for(int j = arrayPalindromo.length -1; i >= 0; i--){
                System.out.println(arrayPalindromo[j]);
                if(arrayPalindromo[i] == arrayPalindromo[j]){
                    System.out.println("Es palindromo");
                }else{
                    System.out.println("No es palindromo");
                }
            }
        }

    }
}
