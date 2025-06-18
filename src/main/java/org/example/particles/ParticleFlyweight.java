package org.example.particles;

import org.example.particles.models.IParticleFlyweight;

import java.util.HashMap;
import java.util.Map;

public class ParticleFlyweight {
    static Map<String, IParticleFlyweight> particleTypeList = new HashMap<>();

    public IParticleFlyweight getParticleType(String name) {
        IParticleFlyweight result = particleTypeList.get(name);
        if(result == null) {
            result = ParticlePrototype.createParticles(name);
            particleTypeList.put(name, result);
        }
        return result;
    }
}
