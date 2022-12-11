import java.util.Scanner;

public class exercicio_8 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leitor.nextInt();
        leitor.close();

        int qtdDigitos = informarNumero(num);

        System.out.println("O número " + num + " tem " + qtdDigitos + " digitos");

    }

    public static int informarNumero(int a) {

        String s = Integer.toString(a);

        return s.length();
    }
}
