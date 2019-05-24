
import javax.swing.JOptionPane;

public class exerc2{
    
    static int sacar(int inicial,int x) {
        inicial = inicial - x;
        return inicial;
    }
    
    static int depositar(int inicial,int x) {
        inicial = inicial + x;
        return inicial;
    }
    
    public static void main(String[] args) {
        int inicial = 1000, num;
        Object[] opcoesPossiveis = {"Sacar","Depositar","Balanço","Sair"};
        int selecionado;

        for (int i = 0; i > -1; i++) {
        Object botaoSelecionado = JOptionPane.showOptionDialog(null,"Olá, bem vindo. Escolha a opção desejada:",
        "Tela Inicial",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null, opcoesPossiveis,
        opcoesPossiveis[0]);
        selecionado= Integer.parseInt(botaoSelecionado.toString());
            try{
                if (selecionado == 0) {
                    num = Integer.parseInt(JOptionPane.showInputDialog("Quantidade a sacar:"));
                    if (num>inicial) {
                        JOptionPane.showMessageDialog(null, "Não é possível sacar mais do que o saldo atual.","",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        inicial = sacar(inicial,num);
                    }
                }
                else if (selecionado == 1){
                    inicial =depositar(inicial,Integer.parseInt(JOptionPane.showInputDialog("Quantidade a depositar:")));
                }
                else if(selecionado == 2){
                    JOptionPane.showMessageDialog(null, "Saldo atual: " + inicial);
                }
                else{
                    break;
                }
            }catch(Exception x){
                JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente.");
            }
        } 
    }
}
