package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Moedaz;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ATEN��O: UTILIZE SEMPRE A MESMA UNIDADE DE VALOR (ex: D�lar, Real, Euro etc...)");
		System.out.println("Quantas criptomoedas voc� tem?: ");
		int num = sc.nextInt();
		System.out.println("Entre com o valor total investido: ");
		double carteira = sc.nextDouble();
		List<Moedaz> moedas = new ArrayList<>();
		String[] dados;
		for(int i = 0; i < num; i++) {
			if(i==0) {sc.nextLine();}
			System.out.printf("%s%d%s%n","Digite o nome da ", i+1 , "a moeda, valor investido nela, e o quanto voc� tem dela separados por v�rgula: ");
			String nome = sc.nextLine();
			dados = nome.split(",");
			moedas.add(new Moedaz(dados[0],Double.parseDouble(dados[1]),Float.parseFloat(dados[2])));
		}
		System.out.println("At� que valor est� disposto a tomar preju�zo?");
		double preju = sc.nextDouble();
		for(Moedaz e : moedas) {
			System.out.print(e);
			System.out.printf("%.2f%n",e.calcula(carteira, preju));
		}
		sc.close();
	}
	
	
}
