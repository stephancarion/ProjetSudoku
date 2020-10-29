package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.common.AbstractSudokuModel;
import be.technifutur.java2020.sudoku.common.AbstractSudokuVue;

public class Sudoku4x4Vue{
    private Sudoku4x4Model model;
    private String grille=""+
            "l\\c  1 2   3 4 \n"+
            "   +-----+-----+\n"+
            "1  | . . | . . |\n"+
            "2  | . . | . . |\n"+
            "   +-----+-----+\n"+
            "3  | . . | . . |\n"+
            "4  | . . | . . |\n"+
            "   +-----+-----+\n";

    public Sudoku4x4Vue() {
        this.grille=this.grille.replace(".","%s");
    }

    void setModel(Sudoku4x4Model model) {
        this.model = model;
    }

    public void afficheGrille(){
        Character[] tabValue = new Character[4*4];

        for(int l = 0; l < 4; l++){
            for(int c = 0; c < 4; c++){
                char value = model.getValue(l,c);
                if (value == 0){
                    tabValue[l * 4 + c]='.';
                }else{
                    tabValue[l * 4 + c] = value;
                }
            }
        }
        System.out.printf(grille,tabValue);
    }

    public void afficheGrilleVide(){
        Character[] tabValue = new Character[4*4];

        for(int l=0; l < 4; l++){
            for (int c=0; c < 4; c++){
                tabValue[l * 4 + c]='.';
            }
        }

        System.out.printf(grille, tabValue);
    }
}
