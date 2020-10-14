package be.technifutur.java2020.sudoku;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sudoku");

// test
        Sudoku4x4 s1 = new Sudoku4x4();
        Sudoku9x9 s2 = new Sudoku9x9();
        SudokuEtoile s3 = new SudokuEtoile();
        s1.afficheGrilleVide();
        s2.afficheGrilleVide();
        s3.afficheGrilleVide();
    }
}
