package com.mycompany.models;

import java.util.HashMap;
import java.util.Map;

public enum BookState {
    Bueno(0, "Buen estado"),
    Regular(1, "Regular"),
    Malo(2, "Malo"),
    Dañado(3, "Dañado");

    private final int value;
    private final String valueText;

    private static final Map<Integer, BookState> _map = new HashMap<>();
    private static final Map<String, BookState> _mapStr = new HashMap<>();

    static {
        for (BookState state : BookState.values()) {
            _map.put(state.value, state);
            _mapStr.put(state.valueText, state);
        }
    }

    BookState(final int newValue, final String valueText) {
        value = newValue;
        this.valueText = valueText;
    }

    public int getValue() {
        return value;
    }

    public static BookState from(int value) {
        return _map.get(value);
    }

    public static BookState from(String valueText) {
        return _mapStr.get(valueText);
    }

    @Override
    public String toString() {
        return this.valueText;
    }
}
