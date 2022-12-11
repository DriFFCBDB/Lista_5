import java.util.Scanner;

public class exercicio_11
{
    public static void main(String[] args) throws Exception 
    {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a data: [DD/MM/AAAA] ");
        String data = leitor.nextLine();
        leitor.close();

        System.out.println(converteData(data));

    }

    public static String retornaMeses(int valor) 
    {
        String meses[] = { "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        return meses[valor];
    }

    public static String converteData(String data) 
    {
        try 
        {
            String[] arrayData = data.split("/");
            int valor = Integer.parseInt(arrayData[1]);

            String dataFormat = arrayData[0] + " de " + retornaMeses(valor) + " de " + arrayData[2];

            return dataFormat;
        } catch (Exception e)
        {
            return null;
        }

    }
}
