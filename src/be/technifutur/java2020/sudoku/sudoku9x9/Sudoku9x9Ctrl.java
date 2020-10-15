package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Ctrl;

import java.util.Scanner;

public class Sudoku9x9Ctrl {


    private Sudoku9x9Model model =new Sudoku9x9Model();
    private Sudoku9x9Vue vue = new Sudoku9x9Vue();

    public void setModel(Sudoku9x9Model model) {
        this.model = model;
    }

    public void setVue(Sudoku9x9Vue vue) {
        this.vue = vue;
    }

    public void start(Sudoku9x9Model m, Sudoku9x9Vue v, Sudoku9x9Ctrl c){
        String input = new String();
        Boolean sortie = false;

        v.afficheGrille();
        while (!sortie){
            v.afficheInstructionsSaisie();
            input = c.recupereSaisieValide();
            if (input.equalsIgnoreCase("q")) {
                sortie = true;
            }else{
                int lig = Character.getNumericValue(input.charAt(0))-1;
                int col = Character.getNumericValue(input.charAt(2))-1;
                char value = input.charAt(4);
                m.setValue(value,lig,col);
                v.afficheGrille();
            }
        }



    }

    private String recupereSaisieValide() {
        Scanner sc = new Scanner(System.in);
        String input = new String();
        boolean estValide = false;

        while (!estValide){
            input=sc.nextLine();

            estValide = "q".equalsIgnoreCase(input) ||
                    (
                        input.length() == 5 &&
                        Character.isDigit(input.charAt(0)) &&
                        input.charAt(1) == '.' &&
                        Character.isDigit(input.charAt(2)) &&
                        input.charAt(3) == '.' &&
                        Character.isDigit(input.charAt(4))
                    );
        }

        return input;
    }

    public static void main(String[] args) {
        Sudoku9x9Ctrl sc = new Sudoku9x9Ctrl();
        Sudoku9x9Model sm = new Sudoku9x9Model();
        Sudoku9x9Vue sv = new Sudoku9x9Vue();

        sc.setModel(sm);
        sc.setVue(sv);
        sv.setModel(sm);

        sc.start(sm,sv,sc);
    }
}
