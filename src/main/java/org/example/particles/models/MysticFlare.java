package org.example.particles.models;

import java.awt.*;

public class MysticFlare extends IParticule implements IParticlePrototype {
    private String flare;

    public MysticFlare(int x, int y, Color color, int count, float spread, float lifetime, ParticleType particleType) {
        super(x,y,color,count,spread,lifetime,particleType);
    }

    @Override
    public void setParticleType(ParticleType type) {
        this.particleType = type;
    }

    @Override
    public IParticlePrototype clone() {
        System.out.println("Particule MysticFlare");
        return new ArcaneGlow(this.x, this.y, this.color, this.count, this.spread, this.lifetime, this.particleType);
    }
}
