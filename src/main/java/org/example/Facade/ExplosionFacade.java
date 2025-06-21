package org.example.Facade;

import org.example.Builder.ExplosionBuilder;
import org.example.Builder.ExplosionConfig;
import org.example.Builder.IExplosionBuilder;
import org.example.Factory_Method.Explosion;
import org.example.Factory_Method.ExplosionFactory;
import org.example.Decorateur.*;
import org.example.particles.FlyweightFactory;
import org.example.particles.models.ParticleType;

import java.awt.Color;
import java.util.*;

public class ExplosionFacade {

    private final ExplosionFactory factory;

    private static final Map<String, Class<? extends ParticleDecorator>> decoratorMap = new HashMap<>();

    static {
        decoratorMap.put("glow", GlowDecorator.class);
        decoratorMap.put("shadow", ShadowDecorator.class);
        decoratorMap.put("fadeout", FadeOutDecorator.class);
    }

    public ExplosionFacade() {
        this.factory = new ExplosionFactory();
    }

    public Explosion createExplosion(
            String particleName,
            String texture,
            String shader,
            String physics,
            int x,
            int y,
            Color color,
            int count,
            float lifetime,
            float spread,
            List<String> decoratorNames
    ) {
        ParticleType particleType = FlyweightFactory.getInstance().getParticleType(texture, shader, physics);

        IExplosionBuilder builder = new ExplosionBuilder()
            .withParticleName(particleName)
            .withParticleType(particleType)
            .withPosition(x, y)
            .withColor(color)
            .withCount(count)
            .withLifetime(lifetime)
            .withSpread(spread);


        // Ajout des décorateurs en fonction des noms
        for (String name : decoratorNames) {
            Class<? extends ParticleDecorator> decoratorClass = decoratorMap.get(name.toLowerCase());
            if (decoratorClass == null) {
                throw new IllegalArgumentException("Unknown decorator: " + name);
            }
            builder.addDecorator(decoratorClass);
        }

        ExplosionConfig config = builder.build();
        return factory.create(config);
    }
}
