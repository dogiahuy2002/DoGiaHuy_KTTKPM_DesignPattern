package DesignPatternCauC.state;

import DesignPatternCauC.table.Table;

// Trạng thái bàn trống
public class FreeState implements TableState {
    @Override
    public void handleState(Table table) {
        System.out.println("Bàn đang trống, khách có thể sử dụng.");
        table.setState(this);
    }

    @Override
    public String getColor() {
        return "Green"; // Màu xanh lá cho bàn trống
    }
}
