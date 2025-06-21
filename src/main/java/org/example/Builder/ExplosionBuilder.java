package org.example.Builder;

import org.example.particles.models.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ExplosionBuilder implements IExplosionBuilder {
    private int x, y;
    private Color color;
    private int count;
    private float spread;
    private float lifetime;
    private ParticleType particleType;
    private String particleName;
    private List<Class<? extends IParticlePrototype>> decorators = new ArrayList<>();

    @Override
    public IExplosionBuilder withPosition(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    public IExplosionBuilder withColor(Color c) {
        this.color = c;
        return this;
    }

    @Override
    public IExplosionBuilder withCount(int n) {
        this.count = n;
        return this;
    }

    @Override
    public IExplosionBuilder withSpread(float s) {
        this.spread = s;
        return this;
    }

    @Override
    public IExplosionBuilder withLifetime(float t) {
        this.lifetime = t;
        return this;
    }

    @Override
    public IExplosionBuilder withParticleType(ParticleType type) {
        this.particleType = type;
        return this;
    }

    @Override
    public IExplosionBuilder withParticleName(String name) {
        this.particleName = name;
        return this;
    }

    @Override
    public IExplosionBuilder addDecorator(Class<? extends IParticlePrototype> decoratorClass) {
        decorators.add(decoratorClass);
        return this;
    }

    @Override
    public ExplosionConfig build() {
        return new ExplosionConfig(x, y, color, count, spread, lifetime, particleType, particleName, decorators);
    }

    @Override
    public IExplosionBuilder cloneBuilder() {
        return new ExplosionBuilder()
            .withPosition(x, y)
            .withColor(color)
            .withCount(count)
            .withSpread(spread)
            .withLifetime(lifetime)
            .withParticleType(particleType)
            .withParticleName(particleName);
    }
}