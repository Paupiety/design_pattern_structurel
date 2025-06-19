package org.example.particles;

import org.example.particles.models.ParticleType;

import java.util.HashMap;
import java.util.Map;

public class ParticleFlyweight {
    static Map<String, ParticleType> particleTypeList = new HashMap<>();

    public ParticleType GetParticleType(String texture, String shader, String physique) {
        String attributs = texture + shader + physique;
        if (!particleTypeList.containsKey(attributs)) {
            particleTypeList.put(attributs, new ParticleType(texture, shader, physique));
        }
        return particleTypeList.get(attributs);
    }
}
