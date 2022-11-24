import org.example.Exercicio2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestePrimeAndStuff {

    private Exercicio2 exercicio2;

    @BeforeEach
    public void setup(){
        exercicio2 = new Exercicio2();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void testPrimes(int number){
        boolean isPrime = exercicio2.isPrime(number);
        assertTrue(isPrime);
    }
    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void isEven(int number){
        boolean isEven = exercicio2.isEven(number);
        assertTrue(isEven);
    }
    @ParameterizedTest
    @ValueSource(ints = {23, 46, 115, 184, 207, 230})
    public void isMultiple(int number){
        boolean isMultiple = exercicio2.isMultiple(number, 23);
        assertTrue(isMultiple);
    }

    //csvSource(value("","")
    //methodSource()
    //

}
