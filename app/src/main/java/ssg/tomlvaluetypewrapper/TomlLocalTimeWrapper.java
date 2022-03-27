package ssg.tomlvaluetypewrapper;

import java.time.LocalTime;

/**
 * Wrapper for LocalTime.
 */
public class TomlLocalTimeWrapper extends TomlValueTypeWrapper {
    /**
    * A wrapped LocalTime.
    */
    private final LocalTime value;

    /**
     * Constructor.
     */
    public TomlLocalTimeWrapper(LocalTime value) {
        this.value = value;
    }

    /**
     * Return the wrapped value.
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
