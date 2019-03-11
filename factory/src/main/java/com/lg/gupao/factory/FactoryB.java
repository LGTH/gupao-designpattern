package com.lg.gupao.factory;


import com.lg.gupao.factoryInterface.IFactory;
import com.lg.gupao.product.IProduct;
import com.lg.gupao.product.ProductB;

/**
 * @ClassName FacotryB
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public class FactoryB implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}
