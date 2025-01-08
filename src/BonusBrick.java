import javafx.scene.paint.Color;

public class BonusBrick extends Brick{

    private static Color DEFAUT_COLOR = Color.YELLOW ;
    public BonusBrick(double x, double y, double width, double height) {
        super(x, y, width, height, DEFAUT_COLOR);
        setPoints(100);
    }

    @Override
    public void onCollisionWith(Ball ball){
        super.onCollisionWith(ball);
        this.breakThis();
        ball.setVx(ball.getVx() * 1.2 );
        ball.setVy(ball.getVy() * 1.2 );
    }
}
