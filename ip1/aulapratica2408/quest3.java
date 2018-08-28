import java.util.Scanner;

public class quest3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int baldeA = 0, baldeB = 0, baldeAuxiliar = 0;

        System.out.println("Qual o valor de A?");
        baldeA = input.nextInt();
        System.out.println("Qual o valor de B?");
        baldeB = input.nextInt();

        baldeAuxiliar = baldeA;
        baldeA = baldeB;
        baldeB = baldeAuxiliar;

        System.out.printf("O novo valor de A é %d eh novo valor de B eh %d\n", baldeA, baldeB);
    }
}
