package com.lg.gupao.abstractfactory;


import com.lg.gupao.factoryInterface.IAbstractFactory;
import com.lg.gupao.product.IProduct;
import com.lg.gupao.product.ProductA2;
import com.lg.gupao.product.ProductB2;

/**
 * @ClassName FactoryVarietyAB2
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryVarietyAB2 implements IAbstractFactory {
    @Override
    public IProduct createProductA() {
        return new ProductA2();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB2();
    }
}
