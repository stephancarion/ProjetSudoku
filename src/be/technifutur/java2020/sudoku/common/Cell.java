package be.technifutur.java2020.sudoku.common;

/*
Classe qui retient la valeur d'une cellule d'un sudoku
et qui spécifie à quelle ligne, colonne et carré est attaché cette cellule.
 */

public class Cell {
    private final Possibilities ligne;
    private final Possibilities colonne;
    private final Possibilities carre;
    private char valeur;
    private boolean modifiable;
}
