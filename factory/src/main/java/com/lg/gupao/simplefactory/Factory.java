package com.lg.gupao.simplefactory;


import com.lg.gupao.product.IProduct;
import com.lg.gupao.product.ProductA;
import com.lg.gupao.product.ProductB;

/**
 * @ClassName Factory
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class Factory {

    public IProduct createProduct(String name) {
        if (name.equalsIgnoreCase("A")) {
            return new ProductA();
        } else if (name.equalsIgnoreCase("B")) {
            return new ProductB();
        }
        return  null;
    }

}
