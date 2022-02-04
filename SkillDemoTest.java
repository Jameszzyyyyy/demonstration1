import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void product() {
        assertEquals(2, SkillDemo.product(1, 2)); // should fail
    }
}
