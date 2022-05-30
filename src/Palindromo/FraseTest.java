package Palindromo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.LowerCase;

class FraseTest {

    // Testar se o retono do palindromo será nulo
    @Test
    void palindrome() {
        Frase wp = new Frase();
        wp.palindrome();
        if (wp.equals(null))throw new AssertionError();
    }
    // Testar se a palavra invertida terá letras maiusculas
    @Test
    void palindrome_islow(){
        Frase wplow = new Frase();
        wplow.palindrome();
        assert (wplow.palindrome() != true);
    }
}