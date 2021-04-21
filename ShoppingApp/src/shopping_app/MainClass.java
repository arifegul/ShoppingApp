package shopping_app;


import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		JFrame frame = Factory.getFrame("iphone");
		frame.setVisible(true);
		
		JFrame frame1 = Factory.getFrame("iphonepro");
		frame1.setVisible(true);

	}

}