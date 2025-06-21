package org.example;

import org.example.Facade.ExplosionFacade;
import org.example.Factory_Method.Explosion;

import java.awt.Color;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ExplosionFacade facade = new ExplosionFacade();

        Explosion explosion = facade.createExplosion(
                "ArcaneGlow",
                "a.png",
                "defaultShader",
                "defaultPhysics",
                100, 150,
                Color.RED,
                3,
                5f,
                30f,
                List.of("glow", "shadow", "fadeout")  // via noms simples
        );

        float dt = 0.5f;
        float time = 0f;

        while (explosion.isAlive()) {
            System.out.println("\n--- Time: " + time + "s ---");
            explosion.update(dt);
            explosion.render();
            time += dt;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nExplosion ended.");
    }
}
