package org.example.particles.models;

public interface IParticlePrototype {
    IParticlePrototype clone();
    void update(float dt);
    void render();
    void setParticleType(ParticleType type);
    void setRandomizedPosition(int x, int y, float spread);
}