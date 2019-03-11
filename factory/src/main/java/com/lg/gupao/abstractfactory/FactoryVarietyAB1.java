package com.lg.gupao.abstractfactory;


import com.lg.gupao.factoryInterface.IAbstractFactory;
import com.lg.gupao.product.IProduct;
import com.lg.gupao.product.ProductA1;
import com.lg.gupao.product.ProductB1;

/**
 * @ClassName FactoryVarietyAB1
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryVarietyAB1 implements IAbstractFactory {
    @Override
    public IProduct createProductA() {
        return new ProductA1();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB1();
    }
}
