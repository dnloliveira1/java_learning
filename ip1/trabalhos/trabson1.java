import java.util.Scanner;
import java.security.SecureRandom;

public class trabson1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();   
        
        int NivelDificuldade = 0, chances = 0, tentativas = 0, senha = 0, chute = 0, VezesJogadas = 0;
        int MenorValor = 1, MaiorValor = 100;
        char again = 0;
        
        System.out.println("\n\t\t\t\t\tBem vindo ao jogo da senha!!!\nSelecione a dificuldade para jogar:");
        
        do
        {
            if(senha != 0)
                System.out.println("\n\t\t\t\t\tBem vindo novamente ao jogo da senha!!!\nSelecione a dificuldade para jogar:");
            
            System.out.println("* Nivel 1 - Facil (10 tentativas) *\t* Nivel 2 - Medio (8 tentativas) *\t* Nivel 3 - Dificil (5 tentativas) *");
            System.out.print("\nInsira o nivel que voce deseja jogar ");
            
            NivelDificuldade = input.nextInt();
            while(NivelDificuldade < 1 || NivelDificuldade > 3)
            {
                System.out.print("Pf, inserir um nivel de dificuldade valido (1 a 3) ");
                NivelDificuldade = input.nextInt();
            }
            System.out.println();
            
            if(NivelDificuldade == 1)
                chances = 10;
            else if(NivelDificuldade == 2)
                chances = 8;
            else
                chances = 5;
            
            senha = random.nextInt(MaiorValor - MenorValor) + MenorValor; // Mais uma vez novamente
            
            System.out.printf("Informe um valor entre %d e %d\n", MenorValor, MaiorValor);
            
            for(VezesJogadas = 1; chances >= VezesJogadas; VezesJogadas++)
            {
                System.out.printf("Tentiva %d: ", VezesJogadas);
                chute = input.nextInt();
                
                while(chute > MaiorValor || chute < MenorValor)
                {
                    System.out.print("Tentiva invalida, informar valores dentro da faixa ");
                    chute = input.nextInt();
                }
                
                if(chute > senha)
                    MaiorValor = chute;
                else if(chute < senha)
                    MenorValor = chute;
                else
                {
                    System.out.printf("\nParabens! Voce acertou com %d tentativas!\n", VezesJogadas);
                    break;
                }
                
                if(chute == (senha + 1) || chute == (senha - 1))
                    System.out.println("Voce esta QUENTE!");
                
                System.out.printf("Tente outra vez. Infomer um valor entre %d e %d\n", MenorValor, MaiorValor);
            }
            
            if(VezesJogadas == chances)
                System.out.println("Infelizmente, voce nao conseguiu acertar a senha. Tente novamente mais tarde!");
                
            /*Zerando as variaveis*/
            MaiorValor = 0;
            MenorValor = 0;
            
            System.out.print("Try again? (y/n) ");
            again = input.next().charAt(0);
            
            while(again != 'y' && again != 'n') // TEM QUE SER &&
            {
                System.out.print("Pf, informar uma letra valida (y/n) ");
                again = input.next().charAt(0);
            }
        }while(again == 'y');
    }
}
