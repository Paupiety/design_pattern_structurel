package org.example.particles.models;

public class ParticleType {
    public final String texture;
    public final String shader;
    public final String physique;

    public ParticleType(String texture, String shader, String physique) {
        this.texture = texture;
        this.shader = shader;
        this.physique = physique;
    }
}

