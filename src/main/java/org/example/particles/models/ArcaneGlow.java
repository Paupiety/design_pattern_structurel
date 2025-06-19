package org.example.particles.models;

public class ArcaneGlow extends IParticuleFlyweight implements IParticlePrototype {

    public ArcaneGlow(int x, int y, float speed, float spread, float lifetime, ParticleType particleType) {
        super(x,y,speed, spread,lifetime,particleType);
    }

    @Override
    public void setParticleType(ParticleType type) {
        this.particleType = type;
    }

    @Override
    public IParticlePrototype clone() {
        System.out.println("Particule ArcaneGlow");
        return new ArcaneGlow(this.x, this.y, this.speed, this.spread, this.lifetime, this.particleType);
    }

}
