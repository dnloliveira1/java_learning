import java.util.Scanner;

public class ex3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        
        System.out.print("Informar o numero para verificar se eh par ou impar ");
        numero = input.nextInt();
        
        System.out.printf("O numero que vc informou: ");
        if(numero%2 == 0)
            System.out.printf("%d, ele eh par\n", numero);
        else
            System.out.printf("%d, ele eh impar\n", numero);
    }
}