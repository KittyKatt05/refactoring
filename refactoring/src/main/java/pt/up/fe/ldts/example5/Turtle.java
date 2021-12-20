package pt.up.fe.ldts.example5;

import com.sun.javafx.scene.traversal.Direction;

public class Turtle {
    Position pos;


    public Turtle(int row, int column, char direction) {
        this.pos = new Position(row, column, direction);

    }

    public int getRow() {
        return pos.getRow();
    }

    public int getColumn() {
        return pos.getColumn();
    }

    public char getDirection() {
        return pos.getDirection();
    }

    public void setRow(int row) {
        pos.setRow(row);
    }

    public void setColumn(int column) {
        pos.setColumn(column);
    }

    public void setDirection(char direction) {
        pos.setDirection(direction);
    }

    public void setPosition(Position p) {
        this.pos = p;
    }

    public void execute(char command) {
        if (command == 'L') {
            setPosition(new Left(pos).execute());
        } else if (command == 'R') {
            setPosition(new Right(pos).execute());
        } else if (command == 'F'){
            setPosition(new Forward(pos).execute());
        }
    }
}
