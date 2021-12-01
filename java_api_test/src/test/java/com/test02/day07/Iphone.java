package com.test02.day07;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/11 20:49
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class Iphone extends Phone implements InterfaceCamera,InterfaceGame{
    @Override
    public void call() {
        System.out.println("用4G的技术打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("用4G的技术发短信");
    }

    @Override
    public void takePhoto() {
        System.out.println("苹果手机拍照");
    }

    @Override
    public void playGame() {
        System.out.println("苹果手机玩游戏");
    }
}
