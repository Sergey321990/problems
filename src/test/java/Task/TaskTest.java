package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    public void testMatchesForSimpleTaskWhenTrue() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        Boolean actual = simpleTask.matches("родителям");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenFalse() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        Boolean actual = simpleTask.matches("Бабушке");
        Assertions.assertFalse(actual);
    }
}





