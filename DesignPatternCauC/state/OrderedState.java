package DesignPatternCauC.state;

import DesignPatternCauC.table.Table;

// Trạng thái bàn đang gọi món
public class OrderedState implements TableState {
    @Override
    public void handleState(Table table) {
        System.out.println("Bàn đã được đặt món.");
        table.setState(this);
    }

    @Override
    public String getColor() {
        return "Orange"; // Màu cam cho bàn đã gọi món
    }
}
