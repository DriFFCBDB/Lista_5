import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um Numero: ");
        int n = leitor.nextInt();
        leitor.close();

        imprimirLinha(n);

    }

    public static void imprimirLinha(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");

        }
    }
}