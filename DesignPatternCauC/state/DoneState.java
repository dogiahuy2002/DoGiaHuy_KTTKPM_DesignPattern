package DesignPatternCauC.state;

import DesignPatternCauC.table.Table;

// Trạng thái bàn đã phục vụ xong
public class DoneState implements TableState {
    @Override
    public void handleState(Table table) {
        System.out.println("Bàn đã phục vụ xong, chờ dọn dẹp.");
        table.setState(this);
    }

    @Override
    public String getColor() {
        return "Yellow"; // Màu vàng cho bàn đã phục vụ xong
    }
}
