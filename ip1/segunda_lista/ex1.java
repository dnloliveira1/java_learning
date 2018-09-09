import java.util.Scanner;

public class ex1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double preco = 0, PrecoFinal = 0, PercentualDesconto = 0, ValorDesconto = 0;
        
        System.out.println("Favor, inserir o preço do produto e o percentual de desconto, em porcentagem, nessa ordem");
        preco = input.nextDouble();
        PercentualDesconto = input.nextDouble();
        
        PercentualDesconto = 1 - PercentualDesconto;
        PrecoFinal = preco * PercentualDesconto;
        ValorDesconto = preco - PrecoFinal;
        
        System.out.println();
        System.out.printf("Preco real do produto %.2f\nPreco final do produto: %.2f\nQunato voce esta economizando: %.2f\n", preco, PrecoFinal, ValorDesconto);
    }
}
