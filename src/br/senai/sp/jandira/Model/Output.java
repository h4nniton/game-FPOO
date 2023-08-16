package br.senai.sp.jandira.Model;

public class Output {

    public void PrintPlayer(Player player){

        System.out.println("");
        System.out.print("-------------- Player --------------");
        System.out.println("");
        System.out.println("O nome do player é: " + player.nome);
        System.out.println("A skin do seu player é: " + player.skin);
        System.out.println("A vida do seu player é: " + player.getLife());
        System.out.println("");
        System.out.print("------------------------------------");
        System.out.println("");


    }

    public void PrintEnemy(Enemy enemy){

        System.out.println("");
        System.out.println("-------------- Enemy --------------");
        System.out.println("");
        System.out.println("O nome do enemy é: " + enemy.nome);
        System.out.println("A skin do seu enemy é: " + enemy.skin);
        System.out.println("A vida do seu player é: " + enemy.getLife());
        System.out.println("");
        System.out.println("------------------------------------");


    }

}
