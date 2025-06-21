package org.example.Decorateur;

import org.example.particles.models.IParticlePrototype;

public class GlowDecorator extends ParticleDecorator {
    public GlowDecorator(IParticlePrototype inner) {
        super(inner);
    }

    @Override
    public void render() {
        super.render();
        System.out.println(" + Glow effect");
    }
}
