package org.example.particles;

import org.example.particles.models.*;
import java.util.HashMap;
import java.util.Map;

public class ParticlePrototype {
    private static final Map<String, IParticlePrototype> prototypes = new HashMap<>();

    static {
        prototypes.put("ArcaneGlow", new ArcaneGlow(new ParticleType("a.png", "s", "p")));
        prototypes.put("ManaBurst", new ManaBurst(new ParticleType("b.png", "s", "p")));
        prototypes.put("MysticFlare", new MysticFlare(new ParticleType("c.png", "s", "p")));
    }

    public static IParticlePrototype getClone(String name) {
        IParticlePrototype prototype = prototypes.get(name);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("Prototype not found: " + name);
    }
}