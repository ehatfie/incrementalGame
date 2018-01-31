import java.awt.*;
import java.io.IOException;

public class Model {

    private Player player;

    Model()throws IOException {}

    public void update(Graphics g){
        player = new Player();
    }
}
