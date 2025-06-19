package org.example.Builder;

import org.example.particles.models.IParticlePrototype;
import org.example.particles.models.ParticleType;

import java.awt.Color;

public interface IExplosionBuilder {
    IExplosionBuilder withPosition(int x, int y);
    IExplosionBuilder withColor(Color c);
    IExplosionBuilder withCount(int n);
    IExplosionBuilder withSpread(float s);
    IExplosionBuilder withLifetime(float f);
    IExplosionBuilder withParticles(ParticleType particlesPrototype);
    ExplosionConfig build();
    IExplosionBuilder cloneBuilder();
}