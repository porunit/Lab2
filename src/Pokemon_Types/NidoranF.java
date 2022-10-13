package Pokemon_Types;

import SpecialAttacks.IceBeam;
import SpecialAttacks.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranF extends Pokemon {
    public NidoranF(String var1, int var2) {
        super(var1, var2);
        this.setStats(55, 47, 52, 40, 40, 41);
        this.setType(Type.POISON);
        this.setMove(new SludgeBomb(), new IceBeam());
    }
}
