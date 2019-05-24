
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exerc1 {

    public static void mensagemErro(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void mensagem(String conta, String saldo) {
        conta += " " + saldo;
        JOptionPane.showMessageDialog(null, conta, "Programa Diz", JOptionPane.PLAIN_MESSAGE);
    }

    // Inicializa um arquivo com dados padrão
    public static void dadosDefault() {
        BufferedWriter writer;
        int num;
        String c;
        try {
            File file = new File("contas.txt");
            if (!file.exists()) {
                System.out.println("Criando arquivo!");
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter("contas.txt"));
                for (int i = 0; i < 6; i++) {
                    num = 1 + i;
                    c = "c" + Integer.toString(i) + "|"
                            + Integer.toString(num) + "|" + "1000";
                    writer.write(c);
                    writer.newLine();
                }
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Falha!");
        }
    }

    // Recebe entrada do usuário definindo a conta que será utilizada
    public static String[] logar() {
        String conta[] = new String[2];
        do {
            try {
                conta[0] = JOptionPane.showInputDialog("Digite a Conta");
                if (conta[0].startsWith("-1") ) {
                    System.exit(0);
                }
                conta[1] = JOptionPane.showInputDialog("Digite a Senha");
                if (conta[1].startsWith("-1")) {
                    System.exit(0);
                }
            } catch (HeadlessException e) {
                System.exit(0);
            }
        } while (buscaConta(conta[0], conta[1]));
        return conta;
    }

    // Faz uma busca no arquivo
    public static boolean buscaConta(String conta, String senha) {
        boolean ausente = true;
        try {
            FileReader ler = new FileReader("contas.txt");
            BufferedReader reader = new BufferedReader(ler);
            Scanner entrada = new Scanner(reader);
            String linha, dados[];
            while ((linha = reader.readLine()) != null) {
                // Conta | Senha | Saldo
                System.out.println(linha);
                dados = linha.split("\\|");
                if (dados[0].equals(conta) && dados[1].equals(senha)) {
                    ausente = false;
                }
            }
        } catch (IOException e) {
        }
        return ausente;
    }

    // Retorna saldo convertido para double
    public static double getSaldo(String conta) {
        double saldo = 1000;
        try {
            FileReader ler = new FileReader("contas.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha, dados[];
            while ((linha = reader.readLine()) != null) {
                // Conta | Senha | Saldo
                dados = linha.split("\\|");
                if (dados[0].equals(conta)) {
                    return Double.parseDouble(dados[2]);
                }
            }
        } catch (IOException e) {
        }
        return saldo;
    }

    // Reescreve o arquivo
    public static void alteraLinha(String linhaAntiga, String linhaNova) {
        String arquivo = "contas.txt";
        System.out.println("Alterando Linhas");
        ArrayList<String> contas = new ArrayList<>();

        try {
            FileReader ler = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(ler);
            String linha;

            //Percorre as linhas enquanto houver texto 
            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith(linhaAntiga)) {
                    System.out.println("Linha Nova= " + linhaNova);
                    contas.add(linhaNova);
                } else {
                    System.out.println("arquivo antiga= " + linha);
                    contas.add(linha);
                }
            }
        } catch (IOException e) {
        }

        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i));
        }
        String str = contas.toString();
        str = str.substring(1, str.length() - 1).replace(",", "\n");
        str = str.replace("[", "");
        str = str.replace("]", "");
        str = str.replace(" ", "");
        try {
            File file = new File(arquivo);

            FileWriter writer = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write(str);
            bw.close();

        } catch (IOException e) {
        }
    }

    // Formata os dados conta, senha e saldo para string
    public static String[] atualizarDados(String conta, String senha, double saldo, double saldoInicial) {
        String contas[] = new String[2];
        String saldoConvertido = Double.toString(saldoInicial);
        contas[0] = conta + "|" + senha + "|" + saldoConvertido.substring(0, saldoConvertido.length() - 2);
        saldoConvertido = Double.toString(saldo);
        contas[1] = conta + "|" + senha + "|" + saldoConvertido.substring(0, saldoConvertido.length() - 2);
        return contas;
    }

    public static void verificaSaque(double saldo, double saque) throws Exception {
        if (saque < 0) {
            throw new Exception("Não é Possível Sacar Valores Negativos Espertinho");
        }

        saldo -= saque;
        if (saldo <= 0) {
            throw new Exception("Saldo Insuficiente");
        }

    }

    public static void verificaDeposito(double deposito) throws Exception {
        if (deposito < 0) {
            throw new Exception("Não é Possível Sacar Valores Negativos Espertinho");
        }
    }

    public static void main(String[] args) {
        dadosDefault();
        double valor = 0;
        Object[] opcoesPossiveis = {"Sacar", "Depositar", "Balanco", "Relogar", "Sair"};
        String conta[] = logar();
        String dados[];
        double saldo = getSaldo(conta[0]);
        double saldoInicial = getSaldo(conta[0]);
        int opcao = 0;

        while (opcao != 4) {
            Object botaoSelecionado = JOptionPane.showOptionDialog(null,
                    "Escolha a opcao desejada:", "Tela Inicial",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opcoesPossiveis, opcoesPossiveis[0]);
            opcao = Integer.parseInt(botaoSelecionado.toString());

            switch (opcao) {
                case 0:
                    try {
                        valor = Double.parseDouble(
                                JOptionPane.showInputDialog("Deseja Sacar Quanto?"));
                        verificaSaque(saldo, valor);
                        saldo -= valor;
                    } catch (Exception e) {
                        mensagemErro("Saldo Indisponível");
                    }
                    break;

                case 1:
                    try {
                        valor = Double.parseDouble(
                                JOptionPane.showInputDialog("Deseja Depositar Quanto?"));
                        verificaDeposito(valor);
                        saldo += valor;
                    } catch (Exception e) {
                        mensagemErro("Deposito Invalido");
                    }
                    break;

                case 2:
                    mensagem(conta[0], Double.toString(saldo));
                    break;

                case 3:
                    dados = atualizarDados(conta[0], conta[1], saldo, saldoInicial);
                    alteraLinha(dados[0], dados[1]);
                    conta = logar();
                    saldo = getSaldo(conta[0]);
                    break;

                case 4:
                    dados = atualizarDados(conta[0], conta[1], saldo, saldoInicial);
                    alteraLinha(dados[0], dados[1]);
                    System.exit(0);
                    break;
            }
        }
    }
}
