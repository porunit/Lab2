package SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected String describe(){
        return "Использует SludgeBomb";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        new Effect().chance(0.3).poison(pokemon);
    }

}

