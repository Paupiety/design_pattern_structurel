package org.example.Decorateur;

import org.example.particles.models.IParticlePrototype;
import org.example.particles.models.ParticleType;

public abstract class ParticleDecorator implements IParticlePrototype {
    protected final IParticlePrototype inner;

    public ParticleDecorator(IParticlePrototype inner) {
        this.inner = inner;
    }

    @Override
    public void update(float dt) {
        inner.update(dt);
    }

    @Override
    public void render() {
        inner.render();
    }

    @Override
    public IParticlePrototype clone() {
        return inner.clone();
    }

    @Override
    public void setRandomizedPosition(int x, int y, float spread) {
        inner.setRandomizedPosition(x, y, spread);
    }

    @Override
    public void setParticleType(ParticleType particleType) {
        inner.setParticleType(particleType);
    }

}
