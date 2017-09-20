
public class Lancamento {

	static int contID = 0;
	int id;
	String titulo, tipo;
	double valor;
	boolean pago = false;
	Mes mesPagamento;
	
	public Lancamento(String titulo, String tipo, double valor, Mes mesPagamento) {
		contID++;
		id = contID;
		this.titulo = titulo;
		this.tipo = tipo;
		this.valor = valor;
		this.mesPagamento = mesPagamento;
		this.mesPagamento.lancamentos.add(this);
	}
	
	public void efetuarPagamento(){
		pago = true;
	}
	
	public String  getNumMes(){
		return mesPagamento.nome;
	}
	
}
