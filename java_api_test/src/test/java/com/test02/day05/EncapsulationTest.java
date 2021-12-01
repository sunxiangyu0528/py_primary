package com.test02.day05;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/6 21:18
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class EncapsulationTest {
    private String brand;
    private int price;

    //设置属性值-brand
    public void setBrand(String brand){
        this.brand=brand;
    }

    //得到属性值-brand
    public String getBrand(){
        return this.brand;
    }

    public void setPrice(int price){
        if(price <2000 | price>20000){
            System.out.println("价格不合理");
            return;
        }
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
