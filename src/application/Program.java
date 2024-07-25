package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas serao digitadas no programa? ");
		int n = sc.nextInt();
		
		String vectNome[] = new String[n];
		int vectIdade[] = new int[n];
		double vectAltura[] = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa a serem coletadas informações:");
			System.out.print("Nome: ");
			sc.nextLine();
			vectNome[i] = sc.nextLine();
			System.out.print("Idade da pessoa: ");
			vectIdade[i] = sc.nextInt();
			System.out.print("Altura da pessoa: ");
			vectAltura[i] = sc.nextDouble();			
		}
		
		double somaAltura = 0;
		int contagemIdade = 0;
		double percentualMenores = 0;
		
		for(int i=0; i<n; i++) {
			if(vectIdade[i] < 16) {
				contagemIdade ++;
			}
			somaAltura += vectAltura[i];
		}
		
		percentualMenores = contagemIdade * 100 / n;
		double alturaMedia = somaAltura / n;
		
		System.out.println("");
		System.out.printf("Altura media das pessoas listadas no programa: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores);
		
		for(int i=0; i<n; i++) {
			if(vectIdade[i] < 16) {
				System.out.println(vectNome[i]);;
			}
		}
		
		sc.close();
	}
}
