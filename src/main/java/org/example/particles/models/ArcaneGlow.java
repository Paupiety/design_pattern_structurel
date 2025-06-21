package org.example.particles.models;

public class ArcaneGlow extends AbstractParticle {

    public ArcaneGlow(ParticleType type) {
        super(type);
    }

    @Override
    public void render() {
        System.out.println("Rendering ArcaneGlow at (" + x + ", " + y + ") with texture: " + particleType.getTexture());
    }

    @Override
    public void update(float dt) {
        super.update(dt);
    }
}
