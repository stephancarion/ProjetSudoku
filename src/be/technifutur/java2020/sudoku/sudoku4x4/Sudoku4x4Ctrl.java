package be.technifutur.java2020.sudoku.sudoku4x4;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Sudoku4x4Ctrl {
    private String input = new String();
    private Sudoku4x4Vue vue = new Sudoku4x4Vue();
    private Sudoku4x4Model model = new Sudoku4x4Model();

    public void setVue(Sudoku4x4Vue vue){
        this.vue=vue;
    }

    public void setModel(Sudoku4x4Model model){
        this.model=model;
    }

    public void askInputValue(){
        Scanner sc = new Scanner();
        String input = new String();

        while(!isValidInputValue(String input)) {
            vue.afficheGrille();
            System.out.println("Veuillez entrez une chaîne type lig.col.val (ex : \"1.1.2 pour entrer la valeur 2 en lig 1 col 1\").\n" +
                    " Pour quitter entrez 'q' ou 'Q'.\n");
            input = sc.nextLine();
        }

    }

    public boolean isValidInputValue(String input) {
        boolean valid =false;

        if ("q".equalsIgnoreCase(input)){
            valid = true;
        }else{
            String[] tabStr = input.split(".");
            if (tabStr.length == 3){
                for (int i=0; i< tabStr.length; i++){
                    valid = Integer[i]
                }

            }
        }
        return valid;
    }

    public String addValue(){

        /*boolean estValide = false;
        String input = new String();
        Scanner sc = new Scanner(System.in);
        int ligne = 0, colonne = 0;
        char value = 0;


        while (!estValide){
            System.out.println("Veuillez entrez une chaîne type lig.col.val (ex : \"1.1.2 pour entrer la valeur 2 en lig 1 col 1\").\n" +
                    " Pour quitter entrez 'q' ou 'Q'.\n");
            input = sc.nextLine();
            estValide = input.equalsIgnoreCase("q") ||
                    (
                            input.length()==5 &&
                            Character.isDigit(input.charAt(0)) &&
                            input.charAt(1) == '.' &&
                            Character.isDigit(input.charAt(2)) &&
                            input.charAt(3) == '.' &&
                            Character.isDigit(input.charAt(4))
                    );
        }

        if (!input.equalsIgnoreCase("q")) {
            ligne = Character.getNumericValue(input.charAt(0)) - 1;
            colonne= Character.getNumericValue(input.charAt(2)) - 1;
            value = input.charAt(4);
            model.setValue(value,ligne,colonne);
        }

        return input;*/
    }

    public static void main(String[] args) {
        Sudoku4x4Ctrl ctrl = new Sudoku4x4Ctrl();
        Sudoku4x4Model model = new Sudoku4x4Model();
        Sudoku4x4Vue vue = new Sudoku4x4Vue();
        String input = new String();

        ctrl.setVue(vue);
        ctrl.setModel(model);
        vue.setModel(model);

        while (!input.equalsIgnoreCase("q")){
            vue.afficheGrille();
            input =ctrl.addValue();
        }
    }
}
