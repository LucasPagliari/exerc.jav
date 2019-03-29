import java.util.Scanner;


public class Exerc5 {

    static int conversorSeg(int h) {
        int sec;
        sec = h * 3600;
        return (sec);
    }

    static int conversorSeg(int h, int m) {
        int sec;
        sec = (h * 3600) + (m * 60);
        return sec;
    }

    static int conversorSeg(int h, int m, int s) {
        int sec;
        sec = (h * 3600) + (m * 60) + s;
        return (sec);
    }

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int hora, min, seg;
        int opt, resultado = 0;

        System.out.println("Escolha o formato de tempo:");
        System.out.println("1 - hh");
        System.out.println("2 - hh:mm");
        System.out.println("3 - hh:mm:ss");
        opt = keyb.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Digite a hora");
                hora = keyb.nextInt();

                resultado = conversorSeg(hora);
                break;

            case 2:
                System.out.println("Digite a hora");
                hora = keyb.nextInt();
                System.out.println("Digite os minutos");
                min = keyb.nextInt();

                resultado = conversorSeg(hora, min);
                break;

            case 3:
                System.out.println("Digite a hora");
                hora = keyb.nextInt();
                System.out.println("Digite os minutos");
                min = keyb.nextInt();
                System.out.println("Digite os Segundos");
                seg = keyb.nextInt();

                resultado = conversorSeg(hora, min, seg);
                break;

            default:
                System.out.println("Opção Inválida!");
        }

        System.out.println("Conversão em segundos: " + resultado);

    }
}
