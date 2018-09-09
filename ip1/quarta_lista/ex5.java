import java.util.Scanner;

public class ex5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double SalMin = 0, horas = 0, ValHTrab = 0, percent = 0.05, imposto = 0.075, total = 0, desconto = 0;
        
        System.out.println("Pf, informar:"); 
        System.out.print("Qual o valor do salario minimo? ");
        SalMin = input.nextDouble();
        System.out.print("Quantas horas trabalhadas? ");
        horas = input.nextDouble();
        System.out.println();
        
        ValHTrab = horas * (percent * SalMin);
        
        if(ValHTrab > 1500)
        {
            desconto = ValHTrab * imposto;
            total = ValHTrab - desconto;
            System.out.printf("O seu salario total foi de R$%.2f\nO desconto do imposto de renda foi de R$%.2f\nO salario a receber pos o desconto foi de R$%.2f\n", ValHTrab, desconto, total);
        }   
        else
            System.out.printf("O seu salario total foi de R$%.2f\n", ValHTrab);
    }
}
