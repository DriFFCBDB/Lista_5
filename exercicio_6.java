import java.util.Scanner;

public class exercicio_6
{
    public static void main(String[] args) throws Exception
    {
        Scanner leitor = new Scanner(System.in);

        int horario, minutos, horarioConvertido;

        while (true)
        {
            System.out.print("Digite o horario (Formato 24): ");
            horario = leitor.nextInt();
            System.out.print("Digite os minutos: ");
            minutos = leitor.nextInt();

            horarioConvertido = converteHoras(horario);
            saidaHorario(horario, horarioConvertido, minutos);

            System.out.println("Deseja converter um novo horário ? [Sim/Nao]");
            String resp = leitor.next();

            if (resp.equalsIgnoreCase("Não"))
            {
                break;
            }
        }
        leitor.close();
    }

    public static int converteHoras(int horario)
    {
        if (horario > 12)
        {
            horario -= 12;
        } else
        {
            return horario;
        }
        return horario;
    }

    public static void saidaHorario(int horario, int horarioConvertido, int minutos)
    {
        String P = "P.M";
        String A = "A.M";

        if (horario > 12)
        {
            System.out.println("As horas convertidas foi: " + horarioConvertido + ":" + minutos + " " + P);
        } else
        {
            System.out.println("As horas convertidas foi: " + horarioConvertido + ":" + minutos + " " + A);
        }
    }
}
