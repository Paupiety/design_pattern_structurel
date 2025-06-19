package org.example.particles.models;

import java.awt.*;

public class MysticFlare extends IParticule implements IParticlePrototype {
    private String flare;

    public MysticFlare(int x, int y, float speed, float spread, float lifetime, ParticleType particleType) {
        super(x,y,speed,spread,lifetime,particleType);
    }

    @Override
    public void setParticleType(ParticleType type) {
        this.particleType = type;
    }

    @Override
    public IParticlePrototype clone() {
        System.out.println("Particule MysticFlare");
        return new MysticFlare(this.x, this.y, this.speed, this.spread, this.lifetime, this.particleType);
    }
}
