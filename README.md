🚀 Ajouts & Bonus au Projet
En complément des exigences initiales (Builder, Factory, Prototype, Flyweight, Proxy, Decorator), plusieurs ajouts fonctionnels ont été intégrés pour améliorer la qualité, la modularité et l'expérience développeur.

🧱 1. Classe Abstraite AbstractParticle

✅ But : Éviter la duplication de code commun aux particules (x, y, speed, lifetime, etc.)

✅ Bénéfice : Factorisation, clarté, maintenabilité, et facilitation de l’ajout de nouveaux types de particules.

🎨 2. Décorateurs dynamiques via chaînes (String)

✅ But : Appliquer des effets visuels (glow, shadow, fade) sans instancier manuellement chaque décorateur.

✅ Implémentation : Système de Factory + mapping des décorateurs par nom.
(

    List<String> effets = List.of("glow", "shadow", "fade");
)
✅ Bénéfice : Configuration simple, extensibilité facile (par ex. via un fichier JSON ou une interface utilisateur).

🕹 3. Déplacement automatique des particules

✅ But : Simuler un comportement réaliste avec mouvement, pas uniquement une durée de vie.

✅ Ajout : Logique de déplacement en fonction d'une speed et d'une direction aléatoire.

✅ Bénéfice : Simulation fluide, sans effort côté client.

🧰 4. Façade ExplosionFacade

✅ But : Simplifier la création et configuration d’une explosion (Builder + Decorator + Factory).

✅ Fonction : Une seule interface centralisée permet de créer une explosion complète, décorée et prête à simuler.
(

    Explosion explosion = ExplosionFacade.createExplosion(
        100, 150, "ArcaneGlow", "a.png", 
        List.of("glow", "shadow", "fade"), 
        2, 30f, 10f
    );
)
✅ Bénéfice : Faible couplage, simplicité d’utilisation, excellent point d’entrée pour une API ou une interface utilisateur.

📌 Conclusion

Ces ajouts améliorent la cohérence du design, renforcent la réutilisabilité, et offrent une expérience développeur moderne, tout en respectant les principes SOLID et les bonnes pratiques en architecture logicielle.
