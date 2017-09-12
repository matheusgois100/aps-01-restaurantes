import java.util.Scanner;

public class Prato {

	
	String nomePrato;
	double precoPrato;
	String descricaoPrato;
	
	public Prato(String nome, double preço, String descricao) {
		super();
		this.nomePrato = nome;
		this.precoPrato = preço;
		this.descricaoPrato = descricao;
	}
	
	public String getNomePrato() {
		return nomePrato;
	}

	
	public double getPrecoPrato() {
		return precoPrato;
	}

	public void setPrecoPrato(double precoPrato) {
		this.precoPrato = precoPrato;
	}

	public String getDescricaoPrato() {
		return descricaoPrato;
	}

	public void setDescricaoPrato(String descricaoPrato) {
		this.descricaoPrato = descricaoPrato;
	}

}
	
	

