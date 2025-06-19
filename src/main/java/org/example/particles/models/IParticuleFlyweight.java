package org.example.particles.models;

public abstract class IParticuleFlyweight {

    public int x, y;
    public float speed;
    public float spread;
    public float lifetime;
    public ParticleType particleType;

    public IParticuleFlyweight(int x, int y, float speed, float spread, float lifetime, ParticleType particleType) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.spread = spread;
        this.lifetime = lifetime;
        this.particleType = particleType;
    }
}
