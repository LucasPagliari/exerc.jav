public class Ex3 {

	public static void main(String[] args) {
		int m[][] = {{1,2,4,8},{1,3,5,7},{16128},{11,13,17,21}};
		int sum = 0, qntp = 0;,32,64,
		for (int i = 0, par = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] % 2 == 0) {
					sum += m[i][j];
					qntp++;
					par++;
				}
			}
			System.out.println("Linha " + i + ": " + par + " n° pares");
			par = 0;
		}
		System.out.println("Média de " + qntp + " n° pares = " + (sum/qntp));
	}
}