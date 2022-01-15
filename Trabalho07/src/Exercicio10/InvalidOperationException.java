package Exercicio10;

public class InvalidOperationException extends RuntimeException {
	private String messagem;

	public InvalidOperationException(String messagem) {
		this.setMessagem(messagem);
		System.out.println(messagem);
	}

	// get e set
	public String getMessagem() {
		return messagem;
	}

	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}
}
