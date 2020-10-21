package be.technifutur.java2020.sudoku;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Vue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choix = 0;

        do{
            System.out.println("Sudoku");
            System.out.println("Quel sudoku souhaitez-vous afficher ?");
            System.out.println(" 1 - Sudoku 4x4");
            System.out.println(" 2 - Sudoku 9x9");
            System.out.println(" 3 - Sudoku Etoile");
            System.out.println(" 0 - Sortie");
            String sc = new Scanner(System.in).nextLine();

            choix =Integer.parseInt(sc);

            if (choix == 1){
                Sudoku4x4Vue s1 = new Sudoku4x4Vue();
                s1.afficheGrilleVide();
            }/*else if (choix == 2){
                Sudoku9x9Vue s2 = new Sudoku9x9Vue();
                s2.afficheGrilleVide();
            } else if (choix == 3){
                SudokuEtoile s3 = new SudokuEtoile();
                s3.afficheGrilleVide();
            }*/

        }while(choix != 0);








    }
}
