package Klausur_Lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryPredicateTest {

    @Test
    void test1() {
        TryPredicate p = (a,b,c) -> a+b==c;

        assertTrue(p.test(1, 2, 3));
        assertFalse(p.test(2, 2, 3));

    }
}