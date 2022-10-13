package Pokemon_Types;

import PhysicalAttacks.Bite;
import PhysicalAttacks.Bulldoze;
import PhysicalAttacks.Facade;
import StatusAttacks.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Gumshoos extends Yungoos{
    public Gumshoos(String var1, int var2){
        super(var1,var2);
        this.setStats(88,110,60,55,60,45);
        this.setType(Type.NORMAL);
        this.setMove(new Bite(),new DoubleTeam(), new Facade(), new Bulldoze());
    }
}
