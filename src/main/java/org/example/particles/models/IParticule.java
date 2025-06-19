package org.example.particles.models;

import java.awt.*;

public abstract class IParticule {

    public int x, y;
    public float speed;
    public float spread;
    public float lifetime;
    public ParticleType particleType;

    public IParticule(int x, int y, float speed, float spread, float lifetime, ParticleType particleType) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.spread = spread;
        this.lifetime = lifetime;
        this.particleType = particleType;
    }
}
