package org.example.Factory_Method;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import org.example.Builder.ExplosionConfig;
import org.example.particles.FlyweightFactory;
import org.example.particles.models.IParticlePrototype;
import org.example.particles.models.ParticleType;
import org.example.proxy.IExplosionFactory;
import org.example.particles.ParticlePrototype;

public class ExplosionFactory implements IExplosionFactory {

    @Override
    public Explosion create(ExplosionConfig config) {
        // récupération Flyweight + prototype (comme avant)
        ParticleType particleType = FlyweightFactory.getInstance().getParticleType(
                config.getParticleType().getTexture(),
                config.getParticleType().getShader(),
                config.getParticleType().getPhysics()
        );

        IParticlePrototype prototype = ParticlePrototype.getClone(config.getParticleName());

        List<IParticlePrototype> particles = new ArrayList<>();
        for (int i = 0; i < config.getCount(); i++) {
            IParticlePrototype particle = prototype.clone();
            particle.setRandomizedPosition(config.getX(), config.getY(), config.getSpread());

            // Application des décorateurs dynamiquement via réflexion
            for (Class<? extends IParticlePrototype> decoratorClass : config.getDecorators()) {
                try {
                    Constructor<? extends IParticlePrototype> ctor = decoratorClass.getConstructor(IParticlePrototype.class);
                    particle = ctor.newInstance(particle);
                } catch (Exception e) {
                    throw new RuntimeException("Erreur lors de l'application du décorateur " + decoratorClass.getSimpleName(), e);
                }
            }

            particles.add(particle);
        }

        return new Explosion(particles, config.getLifetime());
    }
}