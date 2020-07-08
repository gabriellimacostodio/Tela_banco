package tela_banco;

import java.util.Scanner;

public class tela_banco {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leitor = new Scanner(System.in);
	int n1, n2, n3;
	int saldo = 0;
	
	System.out.println("MENU");
	System.out.println("1-saldo");
	System.out.println("2-deposito");
	System.out.println("3-saque");
	System.out.println("4-sair");
	//pular_linha
	//pular_linha
	System.out.println("digite a opção desejada");
	n1 = leitor.nextInt();
	
	switch(n1) {
	case 1:
		System.out.println("seu saldo e "+saldo);
		break;
	case 2:
		System.out.println("digite a quantidade que deseja depositar?");
		n2 = leitor.nextInt();
		System.out.println(saldo + n2);
		break;
	case 3:
		System.out.println("quanto deseja retirar?");
		n3 = leitor.nextInt();
		System.out.println(saldo - n3);
		break;
	case 4:
		System.out.println("obrigado por utilizar nossos serviços");
		break;
	default:
		System.out.println("opção invalida");
	}	
}


}
