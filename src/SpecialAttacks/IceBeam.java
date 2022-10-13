package SpecialAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE,90,100);
    }

    @Override
    protected String describe(){
        return "Использует Ice Beam";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        new Effect().chance(0.1).freeze(pokemon);
    }
}
