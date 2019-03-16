public class Ex6 {

	public static void main(String[] args) {
		int m[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int sumdig = 0, sumdig2 = 0, sumli = 0, sumcol = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == j) {
					sumdig += m[i][j];
				}
				if (i + j + 1 == m[i].length) {
					sumdig2 += m[i][j];
				}
				sumli += m[i][j];
				sumcol += m[j][i];
				
			}
			System.out.println("Soma da Linha " + i + ": " + sumli);
			System.out.println("Soma da Coluna " + i + ": " + sumcol);
			System.out.println("------------------------------------");
			sumli = 0;
			sumcol = 0;
		}
        System.out.println("Soma da da Diagonal Principal: " + sumdig);
        System.out.println("Soma da da Diagonal Secundária: " + sumdig2);

		
	}
}