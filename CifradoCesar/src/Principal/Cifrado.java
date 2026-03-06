package Principal;

public class Cifrado {
	//Declaramos atributos
	private String texto;
	private int clave;
	
	//Constructor
	public Cifrado() {
	}

	//Getters y Setters
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}
	
	//Metodo para cifrar el texto utilizando el cifrado César
	public String cifrar() {
		String resultado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (Character.isUpperCase(c)) {
				resultado += (char) ((c + clave - 65) % 26 + 65);
			} else if (Character.isLowerCase(c)) {
				resultado += (char) ((c + clave - 97) % 26 + 97);
			} else {
				resultado += c;
			}
		}
		return resultado;
	}
	
	//Metodo para descifrar el texto utilizando el cifrado César
	public String descifrar() {
	    int claveInversa = 26 - (clave % 26);
	    String resultado = "";

	    for (int i = 0; i < texto.length(); i++) {
	        char c = texto.charAt(i);
	        if (Character.isUpperCase(c)) {
	            resultado += (char) ((c + claveInversa - 65) % 26 + 65);
	        } else if (Character.isLowerCase(c)) {
	            resultado += (char) ((c + claveInversa - 97) % 26 + 97);
	        } else {
	            resultado += c;
	        }
	    }
	    return resultado;
	}
	
}
