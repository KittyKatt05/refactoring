package pt.up.fe.ldts.example5;

public class Left extends Comando{

    public Left(Position pos) {
        super(pos);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') {
            getPosition().setDirection('W');
        } else if (getPosition().getDirection() == 'W'){
            getPosition().setDirection('S');
        } else if (getPosition().getDirection() == 'S') {
            getPosition().setDirection('E');
        } else if (getPosition().getDirection() == 'E') {
            getPosition().setDirection('N');
        }

        return getPosition();
    }
}
