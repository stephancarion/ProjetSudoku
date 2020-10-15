package be.technifutur.java2020.sudoku.sudoku4x4;

public class Sudoku4x4Model {

    private char[][] grille = new char[4][4];

    public void setValue (char value, int line, int column){
        if (isValueValid(value))
        if (isPositionValid(line,column)){
            grille[line][column] = value;
        }
        else{
            System.out.println("Position incorrecte");
        }
    }

    public char getValue(int ligne, int colonne){
        char c = 0;
        if (isPositionValid(ligne,colonne)){
            c= grille[ligne][colonne];
        }
        return c;
    }

    private boolean isValueValid(char value) {
        boolean valid = false;
        int val = Character.getNumericValue(value); // conversion char --> int

        valid = val >= 1 && val <= 9;

        return valid;
    }

    private boolean isPositionValid(int ligne, int colonne) {
        return ligne >= 0 && ligne < 4 && colonne >= 0 && colonne < 4;
    }


}
