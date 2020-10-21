package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.common.AbstractSudokuVue;

public class Sudoku4x4Vue extends AbstractSudokuVue{

    public Sudoku4x4Vue(){
       super(4,4, ""+
               "l\\c  1 2   3 4 \n"+
               "   +-----+-----+\n"+
               "1  | . . | . . |\n"+
               "2  | . . | . . |\n"+
               "   +-----+-----+\n"+
               "3  | . . | . . |\n"+
               "4  | . . | . . |\n"+
               "   +-----+-----+\n");
    }

}
