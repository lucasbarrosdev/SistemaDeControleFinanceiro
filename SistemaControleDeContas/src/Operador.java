import java.util.ArrayList;

public class Operador {
	
	public String listarLancamentos(Mes mes){
		
		String listagem = "";
		ArrayList<Lancamento> lancamentos = mes.getLancamentosMensais();
		
		for (Lancamento l : lancamentos){
			listagem += "\n"
					+ "ID: " + l.id + "\n "
					+ "T�tulo: " + l.titulo + "\n "
					+ "Status: " + (l.pago ? "Pago" : "N�o pago") + "\n "
					+ "Tipo: " + l.tipo + "\n "
					+ "Valor: R$ " + l.valor + "\n "
					+ "M�s: " + l.getNumMes() + "\n";
		}
		
		return listagem;
	}
	
	public String listarLancamentosPagos(Mes mes){
		
		String listagem = "";
		ArrayList<Lancamento> lancamentos = mes.getLancamentosMensais();
		
		return listagem;
	}
	
	public void removerLancamento(int idLanc, Mes mes){
		
		ArrayList<Lancamento> lancamentos = mes.getLancamentosMensais();
		Lancamento lRemover = null;
		for (Lancamento l : lancamentos)
			if (l.id == idLanc) lRemover = l;
		if (lRemover != null) mes.lancamentos.remove(lRemover);
	}
}
