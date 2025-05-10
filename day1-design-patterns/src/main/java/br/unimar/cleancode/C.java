package br.unimar.cleancode;

/**
 * Bad Code.
 */
@Deprecated
public class C {
    public int a(int x, int y) {
        return x + y;
    }

    public int b(int y, int z) {
        return y - z;
    }

    public int c(int i, int j) {
        return i * j;
    }
}
