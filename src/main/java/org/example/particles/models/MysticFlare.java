package org.example.particles.models;

public class MysticFlare extends IParticleFlyweight {
    private String flare;

    public MysticFlare(String name, String texture, String shader, String physique, String flare) {
        super(name, texture, shader, physique);
        this.flare = flare;
    }

    @Override
    public IParticleFlyweight clone() {
        System.out.println("Particule MysticFlare");
        return new MysticFlare(this.name, this.texture, this.shader, this.physique, this.flare);
    }
}
