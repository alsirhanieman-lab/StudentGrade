
package studentgrade;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentGradeTest {

    @Test
    public void testGetGrade95() {
        int mark = 95;
        String expectedResult = "A";

        String actualResult = StudentGrade.getGrade(mark);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetGrade85() {
        int mark = 85;
        String expectedResult = "B";

        String actualResult = StudentGrade.getGrade(mark);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetGrade75() {
        int mark = 75;
        String expectedResult = "F";

        String actualResult = StudentGrade.getGrade(mark);

        assertEquals(expectedResult, actualResult);
    }
}
