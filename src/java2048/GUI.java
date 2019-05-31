/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2048;

/**
 *
 * @author huyph
 */
import java.awt.*;
import javax.swing.*;

public class GUI{
    int frameHeight = 394;
    int frameWidth = 328;
    int gameBoardSize = 296;
    int marginSize  =   16;
    Color backgroundColor = new Color(255, 225, 120);//light golden yellow color
    
    
    JFrame frame;
    
    public GUI(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GameBoard gb = new GameBoard();

        //North Panel
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout());
        northPanel.setPreferredSize(new Dimension(frameWidth, 82));
        
        JLabel gameLabel = new JLabel("1024", SwingConstants.CENTER);
        gameLabel.setFont(new Font("Serif", Font.BOLD, 20));
        northPanel.add(gameLabel);
        northPanel.add(new JLabel("<html>Score:<br>524</html>",SwingConstants.CENTER));
        northPanel.add(new JLabel("<html>High Score:<br>22600</html>", SwingConstants.CENTER));
        northPanel.setBackground(backgroundColor);

        //Other Panels
        JPanel westBuffer = new JPanel();
        westBuffer.setPreferredSize(new Dimension(marginSize, gameBoardSize));
        westBuffer.setBackground(backgroundColor);

        JPanel eastBuffer = new JPanel();
        eastBuffer.setPreferredSize(new Dimension(marginSize, gameBoardSize));
        eastBuffer.setBackground(backgroundColor);

        JPanel southBuffer = new JPanel();
        southBuffer.setPreferredSize(new Dimension(frameWidth, marginSize));
        southBuffer.setBackground(backgroundColor);

         //add panels to frame
         frame.getContentPane().add(northPanel, BorderLayout.NORTH);
         frame.getContentPane().add(westBuffer, BorderLayout.WEST);
         frame.getContentPane().add(eastBuffer, BorderLayout.EAST);
         frame.getContentPane().add(southBuffer, BorderLayout.SOUTH);
         frame.getContentPane().add(gb, BorderLayout.CENTER);

         frame.getContentPane().setPreferredSize(new Dimension(frameWidth, frameHeight));
         frame.pack();
         frame.setVisible(true);

         
    }

    class GameBoard extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            g.setColor(new Color(20, 20, 20));
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
    }
}
