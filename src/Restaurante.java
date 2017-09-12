public class Restaurante {
	
	private Prato prato1 = new Prato("Macarrão",10,"Massa, feijão, e queijo");
	private Prato prato2 = new Prato("Á la minuta",15,"Arroz, feijão, batata frita, ovo, carne ou frango, salada");
	private Prato prato3 = new Prato("Coockie",5,"Coockie de chocolate");
	
	public void mostrarCardapio(){
		System.out.println(prato1.getNomePrato() +": "+ prato1.getPrecoPrato() + "\n" + prato1.getDescricaoPrato()+".\n");
		System.out.println(prato2.getNomePrato() +": "+ prato2.getPrecoPrato() + "\n" + prato2.getDescricaoPrato()+".\n");
		System.out.println(prato3.getNomePrato() +": "+ prato3.getPrecoPrato() + "\n" + prato3.getDescricaoPrato()+".");
	}
	public void mostraIng(){
		System.out.println("Ingredientes opcionais:");
		System.out.println(">"+Ingredientes.ingrediente1);
		System.out.println(">"+Ingredientes.ingrediente2);
		System.out.println(">"+Ingredientes.ingrediente3);
		System.out.println(">"+Ingredientes.ingrediente4);
		System.out.println(">"+Ingredientes.ingrediente5);
	
		}
}
