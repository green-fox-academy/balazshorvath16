import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        graphics.setColor(Color.BLACK);

        int black = 0;
        int green = 0;
        for (int i = 0; i < 4; i++) {
            graphics.setColor(new Color(black, green, 0));
            int x1 = (int) (Math.random() * WIDTH - 5);
            int y1 = (int) (Math.random() * HEIGHT - 5);
            int x2 = (int) (Math.random() * WIDTH) - 5;
            int y2 = (int) (Math.random() * HEIGHT - 5);
            draRectangles(x1, y1, x2, y2, graphics);
            black += 200 / 4;
            green += 200 / 4;

        }

    }

    public static void draRectangles(int x1, int y1, int x2, int y2, Graphics graphics) {

        graphics.fillRect(x1, y1, x2, y2);




    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}