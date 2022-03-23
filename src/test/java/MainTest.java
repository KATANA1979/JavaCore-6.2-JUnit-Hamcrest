import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.logging.Logger;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {
    static Logger logger = Logger.getLogger("Test");

    // Task #1
    @BeforeAll
    public static void beforeAll() {
        logger.info("Test's started");
    }

    @AfterAll
    public static void AfterAll() {
        logger.info("Test's end");
    }

    @Test
    public void testValidEventInMainClass() {
        Event event = new Movie("Весна", 2005, 0);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Main.validEvent(event);
        });
        String expectedMessage = "Поле не заполнено!";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
        String expectedException = "RuntimeException";
        String actualException = String.valueOf(exception.getClass());
        Assertions.assertTrue(actualException.contains(expectedException));
    }

    @Test
    public void testGetTheatresMethodInMainClass() {
        Theatre[] theatres = Main.getTheatres();
        assertThat(Arrays.asList(theatres), hasSize(5));
        Assertions.assertNotNull(theatres);
    }

    @Test
    public void testResultGetTheatresMethodInMainClass() {
        Theatre[] theatres = Main.getTheatres();
        int year = theatres[0].releaseYear;
        int trueYear = 2017;
        Assertions.assertEquals(year, trueYear);
    }
}
