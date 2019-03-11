package com.lg.gupao;

import com.lg.gupao.abstractfactory.FactoryVarietyAB;
import com.lg.gupao.abstractfactory.FactoryVarietyAB1;
import com.lg.gupao.abstractfactory.FactoryVarietyAB2;
import com.lg.gupao.factory.FactoryA;
import com.lg.gupao.factory.FactoryB;
import com.lg.gupao.factoryInterface.IAbstractFactory;
import com.lg.gupao.factoryInterface.IFactory;
import com.lg.gupao.product.IProduct;
import com.lg.gupao.simplefactory.Factory;
import org.junit.Test;

/**
 * @ClassName FactoryTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/11
 **/
public class FactoryTest {

    @Test
    public void testSimpleFactory(){
        Factory factory = new Factory();

        IProduct iProduct = factory.createProduct("A");
        iProduct.show();

        iProduct = factory.createProduct("B");
        iProduct.show();
    }

    @Test
    public void testFactory(){
        IFactory factory = new FactoryA();
        IProduct iProduct = factory.createProduct();
        iProduct.show();

        factory = new FactoryB();
        iProduct = factory.createProduct();
        iProduct.show();
    }

    @Test
    public void testAbstractFactory(){
        IAbstractFactory factory = new FactoryVarietyAB();
        System.out.println("----------------原始代产品");
        IProduct iProduct = factory.createProductA();
        iProduct.show();
        iProduct = factory.createProductB();
        iProduct.show();

        System.out.println("----------------第一代产品");
        factory = new FactoryVarietyAB1();
        iProduct = factory.createProductA();
        iProduct.show();
        iProduct = factory.createProductB();
        iProduct.show();

        System.out.println("----------------第二代产品");
        factory = new FactoryVarietyAB2();
        iProduct = factory.createProductA();
        iProduct.show();
        iProduct = factory.createProductB();
        iProduct.show();
    }
}
