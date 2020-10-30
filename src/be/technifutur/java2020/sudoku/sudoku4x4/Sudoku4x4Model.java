package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.common.*;

import java.util.*;

public class Sudoku4x4Model extends AbstractSudokuModel{

    public Sudoku4x4Model() {
        getGrille();
    }

    protected void getGrille() {
        Area[] lineTab = new Area[4];
        Area[] columnTab=new Area[4];
        Area[] squareTab=new Area[4];
        for (int i=0 ; i <4 ; i++){
            lineTab[i]=new Area(4,AreaType.LINE, new Position(i,0));
            columnTab[i]=new Area(4,AreaType.COLUMN, new Position(0, i));
            squareTab[i]=new Area(4,AreaType.SQUARE, new Position(i/2*2, i%2*2));
        }

        for (int l=0; l<4; l++){
            for (int c=0; c<4; c++){
                Position position = new Position(l, c);
                Cell cell = new Cell(position);
                map.put(position,cell);
                cell.add(lineTab[l]);
                cell.add(columnTab[c]);
                cell.add(squareTab[l/2*2 +c/2]);
            }
        }
    }

    public boolean isValueValid(char value) {
        return Character.getNumericValue(value) >= 1 && Character.getNumericValue(value) <=4;
    }

    public int getNbCase(){
        return 4*4;
    }
}
