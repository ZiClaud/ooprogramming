package org.nbicocchi.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseDrag extends JFrame {

    public MouseDrag() {
        setTitle(getClass().getName());
        setContentPane(new DrawPanel());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseDrag::new);
    }

    private static class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {
        int startX, startY, endX, endY;
        private Color color = Color.RED;

        public DrawPanel() {
            super();
            addMouseListener(this);
            addMouseMotionListener(this);
            requestFocus();
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent evt) {
            startX = evt.getX();
            startY = evt.getY();
        }

        @Override
        public void mouseReleased(MouseEvent evt) {
            color = Color.GREEN;
            endX = evt.getX();
            endY = evt.getY();
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent evt) {
            color = Color.RED;
            endX = evt.getX();
            endY = evt.getY();
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g); // draw background
            g.setColor(color);
            if (endX > startX && endY > startY) {
                g.drawRect(startX, startY, endX - startX + 1, endY - startY + 1);
            }
        }
    }
}