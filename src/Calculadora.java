import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		
		System.out.print("Valor 1: ");
		double valor1 = sc.nextDouble();
		
		System.out.print("Valor 2: ");
		double valor2 = sc.nextDouble();
		
		System.out.println("\n[1] ADIÇÃO\n"
				+ "[2] SUBTRAÇÃO\n"
				+ "[3] MULTIPLICAÇÃO\n"
				+ "[4] DIVISÃO\n");
		
		System.out.println("Selecione o tipo de operação: ");
		int tipo=sc.nextInt();
		
		if (tipo!=1&&tipo!=2&&tipo!=3&&tipo!=4) {
			System.out.println("ERRO");
		}
		else {
		//ADIÇÃO
		if(tipo==1) {
			double adicao= valor1+valor2;
			System.out.println(adicao);
		}
		
		//SUBTRAÇÃO
		if(tipo==2) {
			double subtracao=valor1-valor2;
			System.out.println(subtracao);
		}
		
		//MULTIPLICAÇÃO
		else if(tipo==3) {
			double multiplicacao=valor1*valor2;
			System.out.println(multiplicacao);
		}
		
		//DIVISÃO
		else if(tipo==4) {
			double divisao=valor1/valor2;
			if(valor2==0) {
				System.out.println("Impos. dividir por 0");
			}
			else {
			System.out.printf("%.2f%n",divisao);
			}
		}
		}
		sc.close();
	}
	}

