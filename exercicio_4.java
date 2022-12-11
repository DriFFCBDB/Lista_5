import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) throws Exception
    {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int a = leitor.nextInt();
        leitor.close();

        String retorno = umArgumento(a);

        System.out.println(retorno);


    }

    public static String umArgumento(int a)
    {
        String retorno;

        if (a > 0)
        {
            retorno = "P";
        } else
        {
            retorno  = "N";
        }

        return retorno;


    }
}
