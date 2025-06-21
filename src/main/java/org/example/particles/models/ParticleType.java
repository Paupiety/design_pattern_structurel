package org.example.particles.models;

public class ParticleType {
    private final String texture;
    private final String shader;
    private final String physics;

    public ParticleType(String texture, String shader, String physics) {
        this.texture = texture;
        this.shader = shader;
        this.physics = physics;
    }

    public String getTexture() { return texture; }
    public String getShader() { return shader; }
    public String getPhysics() { return physics; }
}

