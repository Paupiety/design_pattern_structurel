package org.example.particles;

import org.example.particles.models.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ParticlePrototype {
    private static final Map<String, IParticlePrototype> particleList = new HashMap<>();

    static {
        particleList.put("ArcaneGlow", new ArcaneGlow(
                0, 0, 0f, 0f, 0f,
                ParticleFlyweight.GetParticleType("arcane", "shader1", "physique1")
        ));

        particleList.put("ManaBurst", new ManaBurst(
                0, 0, 0f, 0f, 0f,
                ParticleFlyweight.GetParticleType("mana", "shader2", "physique2")
        ));

        particleList.put("MysticFlare", new MysticFlare(
                0, 0, 0f, 0f, 0f,
                ParticleFlyweight.GetParticleType("MysticFlare", "shader3", "physique3")
        ));
    }


    public static IParticlePrototype createParticles(String type, String texture, String shader, String physique) {
        if (particleList.containsKey(type)) {
            IParticlePrototype prototype = particleList.get(type).clone();

            ParticleType customType = ParticleFlyweight.GetParticleType(texture, shader, physique);
            prototype.setParticleType(customType);

            return prototype;
        }
        throw new IllegalArgumentException("Prototype " + type + " introuvable");
    }

}
