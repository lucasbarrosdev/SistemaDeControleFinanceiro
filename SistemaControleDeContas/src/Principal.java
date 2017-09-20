import javax.swing.JOptionPane;

public class Principal {
	public static void main (String[] args){

		// Adicionando um lan�amento simples
		JOptionPane.showMessageDialog(null, "LAN�AMENTO SIMPLES 1");
		String titulo = JOptionPane.showInputDialog("T�tulo do lan�amento: ");
		String tipo = JOptionPane.showInputDialog("Tipo do lan�amento: ");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor total do lan�amento: ")); // a pagar ou a receber
		Mes mes1 = new Mes();
		mes1.nome = "Janeiro";//JOptionPane.showInputDialog("M�s do lan�amento (nome do m�s): ");
		LancamentoSimples lSimples1 = new LancamentoSimples(titulo, tipo, valor, mes1);
		
		JOptionPane.showMessageDialog(null, "LAN�AMENTO SIMPLES 2");
		titulo = JOptionPane.showInputDialog("T�tulo do lan�amento: ");
		tipo = JOptionPane.showInputDialog("Tipo do lan�amento: ");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor total do lan�amento: "));
		LancamentoSimples lSimples2 = new LancamentoSimples(titulo, tipo, valor, mes1);
		
		JOptionPane.showMessageDialog(null, "LAN�AMENTO SIMPLES 3");
		titulo = JOptionPane.showInputDialog("T�tulo do lan�amento: ");
		tipo = JOptionPane.showInputDialog("Tipo do lan�amento: ");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor total do lan�amento: "));
		Mes mes2 = new Mes();
		mes2.nome = "Fevereiro";
		LancamentoEspecial lSimples3 = new LancamentoEspecial(titulo, tipo, valor, mes2);
		
		//Listando Lan�amentos
		Operador o = new Operador();
		String listagem = o.listarLancamentos(mes1);
		JOptionPane.showMessageDialog(null, listagem);
		listagem = o.listarLancamentos(mes2);
		JOptionPane.showMessageDialog(null, listagem);

		int idRemove = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID DE UM LAN�AMENTO PARA REMOV�-LO: "));
		
		// removendo um lan�amento
		o.removerLancamento(idRemove, mes1);
		
		listagem = o.listarLancamentos(mes1);
		JOptionPane.showMessageDialog(null, listagem);
		
		listagem = o.listarLancamentos(mes2);
		JOptionPane.showMessageDialog(null, listagem);
		
	}
}
