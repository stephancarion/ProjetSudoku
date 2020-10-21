package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.SudokuAbstractModel;

public class Sudoku4x4Model extends SudokuAbstractModel {

    public Sudoku4x4Model() {
        super(new char[4][4]);
    }

    /*public void setValue (char value, int line, int column){
        if (isValueValid(value) && isPositionValid(line,column)){
            grille[line][column] = value;
        }
        else{
            System.out.println("Position ou valeur incorrecte");
        }
    }*/

    /*public char getValue(int line, int column){
        char c = 0;
        if (isPositionValid(line,column)){
            c= grille[line][column];
        }
        return c;
    }*/

    public boolean isValueValid(char value) {
        boolean valid = false;
        int val = Character.getNumericValue(value); // conversion char --> int

        valid = val >= 1 && val <= 4;

        return valid;
    }

    public boolean isPositionValid(int ligne, int colonne) {
        return ligne >= 0 && ligne < 4 && colonne >= 0 && colonne < 4;
    }


}
