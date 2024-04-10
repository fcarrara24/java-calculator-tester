package org.lessons.java;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BigliettoTrenoTest {


    @Test
    public void testCalcolaPrezzoUnder18() {
        // Età sotto i 18 anni
        int eta = 16;
        int km = 100;
        BigDecimal expectedPrezzo = new BigDecimal("16.80");

        BigDecimal actualPrezzo = BigliettoTreno.calcolaPrezzo(eta, km);

        assertEquals(expectedPrezzo, actualPrezzo);
    }

    @Test
    public void testCalcolaPrezzoOver65() {
        // Età oltre i 65 anni
        int eta = 70;
        int km = 100;
        BigDecimal expectedPrezzo = new BigDecimal("12.60");

        BigDecimal actualPrezzo = BigliettoTreno.calcolaPrezzo(eta, km);

        assertEquals(expectedPrezzo, actualPrezzo);
    }

    @Test
    public void testCalcolaPrezzoNormal() {
        // Età normale
        int eta = 30;
        int km = 100;
        BigDecimal expectedPrezzo = new BigDecimal("21.00");

        BigDecimal actualPrezzo = BigliettoTreno.calcolaPrezzo(eta, km);

        assertEquals(expectedPrezzo, actualPrezzo);
    }

    @Test
    public void TestEccezioneEta(){
        int eta = -1;
        int km = 30;

        assertThrows(IllegalArgumentException.class, ()->BigliettoTreno.calcolaPrezzo(eta, km));
    }

    @Test
    public void TestEccezioneKm(){
        int eta = 1;
        int km = -30;

        assertThrows(IllegalArgumentException.class, ()->BigliettoTreno.calcolaPrezzo(eta, km));
    }
}