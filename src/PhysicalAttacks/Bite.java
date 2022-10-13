package PhysicalAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bite extends PhysicalMove {
    public Bite(){
        super(Type.DARK, 60,100);
    }

    @Override
    protected String describe() {
        return "Использует Bite";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        new Effect().chance(0.3).flinch(pokemon);
    }
}
