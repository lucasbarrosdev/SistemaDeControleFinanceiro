import java.util.ArrayList;

public class LancamentoEspecial extends Lancamento{

	ArrayList<Double> parcelamentos = new ArrayList<Double>();
	double valorTotal;
	public LancamentoEspecial(String titulo, String tipo, double valor, Mes mesPagamento) {
		super(titulo, tipo, valor, mesPagamento);
	}
	
	public void efetuarPagamento(double parcela){
		parcelamentos.add(parcela);
		if (valor >= valorPago()){
			pago = true;
		}
	}
	
	private double valorPago(){
		double soma = 0;
		for (double valor : parcelamentos)
			soma += valor;
		return soma;
	}
	
}