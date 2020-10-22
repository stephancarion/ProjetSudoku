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

    /* Pour tests*/
    public int getData() {
        return data;
    }
    /**/

    // Par défaut, toutes les valeurs de 1 à 9 sont possibles à l'instanciation
    public Possibilities(){
        data=0b101111000;
    }

    // La possibilité de la valeur passée en paramètre existe après appel de la fonction
    // Renvoie faux si la possibilité existait avant appel, vrai si la possibilité n'existait pas avant appel
    public boolean add (int value){
        boolean change = false;
        int masque = (1 << value-1);

        change = (data & masque) == 0;
        data = data | masque;

        return change;
    }

    // La possibilité de la valeur passée en paramètre n'existe pas après appel de la fonction
    // Renvoie faux si la possibilité n'existait pas avant appel, vrai si la possibilité existait avant appel
    public boolean remove(int value){
        boolean change = false;
        int masque = (1 << value-1);

        change = ~(data | ~masque) ==0;
        data = data & ~masque;

        return change;
    }

    // Renvoie vrai si la valeur existe
    public boolean contains(int value){

        int masque = (1 << value -1);

        return (data & masque) != 0;
    }

    /* tests*/
    public static void main(String[] args) {
        Possibilities p = new Possibilities();

        System.out.println(Integer.toBinaryString(p.getData()));
        System.out.println(p.contains(1));
        System.out.println(p.contains(2));
        System.out.println(p.contains(3));
        System.out.println(p.contains(4));
        System.out.println(p.contains(5));
        System.out.println(p.contains(6));
        System.out.println(p.contains(7));
        System.out.println(p.contains(8));
        System.out.println(p.contains(9));
    }
    /**/
}
