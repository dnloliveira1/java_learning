import java.util.Scanner;

public class ex6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double salmin = 0, htrabalhadas = 0, hextras = 0;
        int ndependentes= 0;
        double ValHorasTrabalhadas = 0, ValSalarioMes = 0, ValSalarioFam = 0, ValHorasExtras = 0, ValImposto = 0, ValSalarioBruto = 0, SalarioFuncionario = 0;

        System.out.println("Informar salario minimo");
        salmin = input.nextDouble();
        System.out.println("Informar horas trabalhadas");
        htrabalhadas = input.nextDouble();
        System.out.println("Informar numero de dependentes");
        ndependentes = input.nextInt();
        System.out.println("Informar numero de horas extras");
        hextras = input.nextDouble();
        
        ValHorasTrabalhadas = salmin * 0.1;
        ValSalarioMes = htrabalhadas * ValHorasTrabalhadas;
        ValSalarioFam = salmin * 0.05;
        ValHorasExtras = ValHorasTrabalhadas * 1.5;
        ValSalarioBruto = ValSalarioMes + (ValSalarioFam * ndependentes) + ValHorasExtras;
        ValImposto = ValSalarioBruto * 0.1;
        SalarioFuncionario = ValSalarioBruto - ValImposto;

        System.out.printf("salario do funcionario: %.2f\n", SalarioFuncionario);
    }
}
