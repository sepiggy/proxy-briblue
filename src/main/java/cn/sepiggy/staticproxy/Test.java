package cn.sepiggy.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        MaotaiJiu maotaiJiu = new MaotaiJiu();

        InvocationHandler jingxiao1 = new GuitaiA(maotaiJiu);

        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaotaiJiu.class.getClassLoader(),
                MaotaiJiu.class.getInterfaces(), jingxiao1);

        dynamicProxy.mainJiu();
    }

}
