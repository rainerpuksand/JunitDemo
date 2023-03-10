import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJDemo {
    @Test
    public void firstTest() {
        assertThat("\t".length() > 0).isTrue();






            /*final int number = 5;
            assertThat(number)
                    .isOdd()
                    .isNotNegative()
                    .isLessThan(7)
                    .isGreaterThan(2);

            assertThat("Hello World")
                    .isEqualToIgnoringNewLines("HELLO WORLD")
                    .isEqualTo("Hello World");*/
    }
}

