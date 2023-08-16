package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    /**
     * Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);

    /**
     * Instancia Player
     */
    Player player = new Player();

    /**
     * Instancia Enemy
     */
    Enemy enemy = new Enemy();

    Output output = new Output();

    public void bothRegister() {

        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);

    }

    public void PlayerRegister() {


        System.out.println("-------------- Cadastro Player --------------");
        System.out.println("Qual é o seu nome? ");
        player.nome = teclado.nextLine();
        System.out.println("Qual é a sua skin ( red - blue - purple )? ");
        player.skin = teclado.nextLine();
        System.out.println("------- Player Cadastrado com Sucesso -------");
        System.out.println("");

        if (validaPrint != 1) {
            output.PrintPlayer(player);
        }

    }

    public void EnemyRegister() {

        System.out.println("-------------- Cadastro Enemy --------------");
        System.out.println("Qual é o seu nome? ");
        enemy.nome = teclado.nextLine();
        System.out.println("Qual é a sua skin ( red - blue - purple )? ");
        enemy.skin = teclado.nextLine();
        System.out.println("-------- Enemy Cadastrado com Sucesso -------");
        System.out.println("");

        if (validaPrint != 1) {
            output.PrintEnemy(enemy);
        }

    }

    public void Decision() {

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


        }

        System.out.println("Deseja Retornar ao Cadastro [ 1 ou 2 ]?");
        int continuar = teclado.nextInt();

        if (continuar == 1) {
            Decision();
        }



    }
}
