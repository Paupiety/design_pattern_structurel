package org.example.Builder;

import java.awt.Color;

public class ExplosionBuilder implements IExplosionBuilder {
    private final ExplosionConfig config = new ExplosionConfig();

    @Override
    public ExplosionBuilder withPosition(int x, int y) {
        config.x = x;
        config.y = y;
        return this;
    }

    @Override
    public ExplosionBuilder withColor(Color c) {
        config.color = c;
        return this;
    }

    @Override
    public ExplosionBuilder withCount(int n) {
        config.count = n;
        return this;
    }

    @Override
    public ExplosionBuilder withSpread(float s) {
        config.spread = s;
        return this;
    }

    @Override
    public ExplosionBuilder withLifetime(float t) {
        config.lifetime = t;
        return this;
    }

    @Override
public ExplosionConfig build() {
    return config;
}
}