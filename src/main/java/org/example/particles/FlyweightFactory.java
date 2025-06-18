package org.example.particles;

public class FlyweightFactory {
    private static volatile FlyweightFactory instance;

    public FlyweightFactory() {
        this.particleFlyweight = new ParticleFlyweight();
    }

    public ParticleFlyweight particleFlyweight;

    public static FlyweightFactory getInstance() {
        FlyweightFactory result = instance;
        if(result != null) {
            return result;
        }

        synchronized (FlyweightFactory.class) {
            if(instance == null) {
                return instance = new FlyweightFactory();
            }
            return instance;
        }
    }

    public ParticleFlyweight getFactoryFly() {
        return this.particleFlyweight;
    }
}
