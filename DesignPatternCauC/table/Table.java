package DesignPatternCauC.table;

import DesignPatternCauC.state.TableState;
import DesignPatternCauC.state.FreeState;

public class Table {
    private TableState state;

    public Table() {
        // Mặc định khi khởi tạo, bàn đang trống
        this.state = new FreeState();
    }

    public void setState(TableState state) {
        this.state = state;
    }

    public void changeState(TableState newState) {
        newState.handleState(this);
    }

    public void printState() {
        System.out.println("Màu bàn hiện tại: " + state.getColor());
    }
}
