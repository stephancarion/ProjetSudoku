package be.technifutur.java2020.sudoku.sudoku9x9;

public class Sudoku9x9Model {
    private char[][] grille = new char[9][9];

    public void setValue(char value, int ligne, int colonne){
        this.grille[ligne][colonne] = value;
    }

    public char getValue(int ligne, int colonne){
        return this.grille[ligne][colonne];
    }
}
