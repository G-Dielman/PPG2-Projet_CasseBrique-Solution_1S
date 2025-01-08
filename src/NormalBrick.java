import javafx.scene.paint.Color;

public class NormalBrick extends Brick {


    private static Color DEFAUT_COLOR = Color.GREENYELLOW;

    public NormalBrick(double x, double y, double with, double height) {

        super(x, y, with, height,  DEFAUT_COLOR);
        setPoints(10);
    }

    @Override
    public void onCollisionWith(Ball ball){
        super.onCollisionWith(ball);
        this.breakThis();
        this.shape.setVisible(false);
    }


}
