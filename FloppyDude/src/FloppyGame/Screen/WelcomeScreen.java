package FloppyGame.Screen;

import FloppyGame.Game;
import FloppyGame.GamePanel;
import FloppyGame.Resources;

import java.awt.*;

/**
 * Created by cerebro on 05/07/18.
 */
public class WelcomeScreen extends Screen {

    private int playerXCord = 400;
    private int playerXVel = 5;

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.drawImage(Resources.getJumpImage(), this.playerXCord, 200, null);
        g.setColor(Color.green);
        g.drawString("Press any key to start the game", 200, 400);
        super.draw(g);
    }

    @Override
    public void update() {
        super.update();

        this.playerXCord += this.playerXVel;

        if(this.playerXCord >= Game.WIDTH - 72) {
            this.playerXCord = Game.WIDTH - 72;
            this.playerXVel = -5;
        }

        if(this.playerXCord <= 0) {
            this.playerXCord = 0;
            this.playerXVel = 5;
        }
    }

    @Override
    public void onKeyPress(int keyCode) {
        GamePanel.currentScreen = new Stage1Screen();
    }
}
