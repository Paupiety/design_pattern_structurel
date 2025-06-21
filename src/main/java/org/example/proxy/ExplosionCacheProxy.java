package org.example.proxy;

import org.example.Builder.ExplosionConfig;
import org.example.Factory_Method.*;
import java.util.HashMap;
import java.util.Map;

public class ExplosionCacheProxy implements IExplosionFactory {
    private final IExplosionFactory realFactory;
    private final Map<String, Explosion> cache = new HashMap<>();

    public ExplosionCacheProxy(IExplosionFactory realFactory) {
        this.realFactory = realFactory;
    }

    @Override
    public Explosion create(ExplosionConfig config) {
        String key = generateKey(config);

        // Si l'explosion a déjà été générée, on retourne une "copie" ou une version partagée
        if (cache.containsKey(key)) {
            System.out.println("[Proxy] Explosion retrouvée en cache.");
            return cache.get(key); // Optionnel : faire un clone si mutable
        }

        // Sinon, on crée une nouvelle via la vraie factory
        System.out.println("[Proxy] Nouvelle explosion générée.");
        Explosion explosion = realFactory.create(config);
        cache.put(key, explosion);
        return explosion;
    }

    private String generateKey(ExplosionConfig config) {
        return config.getX() + "|" + config.getY() + "|" +
               config.getColor().getRGB() + "|" + config.getCount() + "|" +
               config.getSpread() + "|" + config.getLifetime() + "|" +
               config.getParticleName();
    }
}