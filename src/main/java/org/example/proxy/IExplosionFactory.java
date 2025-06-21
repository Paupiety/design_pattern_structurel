package org.example.proxy;

import org.example.Builder.ExplosionConfig;
import org.example.Factory_Method.*;

public interface IExplosionFactory {
    Explosion create(ExplosionConfig config);
}