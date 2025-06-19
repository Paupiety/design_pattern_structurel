package org.example.particles.models;

import java.awt.*;

public abstract class IParticule {

    public int x, y;
    public Color color;
    public int count;
    public float spread;
    public float lifetime;
    public ParticleType particleType;

    public IParticule(int x, int y, Color color, int count, float spread, float lifetime, ParticleType particleType) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.count = count;
        this.spread = spread;
        this.lifetime = lifetime;
        this.particleType = particleType;
    }
}
