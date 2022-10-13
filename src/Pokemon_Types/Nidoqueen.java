package Pokemon_Types;

import SpecialAttacks.IceBeam;
import SpecialAttacks.ShadowBall;
import SpecialAttacks.SludgeBomb;
import StatusAttacks.Flatter;
import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Nidorina{
    public Nidoqueen(String var1, int var2) {
        super(var1, var2);
        this.setStats(90,92,87,75,85,76);
        this.setType(Type.POISON,Type.GROUND);
        this.setMove(new SludgeBomb(),new IceBeam(), new Flatter(), new ShadowBall());
    }
}
