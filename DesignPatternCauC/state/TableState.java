package DesignPatternCauC.state;

import DesignPatternCauC.table.Table;

public interface TableState {
    void handleState(Table table);

    String getColor();
}