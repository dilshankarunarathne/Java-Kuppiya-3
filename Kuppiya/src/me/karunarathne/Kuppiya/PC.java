package me.karunarathne.Kuppiya;

public class PC {
    Monitor monitor;
    ControlUnit cu;
    Keyboard keyboard;

    public PC (Monitor monitor, ControlUnit cu, Keyboard keyboard) {
        this.monitor = monitor;
        this.cu = cu;
        this.keyboard = keyboard;
    }
}

class MainM {
    public static void main(String[] args) {
        PC myDesktop = new PC (
                new Monitor(
                        new Resolution(
                                1080, 1920
                        ),
                        144,
                        "Dell"
                ),
                new ControlUnit(),
                new Keyboard()
        ) ;
    }
}

class Keyboard {
    String type;
}
class Monitor {
    Resolution resolution;
    int refreshRate;
    String brand;

    public Monitor(Resolution resolution, int refreshRate, String brand) {
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.brand = brand;
    }
}
class Resolution {
    int x;
    int y;

    public Resolution(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class ControlUnit {
    int ram;
    String cpu;
    String gpu;
}