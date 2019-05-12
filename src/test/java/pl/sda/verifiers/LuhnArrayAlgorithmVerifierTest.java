package pl.sda.verifiers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LuhnArrayAlgorithmVerifierTest {

    private LuhnArrayAlgorithmVerifier verifier = new LuhnArrayAlgorithmVerifier();

    @Test
    public void shouldVerify187450AsCorrectNumber() {
        //given
        final String number = "187450";
                            //2 8 14 4 10 0

        //when
        boolean result = verifier.verify(number);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldVerify187455AsIncorrectNumber() {
        //given
        final String number = "187455";
                            //2 8 14 4 10 5

        //when
        boolean result = verifier.verify(number);

        //then
        assertFalse(result);
    }

    @Test
    public void shouldVerify87452AsCorrectNumber() {
        //given
        final String number = "87452";
                            //8 14 4 10 2
        //when
        boolean result = verifier.verify(number);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldVerify87450AsIncorrectNumber() {
        //given
        final String number = "87450";

        //when
        boolean result = verifier.verify(number);

        //then
        assertFalse(result);
    }
}