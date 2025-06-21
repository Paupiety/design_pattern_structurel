package org.example.particles.models;

public class MysticFlare extends AbstractParticle {

    public MysticFlare(ParticleType type) {
        super(type);
    }

    @Override
    public void render() {
        System.out.println("MysticFlare rendering at (" + x + ", " + y + ") with texture: " + particleType.getTexture());
    }

    @Override
    public void update(float dt) {
        super.update(dt);
    }
}
