import java.util.Scanner;

public class ex4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        
        System.out.println("Qual o numero1 e o numero2, nessa mesma ordem");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        if(num1 > num2)
            System.out.printf("O maior numero dentre os dois inseridos foi o numero1: %d\n", num1);
        else if(num2 > num1)
            System.out.printf("O maior numero dentre os dois inseridos foi o numero2: %d\n", num2);
        else
            System.out.println("O numeros sao iguais");
    }
}

