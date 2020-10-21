package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.common.AbstractSudokuModel;

public class Sudoku4x4Model extends AbstractSudokuModel {

    public Sudoku4x4Model() {
        super(4,4);
    }

    @Override
    public boolean isValueValid(char value) {
        boolean valid = false;
        int val = Character.getNumericValue(value); // conversion char --> int

        valid = val >= 1 && val <= 4;

        return valid;
    }

    @Override
    public boolean isPositionValid(int ligne, int colonne) {
        return ligne >= 0 && ligne < 4 && colonne >= 0 && colonne < 4;
    }

}
