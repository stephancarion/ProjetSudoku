package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.common.AbstractSudokuModel;
import be.technifutur.java2020.sudoku.common.Cell;
import be.technifutur.java2020.sudoku.common.Position;

import java.util.Map;

public class Sudoku9x9Model extends AbstractSudokuModel {


    @Override
    public boolean isValueValid(char value) {
        boolean valid = false;
        int val = Character.getNumericValue(value); // conversion char --> int

        valid = val >= 1 && val <= 9;

        return valid;
    }

    @Override
    public Map<Position, Cell> getGrille() {
        return null;
    }

    @Override
    public boolean isPositionValid(int ligne, int colonne) {
        return ligne >= 0 && ligne < 9 && colonne >= 0 && colonne < 9;
    }
}
