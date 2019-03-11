package com.lg.gupao.factory;


import com.lg.gupao.factoryInterface.IFactory;
import com.lg.gupao.product.IProduct;
import com.lg.gupao.product.ProductA;

/**
 * @ClassName FactoryA
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryA implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
