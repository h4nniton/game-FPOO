package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Register {

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Player */
    Player player = new Player();

    /** Instancia Enemy */
    Enemy enemy = new Enemy();

    public void bothRegister(){

        PlayerRegister();
        EnemyRegister();

    }

    public void PlayerRegister(){


        System.out.println("-------------- Cadastro Player --------------");
        System.out.println("Qual é o seu nome? ");
        player.nome = teclado.nextLine();
        System.out.println("Qual é a sua skin ( red - blue - purple )? ");
        player.skin = teclado.nextLine();
        System.out.println("------- Player Cadastrado com Sucesso -------");
        System.out.println("");

    }

    public void EnemyRegister(){

        System.out.println("-------------- Cadastro Enemy --------------");
        System.out.println("Qual é o seu nome? ");
        player.nome = teclado.nextLine();
        System.out.println("Qual é a sua skin ( red - blue - purple )? ");
        player.skin = teclado.nextLine();
        System.out.println("-------- Enemy Cadastrado com Sucesso -------");

    }

    public void Decision(){

        String decision;

        System.out.println("Seja Bem-Vindo !!");
        System.out.println("Deseja Cadastrar: Player - Enemy - Ambos ");
        decision = teclado.nextLine();

        switch (decision) {

            case "Player":
                PlayerRegister();
                break;

            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                bothRegister();

            default:
                System.out.println("Digite uma opção válida!");
        }

    }







}
