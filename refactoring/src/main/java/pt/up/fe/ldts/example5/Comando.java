package pt.up.fe.ldts.example5;

public abstract class Comando {

    Position position;

    public Comando(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract Position execute();
}
