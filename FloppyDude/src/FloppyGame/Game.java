package FloppyGame;

import javax.swing.*;


public class Game {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 450;

    public static int score = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel g = new GamePanel();
        f.add(g);
        f.pack();
        f.setVisible(true);

    }
}
