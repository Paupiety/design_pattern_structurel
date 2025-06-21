package org.example.Builder;

import org.example.particles.models.*;
import java.awt.Color;

public interface IExplosionBuilder {
    IExplosionBuilder withPosition(int x, int y);
    IExplosionBuilder withColor(Color c);
    IExplosionBuilder withCount(int n);
    IExplosionBuilder withSpread(float s);
    IExplosionBuilder withLifetime(float t);
    IExplosionBuilder withParticleType(ParticleType type);
    IExplosionBuilder withParticleName(String name);
    IExplosionBuilder addDecorator(Class<? extends IParticlePrototype> decoratorClass);
    ExplosionConfig build();
    IExplosionBuilder cloneBuilder();
}