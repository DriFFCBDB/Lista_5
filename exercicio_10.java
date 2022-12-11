import java.util.Scanner;

public class exercicio_10
{
    public static void main(String[] args) throws Exception
    {

        Scanner leitor = new Scanner(System.in);

        String a = "Você ganhou, parabéns!\n";
        String b = "Você perdeu!";
        String c = "Ponto\n";

        System.out.println("Jogo de Craps\n");

        while (true)
        {
            System.out.println("Girar os dados ?  S ou N: ");
            String jogar = leitor.next();

            if (jogar.equalsIgnoreCase("n"))
            {
                break;
            } else {
                int resultado = randomDados();
                if (resultado == 7 || resultado == 11)
                {
                    System.out.println(a);
                    break;
                } else if (resultado == 2 || resultado == 3 || resultado == 12)
                {
                    System.out.println(b);
                    break;
                } else {
                    System.out.println(c);
                }
                while (true)
                {
                    System.out.println("Girar os dados novamente ? S ou N: ");
                    String jogar2 = leitor.next();

                    if (jogar2.equalsIgnoreCase("N"))
                    {
                        break;
                    } else
                    {
                        int resultado2 = randomDados();

                        if (resultado == resultado2)
                        {
                            System.out.println(a);
                            break;
                        } else if (resultado2 == 7)
                        {
                            System.out.println(b);
                            break;
                        } else
                        {
                            System.out.println("Não foi dessa vez!\n");
                        }
                    }

                }
            }
        }

    }

    public static int randomDados()
    {
        int dado1 = (int) (1 + Math.random() * (7 - 1));
        int dado2 = (int) (1 + Math.random() * (7 - 1));

        int soma = dado1 + dado2;
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("A soma dos dados foi: " + soma);

        return soma;

    }
}
