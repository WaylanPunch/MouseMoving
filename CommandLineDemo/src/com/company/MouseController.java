package com.company;

import java.awt.*;

/**
 * A New Class Created By Waylan Punch
 * https://github.com/WaylanPunch
 *
 * @author Waylan Punch
 * @date 2020/4/24 16:22
 */
public class MouseController {
    private Dimension dimension; //存储屏幕尺寸
    private Robot robot;//自动化对象

    public MouseController() {
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("屏幕大小为：" + dimension.getWidth() + " " + dimension.getHeight());
        int centerX = (int) dimension.getWidth() / 2;
        int centerY = (int) dimension.getHeight() / 2;
        //robot.mouseMove(centerX, centerY);
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void Move(int width, int height) {    //鼠标移动函数
        //System.out.println("enter Move()...");
        Point mousepoint = MouseInfo.getPointerInfo().getLocation();
        System.out.println("移动前坐标：" + mousepoint.x + " " + mousepoint.y);
        width += mousepoint.x;
        height += mousepoint.y;
        try {
            //"Delay must be to 0 to 60,000ms"
            //robot.delay(10000);
            robot.mouseMove(width, height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("移动后坐标：" + width + " " + height);
        //robot.mousePress(InputEvent.BUTTON1_MASK);//鼠标单击
    }


}
