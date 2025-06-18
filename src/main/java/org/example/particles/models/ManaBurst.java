package org.example.particles.models;

public class ManaBurst extends IParticleFlyweight {
    private String brust;

    public ManaBurst(String name, String texture, String shader, String physique, String brust) {
        super(name, texture, shader, physique);
        this.brust = brust;
    }

    @Override
    public IParticleFlyweight clone() {
        System.out.println("Particule ManaBurst");
        return new ManaBurst(this.name, this.texture, this.shader, this.physique, this.brust);
    }
}
