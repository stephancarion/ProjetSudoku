package be.technifutur.java2020.sudoku.common;

/*
 Cette classe gère les posibilités pour le sudoku de 1 à 9 sous la forme d'un code binaire
    - le code 0 signifie que la possibilité n'existe pas
    - le code 1 signifie que la possibilité existe
 L'écriture binaire écrite de droite à gauche correspond respectivement aux possibilités des valeurs de 1 à 9

 -- Exemple: 0b001101001 signifie que les valeurs 1,4,6 et 7 sont possibles
 */

public class Possibilities {
    private int data = 0;

    // Par défaut, toutes les valeurs de 1 à 9 sont possibles à l'instanciation
    public Possibilities(){
        data=0b111111111;
    }
}
