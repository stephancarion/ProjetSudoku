package be.technifutur.java2020.sudoku;


import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Ctrl;
import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Model;
import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Vue;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9Ctrl;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9Vue;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9Model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quel sudoku souhaitez-vous?");
        System.out.println("1 - Sudoku 4x4");
        //System.out.println("2 - Sudoku 9x9");
        System.out.println("0 -Quitter");
        System.out.println("Votre choix?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch (input){
            case "1":
                Sudoku4x4Ctrl c4 = new Sudoku4x4Ctrl();
                c4.start();
                break;
            /*case  "2":
                Sudoku9x9Vue v9 = new Sudoku9x9Vue();
                Sudoku9x9Ctrl c9 = new Sudoku9x9Ctrl();
                Sudoku9x9Model m9 = new Sudoku9x9Model();

                v9.setModel(m9);
                c9.setModel(m9);
                c9.setVue(v9);

                c9.start();
                break;*/
            case "0":
                System.out.println("Au revoir");
        }


    }
}
