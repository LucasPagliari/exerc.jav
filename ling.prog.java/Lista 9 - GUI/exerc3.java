import javax.swing.JOptionPane;

public class exerc1 {
    public static void mediaTurma(double[] vet){
        double n = 0;
        for (int i = 0; i < vet.length; i++) {
            n += vet[i];
        }
        n = n/vet.length;

        JOptionPane.showMessageDialog(null, n);
    }

    public static void maiorMedia(double[] vet){
        double n = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if(n < vet[i]){
                n = vet[i];
            }
        }
        JOptionPane.showMessageDialog(null, n);
    }

    public static void main(String[] args) {
        Object[] opcoesPossiveis = {"Média Turma", "Maior Média", "Sair"};
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos Alunos?"));
        int selecionado=0;
        String nomes[] = new String[n];
        double medias[] = new double[n];
        double n1=0;

        for (int i = 0; i < n; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o Nome");
            for (int j = 0; j < 2; j++) {
                n1 += Double.parseDouble(JOptionPane.showInputDialog("Nota:"));
            }
            medias[i] = n1/2;
            n1=0;
        }
        while(selecionado != 2){
            Object botaoSelecionado = JOptionPane.showOptionDialog(null,"Escolha:",
                "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opcoesPossiveis, opcoesPossiveis[0]);

            selecionado = Integer.parseInt(botaoSelecionado.toString());

            switch(selecionado){
                case 0:
                    mediaTurma(medias);
                    break;
                case 1:
                    maiorMedia(medias);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }
}
