import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int m[][] = new int[10][5];
        int sala = 0, aluno = 0;
		System.out.print(m.length);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Matriz A["+i+"]"+"["+j+"]: ");
				m[i][j] = keyb.nextInt(); // troque por 5 pra teste mais rápido	
			}	
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				aluno += m[i][j];
				
			}
			aluno = aluno / m[i].length;
			sala += aluno;
			System.out.print("Aluno[" + i + "] média: " + aluno + "\t");
			if (aluno < 6) {
				System.out.println("Aluno Reprovado");
			}
			else {
				System.out.println("Aluno Aprovado");		
			}
			aluno = 0;
		}
		System.out.print("Média da Sala: " + (sala / m.length));

	}
}