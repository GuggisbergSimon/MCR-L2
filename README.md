# MCR-L2

## Objectifs

- Pratiquer AWT/Swing.
- Mettre en oeuvre le modèle Singleton.
- Utiliser une abstraction.

## Donnée

Définir une application graphique qui permette d'instancier un nombre fixe de cercles et de carrés et de les faire se déplacer dans une fenêtre.

- Ces objets géométriques doivent être initialisés aléatoirement (taille, position, vecteur de déplacement).
- Si un objet rencontre un bord, il doit rebondir.

La classe représentant l'affichage doit mettre en oeuvre
un singleton et implémenter l'interface Displayer
donnée en ci-dessous.

```java
    public interface Displayer {
      int getWidth();
      int getHeight();
      Graphics2D getGraphics();
      void repaint();
      void setTitle(String title);
    }
```

Remarques:
- Cette application n’est que la première partie d’un laboratoire plus complet, aucun rendu n’est donc
demandé mais penser à produire un code évolutif.
- Veiller à soigner l'implémentation afin que le code produit soit le plus élégant possible selon les standards
de programmation POO.
- La classe Graphics2D est celle d’AWT.
- Pour gérer l’affichage, il peut être utile de passer par une Image obtenue depuis la méthode createImage
(de la classe JPanel), afin d’utiliser son Graphics2D obtenu depuis la méthode getGraphics (de la classe
Image). Ensuite les formes peuvent être dessinées sur cet objet Graphics2D, qui pourra être réaffiché sur le
JPanel au moyen des méthodes drawImage et fill (de la classe Graphics2D).