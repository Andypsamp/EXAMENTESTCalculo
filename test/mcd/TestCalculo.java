package mcd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculo {

    public TestCalculo() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        int num1 = 10;
        int num2 = 4;
        Calculo instance = new Calculo();
        int numEsperado = 2;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(numEsperado, result, 0);
        System.out.println("obtenerMCD"+" primer numero "+num1+" segundo numero "+num2+" resultado "+numEsperado);

    }

}

