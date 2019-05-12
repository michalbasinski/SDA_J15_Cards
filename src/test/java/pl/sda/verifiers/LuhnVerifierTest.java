package pl.sda.verifiers;

import org.junit.Test;

import static org.junit.Assert.*;

public class LuhnVerifierTest {

    private LuhnVerifier verifier = new LuhnVerifier();

    @Test
    public void shouldVerify187450AsCorrectNumber() {
        //given
        final String number = "187450";

        //when
        boolean result = verifier.verify(number);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldVerify187455AsIncorrectNumber() {
        //given
        final String number = "187455";

        //when
        boolean result = verifier.verify(number);

        //then
        assertFalse(result);
    }

    @Test
    public void shouldVerify87452AsCorrectNumber() {
        //given
        final String number = "87452";
        //when
        boolean result = verifier.verify(number);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldVerify87450AsInorrectNumber() {
        //given
        final String number = "87450";

        //when
        boolean result = verifier.verify(number);

        //then
        assertFalse(result);
    }
}