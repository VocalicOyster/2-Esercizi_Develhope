package Es1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RettangoloTest {


    Rettangolo rett = new Rettangolo();
    @Test
    void calcolaArea() {
        int re = rett.calcolaArea(1, 3);
        assertEquals(3, re);
    }
}