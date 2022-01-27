package entities;

public class Moedaz {
	
	public String nome;
	private double total;
	private float qtd;
	
	public Moedaz(String nome, double total, float qtd) {
		this.nome = nome;
		this.total = total;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public double getTotal() {
		return total;
	}

	public float getQtd() {
		return qtd;
	}

	@Override
	public String toString(){
	    return  nome + ": " + "stop-loss: ";
	}
	
	public double calcula(double carteira, double preju) {
		double pct = total / carteira;
		double prop = pct * preju;
		return prop / qtd;
	}
	
	
}
