import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDTestCase {
    // This test case checks if the Human can study?
    @Test
    public void checkTheHumanCanStudy() {
        Human human = new Human();
        final String topic = human.study("History");
        assertEquals(topic, "History");
    }


    @Test
    public void checkTypeOfCar() {
        Car car = new Car();
        String type = car.type("Audi");
        assertEquals(type, "Audi");
    }
}



