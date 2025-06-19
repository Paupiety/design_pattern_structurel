package org.example;

import org.example.particles.ParticleFlyweight;
import org.example.particles.FlyweightFactory;
import org.example.particles.ParticlePrototype;
import org.example.particles.models.IParticlePrototype;
import org.example.particles.models.ParticleType;

public class Main {
    public static void main(String[] args) {
        ParticleFlyweight particleFlyweight = FlyweightFactory.getInstance().getFactoryFly();
        ParticleType particleType = particleFlyweight.GetParticleType("texture", "shader", "physique");
        IParticlePrototype arcaneGlow = ParticlePrototype.createParticles("ArcaneGlow", particleType);
        IParticlePrototype manaBurst = ParticlePrototype.createParticles("ManaBurst", particleType);
    }
}