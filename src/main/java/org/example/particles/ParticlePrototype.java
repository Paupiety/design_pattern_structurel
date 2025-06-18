package org.example.particles;

import org.example.particles.models.*;

import java.util.HashMap;
import java.util.Map;

public class ParticlePrototype {
    private static final Map<String, IParticleFlyweight> particleList = new HashMap<>();

    static {
        ArcaneGlow arcaneGlow = new ArcaneGlow("ArcaneGlow", "texture", "shader", "physique", "glow");
        ManaBurst manaBurst = new ManaBurst("ManaBrust", "texture", "shader", "physique", "glow");
        MysticFlare mysticFlare = new MysticFlare("MysticFlare", "texture", "shader", "physique", "glow");
        particleList.put("ArcaneGlow", arcaneGlow);
        particleList.put("ManaBurst", manaBurst);
        particleList.put("MysticFlare", mysticFlare);
    }

    public static IParticleFlyweight createParticles(String type) {
        if(particleList.containsKey(type)) {
            return particleList.get(type).clone();
        }
        throw new IllegalArgumentException("Prototype " + type + " introuvable");
    }
}
