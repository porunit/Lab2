package StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Flatter extends StatusMove {
    public Flatter(){
        super(Type.DARK,0,100);
    }

    @Override
    protected String describe() {
        return "Использует Flatter";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        new Effect().stat(Stat.SPECIAL_ATTACK,-1).confuse(pokemon);
    }
}
