package pt.up.fe.ldts.example5;

public class Forward extends Comando{

    public Forward(Position pos) {
        super(pos);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') {
            getPosition().setRow(getPosition().getRow() - 1);
        }
        if (getPosition().getDirection() == 'S') {
            getPosition().setRow(getPosition().getRow() + 1);
        }
        if (getPosition().getDirection() == 'W') {
            getPosition().setColumn(getPosition().getColumn() - 1);
        }
        if (getPosition().getDirection() == 'E') {
            getPosition().setColumn(getPosition().getColumn() + 1);
        }
        return getPosition();
    }
}
