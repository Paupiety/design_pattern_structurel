package org.example.Builder;

import org.example.particles.models.IParticlePrototype;
import org.example.particles.models.ParticleType;

import java.awt.Color;

public abstract class ExplosionConfig {
    public int x, y;
    public Color color;
    public int count;
    public float spread;
    public float lifetime;
    public ParticleType particlesPrototype;

    public ExplosionConfig(int x, int y, Color color, int count, float spread, float lifetime, ParticleType particlesPrototype) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.count = count;
        this.spread = spread;
        this.lifetime = lifetime;
        this.particlesPrototype = particlesPrototype;
    }
}
