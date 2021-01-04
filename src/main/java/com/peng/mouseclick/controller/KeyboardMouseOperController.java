package com.peng.mouseclick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

@Controller
public class KeyboardMouseOperController {

    @Autowired
    private static Robot robot;

    private boolean isStop = false;

    @GetMapping("/")
    public String index(){
        return "controllerH.html";
    }

    @GetMapping("/stop")
    @ResponseBody
    public String stopRun(){
        isStop = true;
        
        return "停止运行";
    }

    @GetMapping("/dnf/clickLeftMouse")
    @ResponseBody
    public String clickLeftMouse() throws InterruptedException {
        Thread.sleep(3000L);
        isStop = false;
        try {
            robot = new Robot();//创建Robot对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("开始");
        /*for (int i = 0; i < 10000; i++) {
            //按下和释放鼠标左键，选定工程
            robot.mousePress(KeyEvent.BUTTON1_MASK);
            robot.delay(10);
            robot.mouseRelease(KeyEvent.BUTTON1_MASK);
            robot.delay(20);
        }*/
        while (!isStop){
            robot.mousePress(KeyEvent.BUTTON1_MASK);
            robot.delay(10);
            robot.mouseRelease(KeyEvent.BUTTON1_MASK);
            robot.delay(20);
        }
        System.out.println("执行结束");
        return "执行结束";
    }

    @GetMapping("/lol/clickRightMouse")
    @ResponseBody
    public String clickRightMouse() throws InterruptedException {
        Thread.sleep(3000L);
        isStop = false;
        try {
            robot = new Robot();//创建Robot对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("开始");
        int i = 0;
        while (!isStop) {
            i++;
            if (i/4 ==0) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_Q);
                robot.delay(10);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_Q);
            }
            if (i/4 ==1) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_W);
                robot.delay(10);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_W);
            }
            if (i/4 ==2) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_E);
                robot.delay(10);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_E);
            }
            if (i/4 ==3) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_R);
                robot.delay(10);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_R);
            }

            robot.mouseMove(i*100,i*100);
            //按下和释放鼠标左键，选定工程
            robot.mousePress(InputEvent.BUTTON3_MASK);
            robot.delay(10);
            robot.mouseRelease(InputEvent.BUTTON3_MASK);
            robot.delay(60000);
        }
        return "执行结束";
    }

    @GetMapping("/dnf/clickRightMouse")
    @ResponseBody
    public String dnfClickRightMouse() throws InterruptedException {
        Thread.sleep(3000L);
        isStop = false;
        try {
            robot = new Robot();//创建Robot对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("开始");
        int i = 0;
        while (!isStop){
            robot.mousePress(KeyEvent.BUTTON3_MASK);
            robot.delay(5);
            robot.mouseRelease(KeyEvent.BUTTON3_MASK);
            robot.delay(50);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(5);
            robot.keyRelease(KeyEvent.VK_SPACE);
            robot.delay(10);

        }

        return "执行结束";
    }

    @GetMapping("/dnf/click6_SPACE")
    @ResponseBody
    public String dnfClick6_SPACE() throws InterruptedException {
        Thread.sleep(3000L);
        isStop = false;
        try {
            robot = new Robot();//创建Robot对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("开始");
        int i = 0;
        while (!isStop){
            robot.keyPress(KeyEvent.VK_6);
            robot.delay(10);
            robot.keyRelease(KeyEvent.VK_6);
            robot.delay(30);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(10);
            robot.keyRelease(KeyEvent.VK_SPACE);
            robot.delay(20);
        }

        return "执行结束";
    }

    @GetMapping("/yun/refresh")
    @ResponseBody
    public String yunRefresh() throws InterruptedException {
        Thread.sleep(3000L);
        isStop = false;
        try {
            robot = new Robot();//创建Robot对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("开始");
        while (!isStop) {
            robot.keyPress(KeyEvent.VK_F5);
            robot.delay(10);
            robot.keyRelease(KeyEvent.VK_F5);
            robot.delay(60*1000*10);
        }
        return "执行结束";
    }
}
