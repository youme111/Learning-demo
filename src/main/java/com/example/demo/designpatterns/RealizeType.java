package com.example.demo.designpatterns;

/**
 * @description:
 * @author: huk
 * @create: 2022/3/30 14:16
 **/
public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}

