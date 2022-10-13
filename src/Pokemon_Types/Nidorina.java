package Pokemon_Types;

import SpecialAttacks.IceBeam;
import SpecialAttacks.SludgeBomb;
import StatusAttacks.Flatter;
import ru.ifmo.se.pokemon.Type;

public class Nidorina extends NidoranF{
    public Nidorina(String var1, int var2) {
        super(var1, var2);
        this.setStats(70,62,67,55,55,56);
        this.setType(Type.POISON);
        this.setMove(new SludgeBomb(), new IceBeam(), new Flatter());
    }
}
