package be.technifutur.java2020.sudoku.common;

public abstract class AbstractSudokuModel {

    private final char[][] grille;

    protected AbstractSudokuModel(int lig , int col){
        grille=new char[lig][col];
    }

    public void setValue (char value, int line, int column){
        if (isValueValid(value) && isPositionValid(line,column)){
            grille[line][column] = value;
        }
        else{
            System.out.println("Position ou valeur incorrecte");
        }
    }

    public char getValue(int line, int column){
        char c = 0;
        if (isPositionValid(line,column)){
            c= grille[line][column];
        }
        return c;
    }

    public abstract boolean isValueValid(char value);

    public abstract boolean isPositionValid(int ligne, int colonne);


}
