package org.example.Decorateur;

import org.example.particles.models.IParticlePrototype;

public class ShadowDecorator extends ParticleDecorator {
    public ShadowDecorator(IParticlePrototype inner) {
        super(inner);
    }

    @Override
    public void render() {
        super.render();
        System.out.println(" + Shadow effect");
    }
}
