public class Ex4 {

    public static void main(String[] args) {
        int m[][] = {{3, 4, 5, 7, 20, 13}, {17, 9, 2, 8, 11, 1}, 
        {-4, 4, 22, 13, 40, 5}};
        int max, min;
        max = m[0][0];
        min = m[0][0];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(max < m[i][j]) max = m[i][j];
                if(min > m[i][j]) min = m[i][j];  
            }
            
        }
        System.out.println("Max:" + max + "\n" + "Min:" + min);
    }
}