package org.example.Builder;

import java.awt.Color;

public interface IExplosionBuilder {
    IExplosionBuilder withPosition(int x, int y);
    IExplosionBuilder withColor(Color c);
    IExplosionBuilder withCount(int n);
    IExplosionBuilder withSpread(float s);
    IExplosionBuilder withLifetime(float f);
    ExplosionConfig build();
}