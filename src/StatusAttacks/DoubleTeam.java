package StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected String describe() {
        return "Использует DoubleTeam";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        new Effect().stat(Stat.EVASION,+1);
    }
}
