package be.technifutur.java2020.sudoku.common;

import be.technifutur.java2020.sudoku.Sudoku;

public abstract class AbstractSudokuVue implements Sudoku {
    private AbstractSudokuModel model;
    private String grille;
    private int nbLig;
    private int nbCol;

    /*protected AbstractSudokuVue(int nbLig, int nbCol, String grille){
        this.nbLig=nbLig;
        this.nbCol=nbCol;
        this.grille= grille.replace(".","%s");
        this.grille=this.grille.replace("*", "%s");
    }*/

    public void setModel(AbstractSudokuModel model){
        this.model=model;
    }

    /*public void afficheGrille(){
        Character[] tabValue = new Character[nbLig*nbCol];

        for(int lig = 0; lig < nbLig; lig++){
            for(int col = 0; col < nbCol; col++){
                if(model.isPositionValid(lig,col)){
                    char value = model.getValue(lig,col);
                    if (value == 0){
                        tabValue[lig * nbCol + col]='.';
                    }else{
                        tabValue[lig * nbCol + col] = value;
                    }
                }else{
                    tabValue[lig * nbCol + col] = 0;
                }

            }
        }
        System.out.printf(grille,tabValue);
    }*/

    @Override
    public void afficheGrilleVide(){
        Character[] tabChar = new Character[nbLig*nbCol];

        for(int l = 0; l < nbLig; l++){
            for(int c = 0; c <nbCol; c++){
                if(model.isPositionValid(l,c)){
                    tabChar[l * nbCol + c]='.';
                }else{
                    tabChar[l * nbCol + c]=0;
                }

            }

        }
        System.out.printf(grille,tabChar);
    }

}
