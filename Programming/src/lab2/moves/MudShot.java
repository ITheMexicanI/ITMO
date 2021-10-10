package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class MudShot extends SpecialMove {
    public MudShot() {
        super(Type.GROUND, 55, 95);
    }

    @Override
    protected String describe() {
        return "������� ���� ������ � ������� �������� ����";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -1);
    }
}
