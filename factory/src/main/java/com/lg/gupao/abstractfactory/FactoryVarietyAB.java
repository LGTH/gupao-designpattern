package com.lg.gupao.abstractfactory;


import com.lg.gupao.factoryInterface.IAbstractFactory;
import com.lg.gupao.product.IProduct;
import com.lg.gupao.product.ProductA;
import com.lg.gupao.product.ProductB;

/**
 * @ClassName IFactoryVarietyA
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryVarietyAB implements IAbstractFactory {


    @Override
    public IProduct createProductA() {
        return new ProductA();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB();
    }
}
