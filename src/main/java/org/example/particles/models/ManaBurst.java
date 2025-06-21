package org.example.particles.models;

public class ManaBurst extends AbstractParticle {

    public ManaBurst(ParticleType type) {
        super(type);
    }

    @Override
    public void render() {
        System.out.println("ManaBurst rendering at (" + x + ", " + y + ") with texture: " + particleType.getTexture());
    }

    @Override
    public void update(float dt) {
        super.update(dt);
    }
}
