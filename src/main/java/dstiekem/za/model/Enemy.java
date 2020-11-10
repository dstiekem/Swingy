package java.model;

//aggregates the level. either +1 -1 or the same level.
//map is composed of enemy
//behaviour:
// generates itself randomly on the map
// wins or looses a fight
//drops an artefact.

//attributes:
// a level
// an artefact
public abstract class Enemy {
    Level l;
    Artefact a;
}