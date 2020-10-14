package be.technifutur.java2020.sudoku.sudoku4x4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sudoku4x4Ctrl {
    private String input = new String();
    private Sudoku4x4Vue vue = new Sudoku4x4Vue();
    private Sudoku4x4Modele model = new Sudoku4x4Modele();

    public void setVue(Sudoku4x4Vue vue){
        this.vue=vue;
    }

    public void setModel(Sudoku4x4Modele model){
        this.model=model;
    }

    public void addValue(){
        boolean estValide = true;
        String input = new String();


            do {
                System.out.println("Veuillez entrez une chaîne type val.lig.col (ex : \"2.1.1 pour entrez 2 en lig 1 col 1\")\n" +
                        " ou Q/q pour quitter");
                input = new Scanner(System.in).nextLine();

                estValide = (input.length() == 1 && (input.charAt(0) == 'q' || input.charAt(0) == 'Q'))
                        || (input.length() == 5 && input.charAt(0) >= '1' && input.charAt(0) <= '4'
                        && input.charAt(1) == '.'
                        && input.charAt(2) >= '1' && input.charAt(2) <= '4'
                        && input.charAt(3) == '.'
                        && input.charAt(4) >= '1' && input.charAt(4) <= '4');
            } while (!estValide);

            if (input.length() == 5) {
                char valeur = input.charAt(0);
                int ligne = Integer.parseInt(input.substring(2, 3)) - 1;
                int colonne = Integer.parseInt(input.substring(4, 5)) - 1;
                model.setValue(valeur, ligne, colonne);
            }

    }

    public static void main(String[] args) {
        Sudoku4x4Ctrl ctrl = new Sudoku4x4Ctrl();
        Sudoku4x4Modele model = new Sudoku4x4Modele();
        Sudoku4x4Vue vue = new Sudoku4x4Vue();

        ctrl.setVue(vue);
        ctrl.setModel(model);
        vue.setModel(model);

        vue.afficheGrille();
        ctrl.addValue();
        vue.afficheGrille();
    }
}
