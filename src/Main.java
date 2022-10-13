import Pokemon_Types.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        NidoranF p1 = new NidoranF("Водосвин", 1);
        Nidorina p2 = new Nidorina("Dasha", 1);
        Nidoqueen p3 = new Nidoqueen("Bebra",1);
        Yungoos p4 = new Yungoos("Bober",1);
        Gumshoos p5 = new Gumshoos("Osel",1);
        Magearna p6 = new Magearna("Babochka",1);

        b.addFoe(p3);
        b.addFoe(p2);
        b.addFoe(p1);

        b.addAlly(p4);
        b.addAlly(p5);
        b.addAlly(p6);
        b.go();
    }
}

