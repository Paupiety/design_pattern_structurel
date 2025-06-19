package org.example;

import org.example.particles.ParticleFlyweight;
import org.example.particles.FlyweightFactory;
import org.example.particles.ParticlePrototype;
import org.example.particles.models.IParticlePrototype;

public class Main {
    public static void main(String[] args) {
        ParticleFlyweight particleFlyweight = FlyweightFactory.getInstance().getFactoryFly();
        IParticlePrototype arcaneGlow = ParticlePrototype.createParticles("ArcaneGlow", "arcane",
                "shader1",
                "physique1");
        IParticlePrototype manaBurst = ParticlePrototype.createParticles("ManaBurst", "mana",
                "shader2",
                "physique2");
    }
}