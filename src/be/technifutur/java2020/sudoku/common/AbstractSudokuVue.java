package be.technifutur.java2020.sudoku.common;

import be.technifutur.java2020.sudoku.Sudoku;
import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Model;

public abstract class AbstractSudokuVue implements Sudoku {
    private AbstractSudokuModel model;

    public void setModel(AbstractSudokuModel model) {
        this.model = model;
    }

    protected abstract void afficheGrille();

    public abstract void afficheGrilleVide();
}
