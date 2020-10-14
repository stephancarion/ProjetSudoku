package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.Sudoku;

public class Sudoku4x4Vue implements Sudoku {

    public static void main(String[] args) {
        Sudoku4x4Vue sv = new Sudoku4x4Vue();
        Sudoku4x4Modele sm = new Sudoku4x4Modele();

        /*for(int l = 1 ; l <= 4; l++){
            for (int c=1; c <= 4; c++){
                sm.setValue('0', l, c);
            }
        }*/


        sv.setModel(sm); // connexion de la vue au modèle
        sv.afficheGrille();
        sm.setValue('2',1,1);
        sv.afficheGrille();
    }

    private Sudoku4x4Modele model = new Sudoku4x4Modele();

    private String grille = ""+
                "+-----+-----+\n"+
                "| . . | . . |\n"+
                "| . . | . . |\n"+
                "+-----+-----+\n"+
                "| . . | . . |\n"+
                "| . . | . . |\n"+
                "+-----+-----+\n";

    public Sudoku4x4Vue(){
        grille=grille.replace(".","%s");
    }

    public void setModel(Sudoku4x4Modele model){
        this.model = model;
    }

    public void afficheGrille(){

        Character[] tabValue = new Character[4*4];

        for(int lig = 0; lig < 4; lig++){
            for(int col = 0; col < 4; col++){
                char value = model.getValue(lig,col);
                if (value == 0){
                    tabValue[lig * 4 + col]='.';
                }else{
                    tabValue[lig * 4 + col] = value;
                }
            }
        }
        System.out.printf(grille,tabValue);

    }

    @Override
    public void afficheGrilleVide() {

        System.out.println("+-----+-----+");
        System.out.println("| . . | . . |");
        System.out.println("| . . | . . |");
        System.out.println("+-----+-----+");
        System.out.println("| . . | . . |");
        System.out.println("| . . | . . |");
        System.out.println("+-----+-----+");
    }
}
