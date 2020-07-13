import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.Math.*;

public class ShapeListTest {
    @Test
    void testAll() {
        ShapeList shapeList = new ShapeList();
        shapeList.sizes = new double[]{10, 5, 1};
        shapeList.types = new String[]{"square", "square", "circle"};
        Assertions.assertEquals(10*4+5*4+2*Math.PI*1, shapeList.totalPerimeter());
        Assertions.assertEquals(10*10+5*5+Math.PI*1*1, shapeList.totalArea());
    }
}
