public class Envio{
	String numero;
	Float precio;
	// El constructor se llama igual que la clase
	// Sirve para inicializar los atributos del objeto.
	// This el objeto que ejecuta el codigo
	public Envio(String numero, Float precio){
			this.numero = numero;
			this.precio = precio;
			System.out.println("Construyendo objeto Envio...");

	}

	public String verComoString(){
		String envio = this.numero + "\t\t " + this.precio + "€";
		return envio; 

	}
}
