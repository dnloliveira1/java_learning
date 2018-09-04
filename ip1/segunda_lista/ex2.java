import java.util.Scanner;

public class ex2
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        int dias = 0;
        double ValConta = 0, ValMulta = 0, juros = 0, MultaAtraso = 0, JurosAtraso, ValTotal = 0;
        
        System.out.println("Infomar o valor da sua conta que ja deveria estar paga");
        ValConta = input.nextDouble();
        System.out.println("Infomar o valor fixo da multa");
        ValMulta = input.nextDouble();
        System.out.println("Quanto eh o juros, em porcentagem?");
        juros = input.nextDouble();
        System.out.println("Qnts dias se passaram desde o dia do pagamento?");
        dias = input.nextInt();

        MultaAtraso = ValMulta * dias;
        JurosAtraso = (ValConta * juros) * dias;       
        ValTotal = ValConta + MultaAtraso + JurosAtraso;
        
        System.out.println();
        System.out.printf("O valor da multa por %d dias de atraso eh R$ %.2f\nO valor dos juros a ser pago por %d dias de atraso eh R$ %.2f\nO valor total da conta a ser ja com multa e juros eh R$ %.2f\n", dias, MultaAtraso, dias, JurosAtraso, ValTotal);
    }
}
