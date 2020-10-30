package be.technifutur.java2020.sudoku.common;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractSudokuModel {

    public static final char EMPTY = 0;

    protected HashMap<Position,Cell> map = new HashMap<>();

    protected abstract void getGrille();

    public abstract boolean isValueValid(char value);

    public boolean isPositionValid(int line, int column){
        Position position = new Position(line, column);
        return isPositionValid(position);
    }

    public boolean isPositionValid(Position position){
        return map.containsKey(position);
    }

    public char getValue(int line, int column) {
        Position position = new Position(line, column);
        return getValue(position);
    }

    public char getValue(Position position) {
        return map.get(position).getValue();
    }

    public void setValue(int line, int column, char value) {
        Position position = new Position(line,column);
        setValue(position, value);
    }

    public void setValue(Position position, char value) {
        map.get(position).setValue(value);
    }

    public abstract int getNbCase();
}
