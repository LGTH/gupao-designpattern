package com.lg.gupao.factoryInterface;


import com.lg.gupao.product.IProduct;

/**
 * @ClassName IAbstractFactory
 * @Auther: LG
 * @Description
 * @Date 2019/3/8
 **/
public interface IAbstractFactory {
    public IProduct createProductA();
    public IProduct createProductB();
}
