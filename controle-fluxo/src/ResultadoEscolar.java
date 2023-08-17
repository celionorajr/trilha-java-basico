public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.9;

        /*if(nota >= 7){
            System.out.println("Aprovado");
        }else if(nota >5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }*/

        //Condição Ternária
        String resultado = nota >= 7? "Aprovado" : nota > 5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado); 
    }
}
