import java.util.Scanner;

public class exercicio_13
{
    public static void main(String[] args) throws Exception
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o numero de Linhas de 1 à 20: ");
        int linhas = leitor.nextInt();
        System.out.print("Digite o numero de Colunas de 1 à 20: ");
        int colunas = leitor.nextInt();
        leitor.close();

        desenhaRetangulo(linhas, colunas);
    }

    public static void desenhaRetangulo(int linha, int coluna)
    {

        if ((linha < 1))
        {
            linha = 1;
        } else if (linha > 20)

        {
            linha = 20;
        } else if (coluna < 1)

        {
            coluna = 1;
        } else if (coluna > 20) {
            coluna = 20;
        }

        System.out.print("+");
        for (int i = 0; i < linha; i++)
        {
            System.out.print("-");
        }
        System.out.println("+");
        for (int i = 0; i < coluna; i++)
        {
            System.out.print("|");
            for (int j = 0; j < linha; j++)
            {
                System.out.print(" ");
            }
            System.out.println("|");

        }
        System.out.print("+");
        for (int i = 0; i < linha; i++)
        {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
