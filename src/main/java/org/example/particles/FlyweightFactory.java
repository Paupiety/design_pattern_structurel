package org.example.particles;

import java.util.HashMap;
import java.util.Map;
import org.example.particles.models.*;

public class FlyweightFactory {
    private static FlyweightFactory instance;
    private final Map<String, ParticleType> cache = new HashMap<>();

    private FlyweightFactory() {}

    public static synchronized FlyweightFactory getInstance() {
        if (instance == null) {
            instance = new FlyweightFactory();
        }
        return instance;
    }

    public ParticleType getParticleType(String texture, String shader, String physics) {
        String key = texture + "|" + shader + "|" + physics;
        return cache.computeIfAbsent(key, k -> new ParticleType(texture, shader, physics));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton FlyweightFactory cannot be cloned");
    }
}