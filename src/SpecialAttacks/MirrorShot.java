package SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class MirrorShot extends SpecialMove {
    public MirrorShot(){
        super(Type.STEEL, 65,85);
    }

    @Override
    protected String describe() {
        return "Использует Mirror Shot";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        new Effect().chance(0.3).stat(Stat.ACCURACY,-1);
    }
}
