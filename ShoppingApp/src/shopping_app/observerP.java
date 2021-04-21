
package shopping_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class observerP {
 
    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new observerP().start();
            }
        });
    }
    private void start() {
        DatePanel d = new DatePanel();
        new ShoppingMessage(d);
    }
} 

class DatePanel implements Observer {
    private JLabel label;
    @Override 
    public void update(Observable o, Object data) {	
        label.setText((String) data); 
    }
    DatePanel() {

    
        Date date = new Date();
        JFrame frame = new JFrame("Date");
        frame.getRootPane().setBorder(
        BorderFactory.createEmptyBorder(20, 20, 20, 20));	
        
        label = new JLabel(date.toString());
        label.setFont(new Font("ShopButton", Font.BOLD, 20));	
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setBackground(new Color(255,102,51));
        label.setForeground(new Color(255,102,51));
        label.setBorder(BorderFactory.createEmptyBorder(3, 20, 0, 0));
        
    }
} 

class ShoppingMessage {

    ShoppingMessage(DatePanel dt) {
 	
        final MsgObservable observable = new MsgObservable();
        observable.addObserver(dt);
        // Display Dialog
        JFrame shp = new JFrame("Shopping");
       
        shp.setBackground(new Color(255,153,153));
        JButton button = new JButton("WELCOME");
        button.setFont(new Font("DateButton", Font.BOLD, 50 ) );
        button.setBackground(new Color(255,102,51));
        button.setForeground(Color.white);
        
        button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        String data = " Redirecting to Page ";
        observable.changeData(data);
        button.setBackground(new Color(255,0,102));
        
      
        MainMenu m = new MainMenu();
        m.setVisible(true);
        m.pack();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        }
        });		
        shp.add(button);
        shp.setSize(330, 150);
        shp.setLocation(800,590);
        shp.setVisible(true);
    }
} 
class MsgObservable extends Observable {
    MsgObservable() {	
        super();
    }
    void changeData(Object data) {
        setChanged(); 
        notifyObservers(data);
    }
} 