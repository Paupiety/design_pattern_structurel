package org.example.Decorateur;

import org.example.particles.models.IParticlePrototype;

public class FadeOutDecorator extends ParticleDecorator {

    public FadeOutDecorator(IParticlePrototype inner) {
        super(inner);
    }

    public void render() {
        super.render();
        System.out.println(" + FadeOut");
    }
}
