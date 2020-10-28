package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.common.AbstractSudokuModel;
import be.technifutur.java2020.sudoku.common.Cell;
import be.technifutur.java2020.sudoku.common.Position;

import java.util.HashMap;
import java.util.Map;

public class Sudoku4x4Model extends AbstractSudokuModel {


    @Override
    public boolean isValueValid(char value) {
        boolean valid = false;
        int val = Character.getNumericValue(value); // conversion char --> int

        valid = val >= 1 && val <= 4;

        return valid;
    }

    @Override
    public Map<Position, Cell> getGrille() {
        // construire la map
        HashMap<Position, Cell> map = new HashMap<>();
        // construire les cellules

        // construire les positions
        // construire les Areas

        // associer le tout
        return map;
    }

    @Override
    public int getNbCase(){
        return 4*4;
    }

}
