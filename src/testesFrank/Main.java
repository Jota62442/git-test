package testesFrank;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

import testesFrank.model.Celular;
import testesFrank.model.Conta;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Iniciando Testes: \n\n");
		//teste01();
		//teste02();
		//teste04();
		teste05();
	}
	
	private static void teste05() {
		Conta conta = new Conta();
		conta.abrirConta("cp");
		
		System.out.println(conta.toString());

		conta.sacar(150);
		System.out.println(conta.toString());
		

		conta.fecharConta();
		System.out.println(conta.toString());
		
		conta.depositar(150);
		System.out.println(conta.toString());
	}

	private static void teste04() {
		Celular celular1 = new Celular();
		celular1.setModelo("Samsung");
		celular1.setCor("Vermelho");
		celular1.setAnoFabricacao(2000L);
		celular1.setValor(3000);
		celular1.setDesconto(0.2);
		
		Celular celular2 = new Celular();
		celular2.setModelo("iPhone");
		celular2.setCor("Preto");
		celular2.setAnoFabricacao(1999L);
		celular2.setValor(4000);
		celular2.setDesconto(0.1);
		
		exibeDados(celular1, celular2);
		
		System.out.println("LED: " + celular1.getLabelDefaultParaLED());
		exibeDados(celular1, celular2);
	}

	private static void exibeDados(Celular celular1, Celular celular2) {
		System.out.println("Celular1: " + celular1.toString());
		System.out.println("Celular2: " + celular2.toString());

		System.out.println("Cor do Celular1: " + celular1.getCor());
		System.out.println("Cor do Celular2: " + celular2.getCor());
		System.out.println(celular1.getModelo() + ": " + celular1.getValor());
		System.out.println(celular2.getModelo() + ": " + celular2.getValor());
		
	}

	private static void teste02() {
		StringBuilder sb = new StringBuilder("Iniciando...\n");
		for(int a= 0; a<= 100000; a++) {
			sb.append("\n" + a);
		}
		System.out.println(sb.toString());
	}
	
	private static void teste03() {
		String sb = new String("Iniciando...\n");
		for(int a= 0; a<= 100000; a++) {
			sb+=("\n" + a);
		}
		System.out.println(sb);
	}

	private static void teste01() {

		double abc = 1.0023;
		double bcd = 2.00654654654;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		BigDecimal bd;
		bd = sc.nextBigDecimal();
		
		System.out.printf("qualquer coisa %.2f + %.2f = %f\n", abc, bcd, (abc + bcd));
		System.out.println("qualquer coisa " + bd);
	
		sc.close();
		
	}

}