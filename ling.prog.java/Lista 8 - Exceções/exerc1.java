
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

    public static void verifica(String opr) throws Exception {
        if (!opr.equals("+") && !opr.equals("-") && !opr.equals("*") && !opr.equals("/")) {
            throw new Exception("Operador invalido!");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double resultado = 0, x, y;
        String operador, valor, numero;

        System.out.println("Digite o valor: ");
        valor = entrada.nextLine();

        System.out.println("Digite a opera��o: ");
        operador = entrada.nextLine();

        System.out.println("Digite o valor: ");
        numero = entrada.nextLine();

        try {
            verifica(operador);
            x = Double.parseDouble(valor);
            y = Double.parseDouble(numero);
            if (operador.equals("*")) {
                resultado = x * y;
                System.out.println("Resultado = " + resultado);
            } else if (operador.equals("/")) {
                resultado = x / y;
                System.out.println("Resultado = " + resultado);
            } else if (operador.equals("+")) {
                resultado = x + y;
                System.out.println("Resultado = " + resultado);
            } else if (operador.equals("-")) {
                resultado = x - y;
                System.out.println("Resultado = " + resultado);
            }

        } catch (NumberFormatException e) {
            System.out.println("Valor invalido!");
   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
}
