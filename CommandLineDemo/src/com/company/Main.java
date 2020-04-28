package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            MouseController mc = new MouseController();

            System.out.println("Mouse Control Started");
            for (int i = 0; i < 200; i++) {
                System.out.println("mouse control start:" + i);
                Thread.sleep(30000);
                mc.Move(20, 0);//坐标为相对坐标
                mc.Move(0, -20);
                mc.Move(-20, 0);
                mc.Move(0, 20);
                System.out.println("mouse control stop.");
            }
            System.out.println("Mouse Control Ended");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
