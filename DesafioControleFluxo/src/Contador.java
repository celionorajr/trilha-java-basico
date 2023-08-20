import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm,parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        terminal.close();
        
   }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroDois > parametroUm){
            int contador = parametroDois - parametroUm;
            for(int i = 0;i<contador;i++){
                System.out.println(i+1);
            }
        }else{
            throw new ParametrosInvalidosException();
        }

   }
}
