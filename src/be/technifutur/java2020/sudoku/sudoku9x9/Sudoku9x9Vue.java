package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.Sudoku;

public class Sudoku9x9Vue implements Sudoku {
    private Sudoku9x9Model model;
    private String grille = "" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n";

    public Sudoku9x9Vue(){
        grille = grille.replace(".","%s");
    }

    public void setModel(Sudoku9x9Model model){
        this.model=model;
    }

    public void afficheGrille(){
        Character[] tabChar = new Character[9*9];

        for (int lig=0; lig < 9; lig++){
            for (int col=0 ; col <9; col++){
                char value = model.getValue(lig,col);
                if (value == 0){
                    tabChar[lig * 9 + col] = '.';
                }
                else{
                    tabChar[lig * 9 + col] = value;
                }
            }
        }

        System.out.printf(grille,tabChar);
    }

    @Override
    public void afficheGrilleVide() {

        System.out.println(grille);
    }

    public static void main(String[] args) {
        Sudoku9x9Vue sv = new Sudoku9x9Vue();
        Sudoku9x9Model sm = new Sudoku9x9Model();

        sv.setModel(sm);


        sm.setValue('1',5,6);
        sv.afficheGrille();
    }

    public void afficheInstructionsSaisie() {
        System.out.println("Veuillez entrez une chaîne type lig.col.val (ex : \"1.1.2 pour entrer la valeur 2 en lig 1 col 1\").\n" +
                " Pour quitter entrez 'q' ou 'Q'.\n");
    }
}
