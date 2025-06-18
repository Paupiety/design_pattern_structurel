package org.example;

import org.example.particles.ParticleFlyweight;
import org.example.particles.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        ParticleFlyweight particleFlyweight = FlyweightFactory.getInstance().getFactoryFly();
        particleFlyweight.getParticleType("ArcaneGlow");
        particleFlyweight.getParticleType("ManaBurst");
    }
}