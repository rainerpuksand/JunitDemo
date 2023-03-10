import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTestCase {
    @BeforeEach
    public void setUp() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

    @AfterEach
    public void tearDown() {
        System.out.println("#");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All\n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all\n");
    }

    @Test
    @DisplayName("Compare two numbers")
    public void firstTestCase() {
        int firstNumber = 7;
        int secondNumber = 7;
        assertEquals(firstNumber, secondNumber);
    }

    @Test
    public void secondTest() {
        double firstNumber = 3;
        double secondNumber = 7;
        assertNotEquals(firstNumber, secondNumber);
    }

    @Test
    public void thirdTestCase() {
        int number = 1;
        int second = 1;
        assertEquals(number, number);
    }

    @Test
    public void givenWhenThen() {
        // GIVEN I have a calculator
        Calculator calculator = new Calculator();
        // WHEN I add two numbers
        final int addResult = calculator.add(2, 2);
        //THEN I get a result that I can compare
        assertEquals(4, addResult);
    }


    @Test
    public void assertions() {
        // Assert Null works only with text (String)
        // Valid assertNull checks
        assertNull(null);
        final String sda = "Software Development Academy";
        assertNotNull(sda);
        // Invalid assertNull checks
        //   assertNull(sda); - this sda text is not empty
        //   assertNull(1); - assertNull can not compare Numbers

        // AssertTrue & AssertFalse
        assertTrue(1 == 1);
        assertFalse(2 == 1);
        assertTrue("A" == "A");
        assertTrue(true);
        assertFalse(false);
        assertTrue(4 < 5);
        assertFalse(1 > 2);

        final int[] array = {1, 2, 3};
        final int[] secondArray = {1, 2, 3};

        // Compare two arrays to see if they are equal
        assertArrayEquals(array, secondArray);
    }


    @Test
    public void otherAssertions() {
        //AssertSame & AssertNotSame
        assertSame("Hello", "Hello");
        assertSame(1, 1);
        assertNotSame(1, 2);
        assertNotSame("A", "B");
        // Assert Iterable comapres 2 Array Lists
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("a");
        secondList.add("b");
        assertIterableEquals(list, secondList);
        // Assert Lines Match:
        assertLinesMatch(list, secondList);
        // Timeout
//    assertTimeout(Duration.ofSeconds(122),this::otherAssertions);
    }
}




