package PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND,60,100);
    }

    @Override
    protected String describe() {
        return "Использует Bulldoze";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        new Effect().stat(Stat.SPEED,-1);
    }
}
