package org.example.particles;

import org.example.particles.models.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ParticlePrototype {
    private static final Map<String, IParticlePrototype> particleList = new HashMap<>();

    static {
        ParticleFlyweight particleFlyweight = FlyweightFactory.getInstance().getFactoryFly();

        particleList.put("ArcaneGlow", new ArcaneGlow(
                0, 0, 0f, 0f, 0f,
                particleFlyweight.GetParticleType("arcane", "shader1", "physique1")
        ));

        particleList.put("ManaBurst", new ManaBurst(
                0, 0, 0f, 0f, 0f,
                particleFlyweight.GetParticleType("mana", "shader2", "physique2")
        ));

        particleList.put("MysticFlare", new MysticFlare(
                0, 0, 0f, 0f, 0f,
                particleFlyweight.GetParticleType("MysticFlare", "shader3", "physique3")
        ));
    }


    public static IParticlePrototype createParticles(String type, ParticleType particleType) {
        if (particleList.containsKey(type)) {
            IParticlePrototype prototype = particleList.get(type).clone();
            prototype.setParticleType(particleType);

            return prototype;
        }
        throw new IllegalArgumentException("Prototype " + type + " introuvable");
    }

}
