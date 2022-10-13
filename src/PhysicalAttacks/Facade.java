package PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if(pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.PARALYZE
                || pokemon.getCondition() == Status.POISON ){
            this.power = 140;
        }
    }
}
