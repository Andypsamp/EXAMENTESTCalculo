package mcd;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamTestCalculo {

    private int num1;
    private int num2;
    private Calculo calc;
    private int numEsperado;

    @Before
    public void inicializar() {
        calc = new Calculo();
    }

    public ParamTestCalculo(int n1, int n2, int mcd) {
        this.num1 = n1;
        this.num2 = n2;
        this.numEsperado = mcd;
    }

    @Parameterized.Parameters
    public static Collection calcular() {
        return Arrays.asList(new Object[][]{
            {14, 6, 2},
            {12, 2, 2},
            {10, 5, 5},
            {8, 4, 4}
        });
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD " + " primer parametrizado " +num1 + " segundo parametrizado " +num2 + " resultado esperado " +numEsperado);
        int result = calc.obtenerMCD(num1, num2);
        assertEquals(numEsperado, result,0);
    }

}
