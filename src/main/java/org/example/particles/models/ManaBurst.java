package org.example.particles.models;

import java.awt.*;

public class ManaBurst extends IParticule implements IParticlePrototype {

    public ManaBurst(int x, int y, float speed, float spread, float lifetime, ParticleType particleType) {
        super(x,y,speed, spread,lifetime,particleType);
    }

    @Override
    public void setParticleType(ParticleType type) {
        this.particleType = type;
    }

    @Override
    public IParticlePrototype clone() {
        System.out.println("Particule ManaBurst");
        return new ManaBurst(this.x, this.y, this.speed, this.spread, this.lifetime, this.particleType);
    }
}
