package be.technifutur.java2020.sudoku.common;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Model;
import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Vue;

import java.util.Scanner;

public abstract class AbstractSudokuCtrl {
    protected final Scanner sc = new Scanner(System.in);
    private AbstractSudokuVue vue;
    private AbstractSudokuModel model;

    protected void setVue(AbstractSudokuVue vue){
        this.vue=vue;
    }
    protected void setModel(AbstractSudokuModel model){
        this.model=model;
    }

    public void start(){
        String input;
        do{
            vue.afficheGrille();
            this.afficheDemandeSaisie();
            input =this.returnValidInput();
            this.giveToModel(input);
        }while (! "q".equalsIgnoreCase(input));
    }

    protected abstract void afficheDemandeSaisie();

    protected abstract String returnValidInput();

    protected void giveToModel(String input) {
        String[] inputTab = input.split("\\.");
        if (inputTab.length==3){
            int line = Integer.parseInt(inputTab[0]) - 1;
            int column = Integer.parseInt(inputTab[1]) - 1;
            char value = inputTab[2].charAt(0);
            model.setValue(line, column, value);
        }
    }
}
