package me.mirotic.designpattern.structure.bridge;

import me.mirotic.designpattern.structure.bridge.after.Blood;
import me.mirotic.designpattern.structure.bridge.after.Dark;
import me.mirotic.designpattern.structure.bridge.after.Knight;
import me.mirotic.designpattern.structure.bridge.after.Monk;
import me.mirotic.designpattern.structure.bridge.before.BloodMonk;
import me.mirotic.designpattern.structure.bridge.before.Champion;
import me.mirotic.designpattern.structure.bridge.before.DarkKnight;
import org.junit.jupiter.api.Test;


class BridgeTest {

    @Test
    void before() {
        Champion darkKnight = new DarkKnight();
        darkKnight.move();
        darkKnight.attack();
        darkKnight.hold();

        Champion bloodMonk = new BloodMonk();
        bloodMonk.hold();
        bloodMonk.move();
        bloodMonk.attack();
    }

    @Test
    void after() {
        Champion darkKnight = new Knight(new Dark());
        darkKnight.move();
        darkKnight.attack();
        darkKnight.hold();

        Champion bloodMonk = new Monk(new Blood());
        bloodMonk.hold();
        bloodMonk.move();
        bloodMonk.attack();
    }
}