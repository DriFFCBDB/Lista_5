import java.util.Scanner;
public class exercicio_5 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do Produto: ");
        double valorProduto = leitor.nextDouble();
        System.out.print("Digite a porcentagem do imposto: ");
        double porcentagem = leitor.nextDouble();
        leitor.close();

        double valorFinal = somaImposto(porcentagem, valorProduto);

        System.out.println("O valor do produto com" + porcentagem + "% de imposto é de R$ " + valorFinal);



    }


    public static double somaImposto(double taxaImposto, double custoItem) {
        double porcentagem = taxaImposto / 100;



        return custoItem + (porcentagem * custoItem);
    }
}
