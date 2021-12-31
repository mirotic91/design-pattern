package me.mirotic.designpattern.structure.proxy;

import me.mirotic.designpattern.structure.proxy.after.DefaultGameService;
import me.mirotic.designpattern.structure.proxy.after.GameServiceProxy;
import me.mirotic.designpattern.structure.proxy.before.SquidGameService;
import org.junit.jupiter.api.Test;

class ProxyTest {

    @Test
    void before() {
        SquidGameService squidGameService = new SquidGameService();
        squidGameService.start();
    }

    @Test
    void after() {
        GameServiceProxy gameServiceProxy = new GameServiceProxy(new DefaultGameService());
        gameServiceProxy.start();
    }
}