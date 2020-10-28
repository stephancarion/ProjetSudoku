package be.technifutur.java2020.sudoku.common;

/*
Classe qui retient la valeur d'une cellule d'un sudoku
et qui spécifie à quelle ligne, colonne et carré est attaché cette cellule.
 */

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Cell {
    private Position position;
    private Set<Area> areaSet;

    /*private Possibilities ligne;
    private Possibilities colonne;
    private Possibilities carre;
    private char valeur;
    private boolean modifiable;*/

    public Cell(Position position){
        this.position=position;
        areaSet = new HashSet<>();
    }

    public Position getPosition() {
        return position;
    }

    public boolean add(Area area) {
        boolean add = false;
        if(area.getPositionSet().contains(this.position)) {
            add = areaSet.add(area);
        }
        return add;
    }

    public void setValue(char value) {
        //TODO à coder
    }



    /*public void addLigne(Possibilities ligne){
        this.ligne=ligne;
    }

    public void addColonne(Possibilities colonne){
        this.colonne=colonne;
    }

    public void addCarre(Possibilities carre){
        this.carre=carre;
    }

    public void setValue(char value) {
        this.valeur = value;
    }

    public char getValue() {
        return valeur;
    }

    public boolean isEmpty(){
        return this.valeur == 0;
    }

    public void remove(){
        this.valeur = 0;
    }*/
}