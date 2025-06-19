package org.example.Builder;

import org.example.particles.models.ParticleType;

import java.awt.*;

public class ExplosionBuilder extends ExplosionConfig implements IExplosionBuilder {

    public ExplosionBuilder(int x, int y, Color color, int count, float spread, float lifetime, ParticleType particlesPrototype) {
        super(x, y, color, count, spread, lifetime, particlesPrototype);
    }

    public ExplosionBuilder() {
        super(0, 0, Color.WHITE, 0, 0f, 0f, null);
    }

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
    public IExplosionBuilder withParticles(ParticleType particlesPrototype) {
        return null;
    }


    @Override
    public ExplosionConfig build() {
        return this;
    }

    @Override
    public IExplosionBuilder cloneBuilder() {
        ExplosionBuilder clone = new ExplosionBuilder();
        clone.withPosition(this.x, this.y)
                .withColor(this.color)
                .withCount(this.count)
                .withSpread(this.spread)
                .withLifetime(this.lifetime)
                .withParticles(this.particlesPrototype);
        return clone;
    }
}
