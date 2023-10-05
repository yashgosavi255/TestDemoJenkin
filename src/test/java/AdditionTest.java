import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void add() {
        int result=Addition.add(3,3);
        int correct=6;

        assertEquals(6,result);
    }
}