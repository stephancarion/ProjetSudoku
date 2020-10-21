package be.technifutur.java2020.sudoku.common;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Model;
import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Vue;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class AbstractSudokuCtrl {
    private final Scanner sc = new Scanner(System.in);
    private AbstractSudokuVue vue;
    private AbstractSudokuModel model;
    private int nbLig;
    private int nbCol;
    private int valMax;

    protected AbstractSudokuCtrl(int nbLig, int nbCol, int valMax){
        this.nbLig=nbLig;
        this.nbCol=nbCol;
        this.valMax=valMax;
    }

    private void askInputValue(){
        System.out.println("Veuillez saisir une chaîne  de type l.c.v où :\n" +
                "- l représente le numéro de la ligne (entre 1 et " +nbLig+ ")\n"+
                "- c représente le numéro de la colonne (entre 1 et "+nbCol+")\n"+
                "- v représente une valeur (entre 1 et "+valMax+")\n"+
                "\n"+
                "Pour quitter entrez 'q' ou 'Q'.");
        String input = sc.nextLine();

        setValue(input);

    }

    private void setValue(String input){

        if(input.equalsIgnoreCase("q")){
            System.out.println("Au revoir");
        }else if(Pattern.matches("[1-"+String.valueOf(nbLig)+
                                        "]\\.[1-"+String.valueOf(nbCol)+
                                        "]\\.[1-"+String.valueOf(valMax)+"]",input)){
            int line = 0;
            int column = 0;
            char value = 0;
            if (Pattern.matches("\\d\\.\\d\\.\\d",input)){ // lig et col à un chiffre
                line = Integer.parseInt(input.substring(0,1)) - 1;
                column = Integer.parseInt(input.substring(2,3)) -1;
                value = input.charAt(4);
            }else if (Pattern.matches("\\d\\d\\.\\d\\.\\d",input)){ // lig à 2 chiffres, col à 1 chiffre
                line = Integer.parseInt(input.substring(0,2)) - 1;
                column = Integer.parseInt(input.substring(3,4)) -1;
                value = input.charAt(5);
            }else if (Pattern.matches("\\d\\.\\d\\d\\.\\d",input)){ // lig à 1 chiffre, col à 2 chiffres
                line = Integer.parseInt(input.substring(0,1)) - 1;
                column = Integer.parseInt(input.substring(2,4)) -1;
                value = input.charAt(5);
            }else if (Pattern.matches("\\d\\d\\.\\d\\d\\.\\d",input)){ // lig à 2 chiffres, col à 2 chiffres
                line = Integer.parseInt(input.substring(0,2)) - 1;
                column = Integer.parseInt(input.substring(3,5)) -1;
                value = input.charAt(6);
            }
            model.setValue(value,line,column);
            vue.afficheGrille();
            this.askInputValue();
        }else{
            System.out.println("Erreur de saisie");
            this.askInputValue();
        }
    }

    public void setVue(AbstractSudokuVue vue){
        this.vue=vue;
    }

    public void setModel(AbstractSudokuModel model){
        this.model=model;
    }

    public void start(){
        vue.afficheGrille();
        this.askInputValue();
    }

}
