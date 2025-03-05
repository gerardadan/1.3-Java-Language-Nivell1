# 📄 Descripció - Enunciat de l'exercici

En aquesta redacció de notícies esportives, les notícies estan classificades per esports: futbol, bàsquet, tenis, F1 i motociclisme.

La redacció compta amb diversos redactors, dels quals es vol conèixer:
- `nom`
- `DNI` (atribut `final`, ja que no pot canviar mai)
- `sou` (atribut `static`, perquè tots els redactors tenen el mateix sou, inicialment de 1500€ i susceptible de canvis generals)

Cada redactor pot treballar en múltiples notícies. Les notícies tenen els següents atributs:
- `titular`
- `text` (buit en el moment de la creació)
- `puntuació`
- `preu`

A més, segons l'esport, les notícies tenen característiques específiques:
- **Futbol**: competició, club i jugador.
- **Bàsquet**: competició i club.
- **Tenis**: competició i tenistes.
- **F1**: escuderia.
- **Motociclisme**: equip.

Per calcular el preu de cada notícia, s'ha d'implementar un mètode `calcularPreuNoticia()`.

---

# 💻 Tecnologies Utilitzades

- Java
- Programació Orientada a Objectes (POO)
- Herència i polimorfisme
- Atributs `static` i `final`

---

# 📋 Requisits

Per a executar aquest projecte, es requereix:

- JDK 8 o superior
- Un entorn de desenvolupament com IntelliJ IDEA, Eclipse o VS Code amb extensió per a Java
- Coneixements bàsics de Java i POO


