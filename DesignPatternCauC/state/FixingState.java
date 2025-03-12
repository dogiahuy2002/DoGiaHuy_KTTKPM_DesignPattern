package DesignPatternCauC.state;

import DesignPatternCauC.table.Table;

// Trạng thái bàn đang sửa chữa
public class FixingState implements TableState {
    @Override
    public void handleState(Table table) {
        System.out.println("Bàn đang sửa chữa, không thể sử dụng.");
        table.setState(this);
    }

    @Override
    public String getColor() {
        return "Red"; // Màu đỏ cho bàn đang sửa chữa
    }
}
