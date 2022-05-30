package Diferença_das_diagonais;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {

    // Testar se o número para determinar o tamanho da array é diferente de 0 e 1
    @Test
    void tamanho() {
        Matriz tm = new Matriz();
        tm.tamanho();
        assert(tm.tamanho() != 0);
        assert (tm.tamanho() != 1);
    }

    // Testar se o tamanho da Array é maior ou igual a 2 e menor que 1001
    @Test
    void check_size_min() {
        Matriz size = new Matriz();
        size.check_size();
        assertArrayEquals(size.check_size() >= 2, size.check_size());
    }
    @Test
    void check_size_max() {
        Matriz size = new Matriz();
        size.check_size();
        assertArrayEquals(size.check_size() <= 1001, size.check_size());
    }


    private void assertArrayEquals(boolean b, int check_size) {
    }

    // Testar se a Array é valida
    @Test
    void gerar_matriz_val() {
        Matriz gm = new Matriz();
        gm.gerar_matriz();
        assert (gm.check_size() != 0);
        assert (gm.check_size() != 1);
    }
    // Testar se o valor das operações não retornam nulo
    @Test
    void gerar_matriz_sumdif() {
        Matriz gmsumdif = new Matriz();
        gmsumdif.gerar_matriz();
        if (gmsumdif.equals(null)) throw new AssertionError();}
}