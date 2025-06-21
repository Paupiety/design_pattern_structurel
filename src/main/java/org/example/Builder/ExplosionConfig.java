package org.example.Builder;

import java.awt.Color;
import java.util.List;

import org.example.particles.models.*;

public final class ExplosionConfig {
    private final int x, y;
    private final Color color;
    private final int count;
    private final float spread;
    private final float lifetime;
    private final ParticleType particleType;
    private final String particleName;
    private final List<Class<? extends IParticlePrototype>> decorators;

    public ExplosionConfig(int x, int y, Color color, int count, float spread, float lifetime, ParticleType particleType, String particleName, List<Class<? extends IParticlePrototype>> decorators) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.count = count;
        this.spread = spread;
        this.lifetime = lifetime;
        this.particleType = particleType;
        this.particleName = particleName;
        this.decorators = decorators;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Color getColor() { return color; }
    public int getCount() { return count; }
    public float getSpread() { return spread; }
    public float getLifetime() { return lifetime; }
    public ParticleType getParticleType() { return particleType; }
    public String getParticleName() { return particleName; }
    public List<Class<? extends IParticlePrototype>> getDecorators() { return decorators; }
}