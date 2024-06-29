package br.uneb.dcet.si20192.seg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a classe DJB2Hash.
 */
public class DJB2HashTest {

    /**
     * Testa a função de hash DJB2 com uma string vazia.
     */
    @Test
    public void testEmptyString() {
        final String input = "";
        final long expectedHash = 5381;

        final long actualHash = DJB2Hash.hash(input);
        assertEquals(expectedHash, actualHash);
    }

    /**
     * Testa a função de hash DJB2 com uma string curta.
     */
    @Test
    public void testShortString() {
        final String input = "test";
        final long expectedHash = 6385723493L;

        final long actualHash = DJB2Hash.hash(input);
        assertEquals(expectedHash, actualHash);
    }

    /**
     * Testa a função de hash DJB2 com uma string mais longa.
     */
    @Test
    public void testLongString() {
        final String input = "The quick brown fox jumps over the lazy dog";
        final long expectedHash = 3950289020261251294L;

        final long actualHash = DJB2Hash.hash(input);
        assertEquals(expectedHash, actualHash);
    }

    /**
     * Testa a função de hash DJB2 com caracteres especiais.
     */
    @Test
    public void testSpecialCharacters() {
        final String input = "!@#$%^&*()";
        final long expectedHash = 8243049648544081841L;

        final long actualHash = DJB2Hash.hash(input);
        assertEquals(expectedHash, actualHash);
    }
}
