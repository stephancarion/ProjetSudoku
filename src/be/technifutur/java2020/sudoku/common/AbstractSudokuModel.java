package be.technifutur.java2020.sudoku.common;

import java.util.Map;

public abstract class AbstractSudokuModel {

    public static final char EMPTY = 0;

    private Map<Position,Cell> grille;

    public void setValue (char value, int line, int column){
        setValue(value,new Position(line,column));
    }

    public void setValue (char value, Position position){
        if (isValueValid(value) && isPositionValid(Position)){
            Cell cell = getCell(position);
            cell.setValue(value);
        }
    }

    private Cell getCell(Position position) {
        return getGrille().get(position);
    }

    public char getValue(int line, int column){
        return getValue(new Position(line,column));
    }

    public char getValue(Position position){
        return grille.get(position).getValue();
    }

    public abstract boolean isValueValid(char value);

    public abstract Map<Position,Cell> getGrille();

    public boolean isPositionValid(int ligne, int colonne){
        return isPositionValid(new Position(ligne, colonne));
    }

    public boolean isPositionValid(Position position){
        return this.getGrille().containsKey(position);
    }

    public void removeValue(int line, int column){
        if(isPositionValid(line,column)){
            grille[line][column] = EMPTY;
        }
    }


}
