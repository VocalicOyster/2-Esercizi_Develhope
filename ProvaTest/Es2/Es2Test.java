package Es2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Es2Test {

    Es2 es2 = new Es2();
    @Test
    void addYears() {
        int i = es2.addYears(1);
        assertEquals(2003, i);
    }
}