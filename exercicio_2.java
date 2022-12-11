import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int n = leitor.nextInt();

        imprimirLinhas(n);

        leitor.close();

    }

    public static void imprimirLinhas(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println(" ");
        }
    }

}
