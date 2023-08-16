import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o número da conta:");
        numero = sc.nextInt();
        System.out.println("Entre com o agencia da conta:");
        agencia = sc.next();
        System.out.println("Entre com o nome do titular da conta:");
        nome = sc.next();
        System.out.println("Entre com o saldo da conta:");
        saldo = sc.nextDouble();

        System.out.println("Olá " +nome+ " , Obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia +" , Conta "+numero+" ee seu saldo "+saldo+" ja está disponivel para saque.");

    }
}

