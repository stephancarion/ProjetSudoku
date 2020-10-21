package be.technifutur.java2020.sudoku;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Model;

public abstract class SudokuAbstractVue implements Sudoku{
    private SudokuAbstractModel model;

    private String grille;

    public SudokuAbstractVue(String grille){
        this.grille=grille.replace(".","%s");
    }

    public String getGrille() {
        return grille;
    }

    public void setModel(SudokuAbstractModel model){
        this.model = model;
    }

    public SudokuAbstractModel getModel() {
        return model;
    }

    public abstract void afficheGrille();

    @Override
    public abstract void afficheGrilleVide();

}
