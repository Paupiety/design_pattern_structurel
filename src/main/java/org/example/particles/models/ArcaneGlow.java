package org.example.particles.models;

public class ArcaneGlow extends IParticleFlyweight {
    private String glow;

    public ArcaneGlow(String name, String texture, String shader, String physique, String glow) {
        super(name, texture, shader, physique);
        this.glow = glow;
    }

    @Override
    public IParticleFlyweight clone() {
        System.out.println("Particule ArcaneGlow");
        return new ArcaneGlow(this.name, this.texture, this.shader, this.physique, this.glow);
    }

}
