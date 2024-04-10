package org.lessons.java;

import java.math.BigDecimal;

public class BigliettoTreno {
    public static BigDecimal calcolaPrezzo(int eta, int km){
        final float PREZZOKM = 0.21F;
        float costante_prezzo = (float) ((eta < 18) ? 0.8 : (eta>65) ? 0.6: 1.0);
        float prezzo = PREZZOKM * costante_prezzo * km;

        BigDecimal outPrezzo = new BigDecimal(prezzo);
        return outPrezzo.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
