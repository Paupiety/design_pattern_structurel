package org.example.Factory_Method;

import org.example.particles.models.IParticlePrototype;

import java.util.Collections;
import java.util.List;

public class Explosion {
    private final List<IParticlePrototype> particles;
    private float lifetime;

    public Explosion(List<IParticlePrototype> particles, float lifetime) {
        this.particles = Collections.unmodifiableList(particles);
        this.lifetime = lifetime;
    }

    public void update(float dt) {
        this.lifetime -= dt;
        for (IParticlePrototype p : particles) {
            p.update(dt);
        }
    }

    public void render() {
        for (IParticlePrototype p : particles) {
            p.render();
        }
    }

    public boolean isAlive() {
        return lifetime > 0;
    }

    public List<IParticlePrototype> getParticles() {
        return particles;
    }

    public float getLifetime() {
        return lifetime;
    }
}
