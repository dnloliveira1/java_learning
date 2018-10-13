/* *************************************************************************
*    JOGO DA SENHA, v1.0                                                   *
*    Joguinho para o usuario adivinhar a senha, ganha se acertar           *
*    a senha dentro das quantidads de tentativas pelo qual o nivel         *
*    selecionado oferece, o numero é sorteado entre 1 a 100.               *
*                                                                          *
*    Copyright (C) 2018 by Daniel de Oliveira Silva                        *
*                                                                          *
*    This program is free software; you can redistribute it and/or modify  *
*    it under the terms of the GNU General Public License as published by  *
*    the Free Software Foundation; either version 2 of the License, or     *
*    (at your option) any later version.                                   *
*                                                                          *
*    This program is distributed in the hope that it will be useful,       *
*    but WITHOUT ANY WARRANTY; without even the implied warranty of        *
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
*    GNU General Public License for more details.                          *
*                                                                          *
*    You should have received a copy of the GNU General Public License     *
*    along with this program; if not, write to the                         *
*    Free Software Foundation, Inc.,                                       *
*    59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
*                                                                          *
*    To contact the author, please write to:                               *
*    Daniel de Oliveira Silva <dnl.oliveira11@gmail.com>                   *
*    Phone: 55 (81) 99890-9860                                             *
* ************************************************************************ *
*/

import java.util.Scanner;
import java.security.SecureRandom;

public class trabson1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();   

        int NivelDificuldade = 0, chances = 0, tentativas = 0, senha = 0, chute = 0, VezesJogadas = 0;
        int MenorValor = 0, MaiorValor = 0;
        char again = 0;

        System.out.println("\n\t\t\t\t\tBem vindo ao jogo da senha!!!\nSelecione a dificuldade para jogar:");

        do
        {
            if(senha != 0) // Se já jogou pelo menos uma vez...
                System.out.println("\n\t\t\t\t\tBem vindo novamente ao jogo da senha!!!\nSelecione a dificuldade para jogar:");

            System.out.println("* Nivel 1 - Facil (10 tentativas) *\t* Nivel 2 - Medio (8 tentativas) *\t* Nivel 3 - Dificil (5 tentativas) *"); // Dava pra fazer um for, se fossem mtos niveis, ou se o ususario determinasse a quantidade de niveis
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

            /*Setando o size das variaveis, tem sempre que fazer qnd resetar o jogo*/
            MaiorValor = 100;
            MenorValor = 1;

            senha = random.nextInt(MaiorValor - MenorValor) + MenorValor; // random.nextInt(99) + 1, vai de 1 a 100

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
                else // VENCEU BREAK;
                {
                    System.out.printf("\nParabens! Voce acertou com %d tentativas!\n", VezesJogadas);
                    break;
                }

                if(VezesJogadas == chances) // PERDEU BREAK
                {
                    System.out.println("Infelizmente, voce nao conseguiu acertar a senha. Tente novamente mais tarde!");
                    break;
                }

                if(chute == (senha + 1) || chute == (senha - 1))
                    System.out.println("Voce esta QUENTE!");

                System.out.printf("Tente outra vez. Infomer um valor entre %d e %d\n", MenorValor, MaiorValor);
            }

            System.out.print("Try again? (y/n) ");
            again = input.next().charAt(0);
            again = Character.toLowerCase(again);

            while(again != 'y' && again != 'n') // TEM QUE SER &&
            {
                System.out.print("Pf, informar uma letra valida (y/n) ");
                again = input.next().charAt(0);
                again = Character.toLowerCase(again);
            }
        }while(again == 'y');
    }
}

