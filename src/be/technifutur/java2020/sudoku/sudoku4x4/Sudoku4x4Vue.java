package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.Sudoku;
import be.technifutur.java2020.sudoku.SudokuAbstractVue;

public class Sudoku4x4Vue extends SudokuAbstractVue {

    //private Sudoku4x4Model model;

    public Sudoku4x4Vue(){
        super(""+
                "l\\c  1 2   3 4 \n"+
                "   +-----+-----+\n"+
                "1  | . . | . . |\n"+
                "2  | . . | . . |\n"+
                "   +-----+-----+\n"+
                "3  | . . | . . |\n"+
                "4  | . . | . . |\n"+
                "   +-----+-----+\n");

        setModel(new Sudoku4x4Model());
        getModel().setValue('3',1,1);
    }

    /*public void setModel(Sudoku4x4Model model){
        this.model = model;
    }*/

    public void afficheGrille(){

        Character[] tabValue = new Character[4*4];

        for(int lig = 0; lig < 4; lig++){
            for(int col = 0; col < 4; col++){
                //if(getModel().isPositionValid(lig,col)){
                    //char value = ... .getValue(lig,col)
                System.out.println(getModel());
                /*
                    if (value == 0){
                        tabValue[lig * 4 + col]='.';
                    }else{
                        tabValue[lig * 4 + col] = value;
                    }*/
                //}else{
                    //tabValue[lig * 4 + col]=0;
                //}
            }
        }
        System.out.printf(getGrille(),tabValue);
    }

    @Override
    public void afficheGrilleVide() {
        Character[] tabChar = new Character[16];

        for(int i =0; i < tabChar.length; i++){
            tabChar[i]='.';
        }
        System.out.printf(getGrille(),tabChar);
    }

    public static void main(String[] args) {
        Sudoku4x4Vue v = new Sudoku4x4Vue();




        v.afficheGrilleVide();
    }

}
