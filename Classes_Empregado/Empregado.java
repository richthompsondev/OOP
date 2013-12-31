

/**
 * Empregado � uma classe abstrata. Todos os empregados t�m um primeiro_nome,
 * ultimo_nome, e um sal�rio. Cada empregado pode calcular o seu sal�rio.
 * Todavia, o mecanismo para calcular o sal�rio depende do tipo de empregado.
 * Assim, cada classe especializada deve definir, o modo como calcular o seu
 * sal�rio.
 */
public abstract class Empregado {
	private String primeiro_nome;
	private String ultimo_nome;
	protected double salario;

	public Empregado(String primeiro_nome, String ultimo_nome, double salario) {
		this.primeiro_nome = primeiro_nome;
		this.ultimo_nome = ultimo_nome;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public String getPrimeiroNome() {
		return primeiro_nome;
	}

	public String getUltimoNome() {
		return ultimo_nome;
	}

	public abstract double calcularPagamento();

	public String imprimirCheckPagamento() {
		String nome_completo = ultimo_nome + ", " + primeiro_nome;
		return ("Pagamento: " + nome_completo + ". R$ " + calcularPagamento());
	}
}
