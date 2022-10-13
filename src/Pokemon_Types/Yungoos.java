package Pokemon_Types;

import PhysicalAttacks.Bite;
import PhysicalAttacks.Facade;
import StatusAttacks.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Yungoos extends Pokemon {
    public Yungoos(String var1,int var2){
        super(var1,var2);
        this.setStats(48,70,30,30,30,45);
        this.setType(Type.NORMAL);
        this.setMove(new Bite(), new DoubleTeam(), new Facade());
    }
}
