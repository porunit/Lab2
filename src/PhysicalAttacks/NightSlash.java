package PhysicalAttacks;
import org.jetbrains.annotations.NotNull;
import ru.ifmo.se.pokemon.*;

public class NightSlash extends PhysicalMove {
    public NightSlash(){
        super(Type.DARK,70,100);
    }

    @Override
    protected String describe() {
        return "Использует Night Slash";

    }

    @Override
    protected double calcCriticalHit(@NotNull Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getStat(Stat.SPEED) / 256.0 > Math.random()) {
            System.out.println(Messages.getBundle("critical"));
            return 2.0;
        } else {
            return 1.0;
        }
    }
}
