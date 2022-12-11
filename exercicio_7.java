import java.util.Scanner;

public class exercicio_7
{
    public static void main(String[] args) throws Exception
    {
        double total = 0;
        double count = 0;
        Scanner leitor = new Scanner(System.in);

        while (true)
        {
            System.out.print("Digite o valor da Prestação: ");
            double valor = leitor.nextDouble();

            if (valor == 0)
            {
                break;
            }
            System.out.print("Digite o número de dias em atraso: ");
            int dias = leitor.nextInt();

            total += valorPagamento(valor, dias);
            count += 1;
            
        }
        System.out.println("Quantidade total: " + String.format("%.0f", count));
        System.out.println("Valor total das prestações: " + String.format("%.2f", total));
    }

    public static Double valorPagamento(double valor, double dias)
    {
        double juros;
        double multa = (valor * 0.03) + valor;

        if (dias == 0)
        {
            return valor;
        } else
        {
            juros = (multa * dias * 0.001);
        }
        return multa + juros;
    }
}
