package shopping_app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class iphone implements Brand{
	@Override
	public void displayName() {
		System.out.println("iphone");
	}

	@Override
	public JFrame createWindow() {
            
            JFrame frame = new JFrame();
            JButton button = new JButton("iPhone 11");
            button.setFont(new Font("TimesNewRoman", Font.BOLD, 50 ) );
            button.setBackground(new Color(255,102,51));
            button.setForeground(Color.WHITE);
           
            button.addActionListener (new ActionListener(){
                
            public void actionPerformed(ActionEvent e) {

                iphone11 i = new iphone11();
                i.setVisible(true);
                i.pack();
                i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.dispose();
       
            }
        
            });	
            
             frame.getContentPane().add(button);
             frame.add(button);
             frame.setSize(330, 150);
             frame.setLocation(600,470);
             frame.setVisible(true);
             return frame;
               
        }
   
}
                
               
                
		