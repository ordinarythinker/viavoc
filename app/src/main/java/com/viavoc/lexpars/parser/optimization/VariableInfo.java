package com.viavoc.lexpars.parser.optimization;

import com.viavoc.lexpars.lib.Value;

public final class VariableInfo {
    public Value value;
    int modifications;

    @Override
    public String toString() {
        return (value == null ? "?" : value) + " (" + modifications + " mods)";
    }
}