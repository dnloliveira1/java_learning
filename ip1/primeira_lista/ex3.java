import java.util.Scanner;

public class ex3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double inter = 0, prat = 0, fina = 0, nota = 0;
        double pesointer = 0.3, pesoprat = 0.2, pesofina = 0.5;

        System.out.println("Informe as notas do exame intermediario, exame pratico e exame final, nessa ordem");
        inter = input.nextDouble();
        prat = input.nextDouble();
        fina = input.nextDouble();
        nota = inter * pesointer + prat * pesoprat + fina * pesofina;
        System.out.printf("Nota final: %.2f\n", nota);
    }
}
