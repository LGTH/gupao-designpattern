package com.lg.gupao.observer;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName GuavaObserverTest
 * @Auther: LG
 * @Description
 * @Date 2019/3/20
 **/
public class GuavaObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        gPer.register(tom);
        gPer.publishQuestion(new Question("lg", "瓜娃子是什么意思？"));
    }
}
