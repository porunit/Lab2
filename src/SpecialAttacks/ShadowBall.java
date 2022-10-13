package SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST,80,100);
    }

    @Override
    protected String describe() {
        return "Использует Shadow Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE,-1);
    }
}
