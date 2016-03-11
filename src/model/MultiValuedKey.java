package model;

import java.util.Arrays;

/**
 * User: VorobyovPM
 * Date: 08.09.14
 */
public class MultiValuedKey implements Key {
    private final Object[] key;

    public MultiValuedKey(Object... key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MultiValuedKey that = (MultiValuedKey) o;

        return Arrays.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(key);
    }
}
