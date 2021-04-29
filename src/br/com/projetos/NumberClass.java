package br.com.projetos;

import java.util.Scanner;

public class NumberClass {

    // Objetos
    Scanner objScanner = new Scanner(System.in);

    // Atributos
    private int number;
    private String decision = "";
    private int counter = 1;

    // Métodos
    public void checkNumber() {
        System.out.println("Coloque um número: ");
        number = objScanner.nextInt();

        // Fazendo um while para se continuar o (Y/N) faça um loop novamente para o começo
        while (counter <= number) {

            // Módulo: o número colocado / 2 e o resultado vai ser o resto da divisão que é 0, sendo par
            if (number % 2 == 0) {
                System.out.println("O número é par: " + number);
                System.out.println("Deseja continuar? : (Y/N)");
                // Chamando o atributo decision (String) para receber o objeto Scanner
                decision = objScanner.next();

                if (decision.equalsIgnoreCase("y") || decision.equalsIgnoreCase("s")) {
                    // Fazendo (counter + 1) para que o atributo counter comece com 2 sendo 1 + 1 = 2;
                    System.out.println("Coloque o número " + (counter + 1) + ": ");
                    number = objScanner.nextInt();
                } else {
                    // Dando um break, para que pare a execução e termine o while;
                    break;
                }
            }
            // Módulo: o número colocado / 2 e o resultado forçando o resto da divisão sendo 1, sendo impar
            else if (number % 2 == 1){
                System.out.println("O número é impar: " + number);
                System.out.println("Deseja continuar? : (Y/N)");
                decision = objScanner.next();

                // Fazendo o equalsIgnoreCase para que ele ignore a letra maiúsculo e minúsculo
                if (decision.equalsIgnoreCase("y") || decision.equalsIgnoreCase("s")) {
                    System.out.println("Coloque o número " + (counter + 1) + ": ");
                    number = objScanner.nextInt();
                } else {
                    break;
                }
            }
            // Colocando (obrigatório) um incremento para que ele comece novamente o while;
            counter++;
        }
        // Finalizando o while, e termine com um println;
        System.out.println("Programa finalizado!");
    }
}
