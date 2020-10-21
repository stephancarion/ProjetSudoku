package be.technifutur.java2020.sudoku.sudoku4x4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Sudoku4x4Ctrl {
    private final Scanner sc = new Scanner(System.in);
    private Sudoku4x4Vue vue;
    private Sudoku4x4Model model;

    private void askInputValue(){
        System.out.println("Veuillez saisir une chaîne  de type l.c.v où :\n" +
                "- l représente le numéro de la ligne (entre 1 et 4)\n"+
                "- c représente le numéro de la colonne (entre 1 et 4)\n"+
                "- v représente une valeur (entre 1 et 4)\n"+
                "\n"+
                "Pour quitter entrez 'q' ou 'Q'.");
        String input = sc.nextLine();

        setValue(input);

    }

    private void setValue(String input){

        if(input.equalsIgnoreCase("q")){
            System.out.println("Au revoir");
        }else if(Pattern.matches("[1-4]\\.[1-4]\\.[1-4]",input)){
            int line = Integer.parseInt(input.substring(0,1)) - 1;
            int column = Integer.parseInt(input.substring(2,3)) -1;
            char value = input.charAt(4);
            model.setValue(value,line,column);
            vue.afficheGrille();
            this.askInputValue();
        }else{
            System.out.println("Erreur de saisie");
            this.askInputValue();
        }
    }

    public void setVue(Sudoku4x4Vue vue){
        this.vue=vue;
    }

    public void setModel(Sudoku4x4Model model){
        this.model=model;
    }

    public void start(){
        vue.afficheGrille();
        this.askInputValue();
    }

    public static void main(String[] args) {
        Sudoku4x4Ctrl c = new Sudoku4x4Ctrl();
        Sudoku4x4Vue v = new Sudoku4x4Vue();
        Sudoku4x4Model m = new Sudoku4x4Model();

        c.setVue(v);
        c.setModel(m);
        v.setModel(m);

        c.start();
    }
}
