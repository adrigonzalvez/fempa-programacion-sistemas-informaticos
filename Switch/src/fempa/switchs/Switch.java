package fempa.switchs;


public class Switch {

	public static void main(String[] args) {
		String nombre = "Xavi";
		
		switch(nombre) {
			case "Pep":
				System.out.println("Te llamas Jose");
				break;
			case "Xavi":
			case "xavi":
			case "xavier":
				System.out.println("Te llamas Javier");
				break;
			case "Joan":
			case "Joanet":
				System.out.println("Te llamas Joaquín");
				break;
			default:
				System.out.println("No tengo traducción.");
		}
		
		
		
	
	}

}
