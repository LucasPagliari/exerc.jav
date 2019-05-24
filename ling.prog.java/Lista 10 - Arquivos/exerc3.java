
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

public class exerc3 {

    public static void mensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void mensagem(String nome, double media) {
        media = Math.floor(media);
        nome += " Media: " + Double.toString(media) + "\nConceito: ";
        if (media < 5) {
            nome += "*preocupante*";
        } else if (media <= 7) {
            nome += "regular";
        } else if (media <= 8.5) {
            nome += "bom";
        } else {
            nome += "excelente";
        }
        JOptionPane.showMessageDialog(null, nome, "Mensagem", JOptionPane.PLAIN_MESSAGE);
    }

    public static void dadosDefault() {
        BufferedWriter writer;
        double num;
        String c, notas, aux;
        try {
            File file = new File("alunos.txt");
            if (!file.exists()) {
                System.out.println("Criando arquivo!");
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter("alunos.txt"));
                for (double i = 0; i < 10; i++) {
                    num = 1000 + i;
                    if (i > 5) {
                        notas = Double.toString(i) + "|" + Double.toString(i - 2) + "|" + Double.toString(i + 1);
                    } else {
                        notas = Double.toString(i + 3) + "|" + Double.toString(i + 5) + "|" + Double.toString(i + 1);
                    }
                    aux = Double.toString(num);
                    c = aux.substring(0, aux.length() - 2) + "|" + "aluno" + Double.toString(i) + "|" + notas;

                    writer.write(c);
                    writer.newLine();
                }
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Falha!");
        }
    }

    public static boolean buscaAluno(String ra) {
        boolean encontrado = false;
        try {
            FileReader ler = new FileReader("alunos.txt");
            BufferedReader reader = new BufferedReader(ler);
            Scanner entrada = new Scanner(reader);
            String linha, dados[];
            while ((linha = reader.readLine()) != null) {
                // RA | Nome | Nota1 | Nota2 | Nota3
                dados = linha.split("\\|");
                if (dados[0].equals(ra)) {
                    encontrado = true;
                }
            }
        } catch (IOException e) {
        }
        return encontrado;
    }

    public static double[] getNotas(String ra) {
        try {
            FileReader ler = new FileReader("alunos.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha, dados[];

            while ((linha = reader.readLine()) != null) {
                // RA | Nome | Nota1 | Nota2 | Nota3
                dados = linha.split("\\|");
                if (dados[0].equals(ra)) {
                    double notas[] = {Double.parseDouble(dados[2]),
                        Double.parseDouble(dados[3]), Double.parseDouble(dados[4])};
                    return notas;
                }
            }
        } catch (IOException e) {
        }
        // Expressão nunca ocorrerá, pois o ra é validado antes
        double notas[] = {0, 0, 0};
        return notas;
    }

    public static String getNome(String ra) {
        try {
            FileReader ler = new FileReader("alunos.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha, dados[];

            while ((linha = reader.readLine()) != null) {
                // RA | Nome | Nota1 | Nota2 | Nota3
                dados = linha.split("\\|");
                if (dados[0].equals(ra)) {
                    return dados[1];
                }
            }
        } catch (IOException e) {
        }
        return "NotFound";
    }

    public static String verificaRA() {
        String ra;
        do {
            ra = JOptionPane.showInputDialog("Digite o RA");
            if (ra.startsWith("-1")) {
                System.exit(0);
            }
            if (!buscaAluno(ra)) {
                mensagem("Aluno Não Encontrado");
            }
        } while (!buscaAluno(ra));
        return ra;
    }

    public static void matricularNovoAluno(String cadastro) {
        String arquivo = "alunos.txt";
        System.out.println("Alterando Linhas");
        ArrayList<String> alunos = new ArrayList<>();

        try {
            FileReader ler = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(ler);
            String linha;

            //Percorre as linhas enquanto houver texto 
            while ((linha = reader.readLine()) != null) {
                alunos.add(linha);
            }
            alunos.add(cadastro);

        } catch (IOException e) {
        }
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }
        String str = alunos.toString();
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

    public static String formataCadastro(String ra, String nome, double n[]) {
        String cadastro = ra + "|" + nome + "|" + Double.toString(n[0]) + "|" + Double.toString(n[1])
                + "|" + Double.toString(n[2]) + "|";
        return cadastro;
    }

    public static boolean validaNotas(double n[]) {
        boolean aux;
        for (int i = 0; i < n.length; i++) {
            if (n[i]>10 || n[i] < 0) {
                mensagem("nota invalida");
                return false;
            }
        }
        return true;
    }

    public static boolean validaNome(String nome) {
        if(nome.length() > 30 || nome.length() == 0){
            mensagem("nome invalida");
            return false;
        }
        return true;
    }

    public static String insereAluno() {
        String ra = "", nome = "";
        double media=0;
        double notas[] = new double[3];
        do {
            ra = JOptionPane.showInputDialog("Digite o RA");
        } while (buscaAluno(ra));

        do {
            nome = JOptionPane.showInputDialog("Digite o Nome");
        } while (!validaNome(nome));

        do {
            for (int i = 0; i < notas.length; i++) {
                notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " +(i+1) + "° nota"));
            }
        } while (!validaNotas(notas));
        
        for (int i = 0; i < notas.length; i++) {
            media+=notas[i];
        }
        media /= 3;
        mensagem(nome, media);
        return formataCadastro(ra, nome, notas);
    }
    
    public static void app(){
         String ra;
        String nome;
        double notas[];
        int opcao = 0;
        
        while (opcao != 3) {
            Object[] opcoesPossiveis = {"Info Sobre Aluno", "Cadastrar Novo Aluno", "Sair"};
            Object botaoSelecionado = JOptionPane.showOptionDialog(null,
                    "Escolha a opcao desejada:", "Tela Inicial",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opcoesPossiveis, opcoesPossiveis[0]);
            opcao = Integer.parseInt(botaoSelecionado.toString());

            switch (opcao) {
                case 0:
                    ra = verificaRA();
                    notas = getNotas(ra);
                    nome = getNome(ra);
                    double media = (notas[0] + notas[1] + notas[2]) / 3;
                    mensagem(nome, media);
                    break;
                case 1:
                    matricularNovoAluno(insereAluno());
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        dadosDefault();
       app();        
    }
}
