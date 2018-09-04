import java.util.Scanner;

public class quest1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double possui = 0, dolar = 0.24, euros = 0.21, libras = 0.19;

        System.out.println("Quanto tu tens?");
        possui = input.nextDouble();
        System.out.printf("Saca tu tens, para dolar: %.2f,\n para euros: %.2f,\n para libras %.2f\n", possui * dolar, possui * euros, possui * libras);  
    }
}
