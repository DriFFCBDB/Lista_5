import java.util.Scanner;

public class exercicio_9 {

    public static void main(String[] args) throws Exception {
        pegarNumero();
    }

    public static void pegarNumero() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número a ser invertido: ");
        int numero = leitor.nextInt();
        leitor.close();

        inverteNumero(numero);
    }

    public static void inverteNumero(int numero) {
        int i = 0;

        while (numero > 0) {
            i *= 10;
            i += (numero % 10);
            numero /= 10;

        }
        System.out.println("O número invertido é: " + i);
    }

}
