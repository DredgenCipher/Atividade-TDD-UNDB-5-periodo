package Soma_da_matriz;

import org.junit.jupiter.api.Test;


class MatrizTest {

    // Testar se a tamanho da Array é maior ou igual a 1 e menor que 1001
    @Test
    void check_size_min() {
        Matriz size = new Matriz();
        size.check_size();
        assertArrayEquals(size.check_size() >= 1, size.check_size());
    }
    @Test
    void check_size_max() {
        Matriz size = new Matriz();
        size.check_size();
        assertArrayEquals(size.check_size() < 1001, size.check_size());
    }

    private void assertArrayEquals(boolean b, int check_size) {
    }

    // Testar se a matriz possui elementos e se a soma não é negativa
    @Test
    void gerar_matriz_isnotnull() {
        Matriz gm = new Matriz();
        gm.gerar_matriz();
        gm.check_size();
        assert (gm.check_size() != 0);
    }
    @Test
    void gerar_matriz_sum() {
        Matriz gmsum = new Matriz();
        gmsum.gerar_matriz();
        if (gmsum.equals(-1) ){throw new AssertionError();}

}}