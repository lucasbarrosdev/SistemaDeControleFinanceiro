import javax.swing.JOptionPane;

public class Principal {
	public static void main (String[] args){

		// Adicionando um lançamento simples
		JOptionPane.showMessageDialog(null, "LANÇAMENTO SIMPLES 1");
		String titulo = JOptionPane.showInputDialog("Título do lançamento: ");
		String tipo = JOptionPane.showInputDialog("Tipo do lançamento: ");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor total do lançamento: ")); // a pagar ou a receber
		Mes mes1 = new Mes();
		mes1.nome = "Janeiro";//JOptionPane.showInputDialog("Mês do lançamento (nome do mês): ");
		LancamentoSimples lSimples1 = new LancamentoSimples(titulo, tipo, valor, mes1);
		
		JOptionPane.showMessageDialog(null, "LANÇAMENTO SIMPLES 2");
		titulo = JOptionPane.showInputDialog("Título do lançamento: ");
		tipo = JOptionPane.showInputDialog("Tipo do lançamento: ");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor total do lançamento: "));
		LancamentoSimples lSimples2 = new LancamentoSimples(titulo, tipo, valor, mes1);
		
		JOptionPane.showMessageDialog(null, "LANÇAMENTO SIMPLES 3");
		titulo = JOptionPane.showInputDialog("Título do lançamento: ");
		tipo = JOptionPane.showInputDialog("Tipo do lançamento: ");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor total do lançamento: "));
		Mes mes2 = new Mes();
		mes2.nome = "Fevereiro";
		LancamentoEspecial lSimples3 = new LancamentoEspecial(titulo, tipo, valor, mes2);
		
		//Listando Lançamentos
		Operador o = new Operador();
		String listagem = o.listarLancamentos(mes1);
		JOptionPane.showMessageDialog(null, listagem);
		listagem = o.listarLancamentos(mes2);
		JOptionPane.showMessageDialog(null, listagem);

		int idRemove = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID DE UM LANÇAMENTO PARA REMOVÊ-LO: "));
		
		// removendo um lançamento
		o.removerLancamento(idRemove, mes1);
		
		listagem = o.listarLancamentos(mes1);
		JOptionPane.showMessageDialog(null, listagem);
		
		listagem = o.listarLancamentos(mes2);
		JOptionPane.showMessageDialog(null, listagem);
		
	}
}
