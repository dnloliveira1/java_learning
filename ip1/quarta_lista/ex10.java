import java.util.Scanner;

public class ex10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int HorasExtras = 0, HorasFaltou = 0, premio = 0;
        double total = 0; // Nao se podia colocar o total no formato int, ver revisao...
        
        System.out.println("Pf, informar:"); 
        System.out.print("Qual o numero de horas que vc trabalhou ");
        HorasExtras = input.nextInt();
        System.out.print("Qual o numero de horas que vc fatlou ao trabalho? ");
        HorasFaltou = input.nextInt();
        System.out.println();
        
        /* 
          Revisando...
          
          O retorno de fato sera em double, nesse procedimento double recebe double, logo ok!
          
          double = double + double || double = int + double || double = double + int (ok)
          double = double - double || double = int - double || double = double - int (ok)
          double = double * dobule || dobule = int * double || double = double * int (ok)
          double = double / double || double = int / double || double = double / int (ok)
          
          O retorno de fato sera em double, pois nesse caso o double converte o int para double [Ex.: (double num = 3) == (double num = 3.0)]
          double = int + int || double = int - int || double = int * int || double = int / int (ok)
          
          (Obs.: qualquer operacao que tenha um double com - um int ou um double, o retorno sera em double)
            
          Verificando o inverso...
          Observa-se que o retorno nao sera em int, e sim em double! Nesse procedimento de um int receber um double acaba acarretando em um erro, de possibilidade de perda de precisao
         
          int = double + double || int = int + double || int = double + int (error: possible loss of precision) required: int found: double
          int = double - double || int = int - double || int = double - int (error: possible loss of precision) required: int found: double
          int = double * dobule || int = int * double || int = double * int (error: possible loss of precision) required: int found: double
          int = double / double || int = int / double || int = double / int (error: possible loss of precision) required: int found: double
          
          O retorno de fato sera em int, nesse procedimento int recebe int, logo ok!
          int = int + int || int = int - int || int = int * int || int = int / int (ok) required: int found: int
          
          Eh istoTM
        */
        
        total = HorasExtras - (2.0/3.0 * HorasFaltou); // 2/3 = (int) 0 <=> 2.0/3.0 = (double) 0.666
        
        
        if(total > 40)
            premio = 200;
        else if(total > 30)
            premio = 175;
        else if(total > 20)
            premio = 150;
        else if(total > 10)
            premio = 125;
        else
            premio = 100;
            
        System.out.printf("O funcionario recebera R$%d de gratificacao de Natal\n", premio);
    }
}