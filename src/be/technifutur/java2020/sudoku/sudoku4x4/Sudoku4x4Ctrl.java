package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.common.AbstractSudokuCtrl;
import be.technifutur.java2020.sudoku.common.AbstractSudokuModel;
import be.technifutur.java2020.sudoku.common.Position;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Sudoku4x4Ctrl extends AbstractSudokuCtrl{

    private Sudoku4x4Vue vue;
    private Sudoku4x4Model model;

    public Sudoku4x4Ctrl(){
        this.vue = new Sudoku4x4Vue();
        this.model = new Sudoku4x4Model();
        this.setVue(vue);
        this.setModel(model);
        vue.setModel(model);
    }

    protected void afficheDemandeSaisie(){
        String texteAAfficher ="Veuillez saisir une chaîne  de type l.c.v où :\n" +
                                "- l représente le numéro de la ligne (entre 1 et 4))\n"+
                                "- c représente le numéro de la colonne (entre 1 et 4)\n"+
                                "- v représente une valeur (entre 1 et 4)\n"+
                                "\n"+
                                "Pour quitter entrez 'q' ou 'Q'.";
        System.out.println(texteAAfficher);
    }

    protected String returnValidInput() {
        String input;
        boolean validInput=false;

        do{
            input=sc.nextLine(); // récupère la sasie
            validInput = "q".equalsIgnoreCase(input) ||Pattern.matches("[1-4]\\.[1-4]\\.[1-4]",input);
        }while (!validInput);

        return input;
    }

}
