package Pokemon_Types;

import PhysicalAttacks.Bulldoze;
import PhysicalAttacks.NightSlash;
import SpecialAttacks.MirrorShot;
import StatusAttacks.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Magearna extends Pokemon {
    public Magearna(String var1, int var2){
        super(var1,var2);
        this.setStats(80,95,115,130,115,60);
        this.setType(Type.STEEL,Type.FAIRY);
        this.setMove(new Bulldoze(), new DoubleTeam(),new MirrorShot(),new NightSlash());
    }
}
