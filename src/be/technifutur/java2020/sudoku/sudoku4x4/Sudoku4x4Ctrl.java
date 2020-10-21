package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.common.AbstractSudokuCtrl;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Sudoku4x4Ctrl extends AbstractSudokuCtrl {

    public Sudoku4x4Ctrl() {
        super(4, 4, 4);
    }

    public static void main(String[] args) {
        Sudoku4x4Ctrl c = new Sudoku4x4Ctrl();
        Sudoku4x4Vue v = new Sudoku4x4Vue();
        Sudoku4x4Model m = new Sudoku4x4Model();

        c.setVue(v);
        c.setModel(m);
        v.setModel(m);

        c.start();
    }
}
