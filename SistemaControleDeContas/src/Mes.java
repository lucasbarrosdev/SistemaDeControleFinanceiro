import java.util.ArrayList;

public class Mes {
	String nome;
	ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();

	public ArrayList<Lancamento> getLancamentosMensais(){
		return lancamentos;
	}
}