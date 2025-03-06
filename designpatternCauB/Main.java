package designpatternCauB;

import designpatternCauB.salary.*;

public class Main {
    public static void main(String[] args) {
        // Nhân viên cơ bản với lương 10,000
        Employee nv1 = new Base(10000);
        System.out.println(nv1.getDescription() + ": Lương = " + nv1.getSalary());

        // Nhân viên nv1 được thăng chức thành Trưởng Phòng (TP)
        nv1 = new TruongPhong(nv1);
        System.out.println(nv1.getDescription() + ": Lương = " + nv1.getSalary());

        // Nhân viên nv2 là Hiệu Trưởng (HT)
        Employee nv2 = new HieuTruong(new Base(10000));
        System.out.println(nv2.getDescription() + ": Lương = " + nv2.getSalary());

        // Nhân viên nv3 là Phó Hiệu Trưởng (PHT)
        Employee nv3 = new PhoHieuTruong(new Base(10000));
        System.out.println(nv3.getDescription() + ": Lương = " + nv3.getSalary());
    }
}
