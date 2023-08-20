package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {
	public static void main(String[] args) {
		String candidatos [] = {"DAHYUM","MINA","MOMO","TZUYU","SANA"};
		for(String candidato : candidatos) {
			entrandoEmContato(candidato); 
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continarTentando = !atendeu;
			if(continarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
			}
		}while(continarTentando && tentativasRealizadas < 3);
		
		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO "+candidato+" NA "+tentativasRealizadas+"° TENTATIVA");
		}else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO "+candidato+" NÚMERO MAXIMO DE TENTATIVAS "+tentativasRealizadas);
			
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	static void imprimirSelecionados() {
		String candidatos [] = {"DAHYUM","MINA","MOMO","TZUYU","SANA"};
		for(int i = 0; i < candidatos.length;i++) {
			System.out.println("O candidato de n° "+(i+1)+" é o(a): " +candidatos[i]);
		}
		
		System.out.println("Utilizando o for each");
		
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: "+candidato);
		}
	}
	static void selecaoCandidatos() {
		String candidatos [] = {"DAHYUM","MINA","MOMO","TZUYU","SANA","JIHYO","NAYEON","CHAEYOUNG","JEONGYEON","CELIO"};
		
		int candidatosSelecionado = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionado < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			//System.out.println("O CANDIDATO "+ candidato + "SOLICITOU ESSE VALOR DE SALARIO "+salarioPretendido);
			if(salarioBase <= salarioPretendido) {
				System.out.println("O candidato " + candidato+" foi selecionado para a vaga.");
				candidatosSelecionado++;
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analizarCandidatos(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CAANDIDATO");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
