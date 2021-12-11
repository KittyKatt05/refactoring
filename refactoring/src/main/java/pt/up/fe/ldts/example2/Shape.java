package pt.up.fe.ldts.example2;

public abstract class Shape {
    enum TYPE {RECTANGLE, CIRCLE}

    private TYPE type;
    protected double x;
    protected double y;


    public Shape(double x, double y) {
        this.type = TYPE.RECTANGLE;
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw(GraphicFramework graphics);

}
