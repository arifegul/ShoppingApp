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

public class iphonepro implements Brand{
	@Override
	public void displayName() {
		System.out.println("iphonepro");
	}

	@Override
	public JFrame createWindow() {
            
            JFrame frame1 = new JFrame();
            JButton button = new JButton("iPhone 11 Pro");
            button.setFont(new Font("TimesNewRoman", Font.BOLD, 50 ) );
            button.setBackground(new Color(255,102,51));
            button.setForeground(Color.WHITE);
           
            button.addActionListener (new ActionListener(){
                
            public void actionPerformed(ActionEvent e) {
     
                
                iphone11pro ip = new iphone11pro();
                ip.setVisible(true);
                ip.pack();
                ip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.dispose();
       
            }
        
            });	
            
             frame1.getContentPane().add(button);
             frame1.add(button);
             frame1.setSize(400, 150);
             frame1.setLocation(950,470);
             frame1.setVisible(true);
             return frame1;
               
        }
   
}
                
               
                
		             
                
		