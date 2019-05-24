
import static java.lang.Character.isUpperCase;
import javax.swing.JOptionPane;

public class exerc1 {
    public static void checar(String nome){
        if(nome.isEmpty()){
            mensagem("Campo Vazio");
        }
        else if(!nome.contains(" ")){
            mensagem("Nome e Sobrenome devem ser separados por espaço");
        }
        else if(!isMaiuscula(nome)){
            mensagem("Nome e Sobrenome devem começar com letra maiúscula");
        }
        else{
            mensagem("Sucesso!", nome);
        }
        
    }
    public static boolean isMaiuscula(String nome){
        boolean maiuscula = true;
        String nomes[] = nome.split(" ");
        for (int i = 0; i < nomes.length; i++) {
            if(!isUpperCase(nomes[i].charAt(0))){
                maiuscula = false;
            }
        }
        return maiuscula;
    }
    public static void mensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Erro",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mensagem(String msg, String nome) {
        msg += " " + nome;
        JOptionPane.showMessageDialog(null, msg, "Programa Diz",JOptionPane.PLAIN_MESSAGE);   
    }
    
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Digite Nome e Sobrenome");
        checar(nome);
    }
}
