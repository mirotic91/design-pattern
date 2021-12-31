package me.mirotic.designpattern.structure.proxy.after;

import lombok.SneakyThrows;

/**
 * Proxy
 */
public class GameServiceProxy implements GameService {

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @SneakyThrows
    @Override
    public void start() {
        long start = System.currentTimeMillis();
        gameService.start();
        Thread.sleep(1234);
        long end = System.currentTimeMillis();
        System.out.printf("it takes %d ms.", end - start);
    }
}
