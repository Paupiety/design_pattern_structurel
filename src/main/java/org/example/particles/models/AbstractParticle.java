package org.example.particles.models;

import java.util.Random;

public abstract class AbstractParticle implements IParticlePrototype, Cloneable {
    protected ParticleType particleType;

    protected float x, y, velocityX, velocityY;
    protected float speed;
    protected float spread;
    protected float lifetime;

    protected static final Random random = new Random();

    public AbstractParticle(ParticleType type) {
        this.particleType = type;
        this.speed = 1.0f;
        this.spread = 0f;
        this.lifetime = 5.0f;
    }

    @Override
    public AbstractParticle clone() {
        try {
            return (AbstractParticle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported for " + this.getClass().getSimpleName(), e);
        }
    }

    @Override
    public void update(float dt) {
    this.x += velocityX * dt;
    this.y += velocityY * dt;
    this.lifetime -= dt;
    }

    @Override
    public void render() {
        System.out.println("Rendering particle at (" + x + ", " + y + ") with texture: " + particleType.getTexture());
    }

    @Override
    public void setParticleType(ParticleType type) {
        this.particleType = type;
    }

    @Override
    public void setRandomizedPosition(int baseX, int baseY, float spread) {
        this.x = baseX + (int)((random.nextFloat() - 0.5f) * 2 * spread);
        this.y = baseY + (int)((random.nextFloat() - 0.5f) * 2 * spread);

        // Calculer une direction aléatoire (angle en radians)
        double angle = random.nextDouble() * 2 * Math.PI;

        // Calculer vitesse X et Y selon l'angle et la vitesse (speed)
        this.velocityX = (float)(speed * Math.cos(angle));
        this.velocityY = (float)(speed * Math.sin(angle));
    }
}
