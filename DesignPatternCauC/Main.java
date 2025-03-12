package DesignPatternCauC;

import DesignPatternCauC.state.*;
import DesignPatternCauC.table.*;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo bàn cafe
        Table table = new Table();

        // In trạng thái mặc định
        table.printState();

        // Chuyển bàn sang trạng thái "Ordered"
        table.changeState(new OrderedState());
        table.printState();

        // Chuyển bàn sang trạng thái "Done"
        table.changeState(new DoneState());
        table.printState();

        // Chuyển bàn sang trạng thái "Fixing"
        table.changeState(new FixingState());
        table.printState();

        // Chuyển bàn về trạng thái "Free" sau khi sửa chữa xong
        table.changeState(new FreeState());
        table.printState();
    }
}
