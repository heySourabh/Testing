package main;
import static org.junit.Assert.*;
import org.junit.*;

public class MainTest {

    @Test
    public void addPolynomials() {
        double[] p1 = {2, 5, 6};
        double[] p2 = {1, 7, 16};

        double[] expected = new double[]{3, 12, 25};
        double[] actual = Main.addPolynomials(p1, p2);

        assertArrayEquals(expected, actual, 1e-15);
    }
}
