import java.util.Locale;
import java.util.Scanner;
public class AaboutMe {
    
    public static void main(String[] args) {
        //criando uum objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
       
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();
        
        System.out.println("Digite seu idade:");
        int idade = scanner.nextInt();
       
         System.out.println("Digite seu altura:");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome );
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

        scanner.close();

    }
}
