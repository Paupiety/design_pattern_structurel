package org.example.particles.models;

public abstract class IParticleFlyweight implements IParticlePrototype {
    public String name;
    public String texture;
    public String shader;
    public String physique;

    public IParticleFlyweight(String name, String texture, String shader, String physique) {
        this.name = name;
        this.texture = texture;
        this.shader = shader;
        this.physique = physique;
    }

    @Override
    public abstract IParticleFlyweight clone();
}
