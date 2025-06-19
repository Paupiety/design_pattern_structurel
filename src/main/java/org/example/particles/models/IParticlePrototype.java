package org.example.particles.models;

public interface IParticlePrototype {
    public IParticlePrototype clone();
    void setParticleType(ParticleType particleType);
}
