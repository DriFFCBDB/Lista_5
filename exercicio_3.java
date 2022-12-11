import java.util.Scanner;
public class exercicio_3
{
    public static void main(String[] args)
    {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número :" );
        int n1 = leitor.nextInt();
        System.out.println("Digite um número :" );
        int n2 = leitor.nextInt();
        System.out.println("Digite um número:" );
        int n3 = leitor.nextInt();
        System.out.println(soma(n1, n2, n3) );

    }

    private static int soma(int n1, int n2, int n3)
    {

        return n1+n2+n3;

    }

}
