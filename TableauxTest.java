package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class TableauxTest {

    @Test
    public void trierCroissantSSS() {
       int[] tab = {5,4,3,22,-10,250};
       int[] expectedTab = {-10,3,4,5,22,250};
       Tableaux.trierCroissantSSS(tab);
       assertArrayEquals(expectedTab,tab);
    }

    @Test
    public void trierDecroissant() {
        int[] tab = {5,4,3,22,-10,250};
        int[] expectedTab = {250,22,5,4,3,-10};
        Tableaux.trierDecroissant(tab);
        assertArrayEquals(expectedTab,tab);
    }

    @Test
    public void maximum() {
        //oracle 1: max fin
        int[] tab = {5,4,3,22,-10,250};
        int expectedResult = 250;
        int result = Tableaux.maximum(tab);
        assertEquals(expectedResult,result);

        //oracle 2: max debut
        tab[0] = 555;
        expectedResult = 555;
        result = Tableaux.maximum(tab);
        assertEquals(expectedResult,result);

        //oracle 3: max milieu
        tab[tab.length % 2] = 5000;
        expectedResult = 5000;
        result = Tableaux.maximum(tab);
        assertEquals(expectedResult,result);
    }

    @Test
    public void minimum() {
        //oracle 1: min fin
        int[] tab = {5,4,250,22,3,-10};
        int expectedResult = -10;
        int result = Tableaux.minimum(tab);
        assertEquals(expectedResult,result);

        //oracle 2: min debut
        tab[0] = -12;
        expectedResult = -12;
        result = Tableaux.minimum(tab);
        assertEquals(expectedResult,result);

        //oracle 3: min milieu
        tab[tab.length % 2] = -14;
        expectedResult = -14;
        result = Tableaux.minimum(tab);
        assertEquals(expectedResult,result);

    }

    @Test
    public void moyenne() {
        //oracle 1:
        int[] tab = {5,4,3,22,-10,250};
        int expectedResult = 45;
        int result = Tableaux.moyenne(tab);
        assertEquals(expectedResult,result);

        //oracle 2: vide
        int[] tab1 = {};
        expectedResult = 0;
        result = Tableaux.moyenne(tab1);
        assertEquals(expectedResult,result);


    }

    @Test
    public void fouilleSeq() {
        //oracle 1: normal
        int[] tab = {5,4,3,22,-10,250};
        int expectedResult = 1;
        int result = Tableaux.fouilleSeq(tab,4);
        assertEquals(expectedResult,result);

        //oracle 2: pas présent
        expectedResult = -1;
        result = Tableaux.fouilleSeq(tab, 13);
        assertEquals(expectedResult,result);

        //oracle 3`dernier
        expectedResult = 5;
        result = Tableaux.fouilleSeq(tab, 250);
        assertEquals(expectedResult,result);
    }
}