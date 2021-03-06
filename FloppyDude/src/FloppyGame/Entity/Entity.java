package FloppyGame.Entity;

import java.awt.*;

public class Entity {
    public int x;
    public int y;
    public int xVel = 0;
    public int yVel = 0;
    public int xAcc = 0;
    public int yAcc = 0;
    public int width;
    public int height;
    public Image image;
    public boolean visible = true;

    public Entity(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void update() {
        this.x += this.xVel;
        this.y += this.yVel;
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
    }

    public boolean isCollidingWith(Entity other) {
        if (!visible || !other.visible) {
            return false;
        }

        boolean xOverlap = (x > other.x && x < other.x + other.width)
                || (other.x > x && other.x < x + width);

        boolean yOverlap = (y > other.y && y < other.y + other.height)
                || (other.y > y && other.y < y + height);

        return xOverlap && yOverlap;
    }
}
