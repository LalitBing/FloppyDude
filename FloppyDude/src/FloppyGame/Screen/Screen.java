package FloppyGame.Screen;

import FloppyGame.Entity.Entity;
import FloppyGame.Game;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

abstract public class Screen {

    protected List<Entity> entities = new ArrayList<>();

    public void update() {
        for (Entity e : entities) {
            e.update();
        }
    }

    public void draw(Graphics g) {
        for (Entity e : entities) {
            if (e.visible) {
                g.drawImage(e.image, e.x, e.y, null);
            }
        }

        g.setColor(Color.green);
        g.fillRect(10, Game.HEIGHT - 20, 50, 18);
        g.setColor(Color.red);
        g.drawString("FloppyGame", 20, Game.HEIGHT - 15);
    }

    public void onKeyPress(int keyCode) {

    }
}
