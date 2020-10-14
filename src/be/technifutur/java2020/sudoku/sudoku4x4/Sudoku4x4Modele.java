package be.technifutur.java2020.sudoku.sudoku4x4;

public class Sudoku4x4Modele {

    /*public static void main(String[] args) {
        Sudoku4x4Modele s = new Sudoku4x4Modele();

        for(int l = 0 ; l < 4; l++){
            for (int c=0; c <4; c++){
                s.setValue('3', l, c);
                System.out.println(s.getValue(l,c));
            }
        }
    }*/

    private char[][] grille = new char[4][4];

    public void setValue (char valeur, int ligne, int colonne){
        grille[ligne][colonne] = valeur;
    }

    public char getValue(int ligne, int colonne){
        return grille[ligne][colonne];
    }
}
