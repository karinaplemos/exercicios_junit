package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora cal = new Calculadora();
    
    @Test
    public void testaSoma(){
        assertEquals(2, cal.soma(1, 1));
    }
    
    @Test 
    public void testSubtracao(){
        assertEquals(1, cal.subtracao(2, 1));
    }
    
    @Test
    public void testMultiplicao(){
        assertEquals(10, cal.multiplicacao(2, 5));
    }
    
    @Test
    public void testDivisao(){
        assertEquals(1, cal.divisao(2, 2));
    }
    
    @Test
    public void testSomatoria(){
        assertEquals(6, cal.somatoria(3));
    }
    
    @Test
    public void testEhPositivo(){
        assertEquals(true, cal.ehPositivo(2));
    }
    
    @Test
    public void testCompara(){
        assertEquals(0, cal.compara(2, 2));
    }

}
