package shopping_app;

import javax.swing.JFrame;


public class Factory {
    
	public static JFrame getFrame(String operatingSystem)
	{
		Brand br = null;
		switch(operatingSystem.toLowerCase())
		{
			case "iphone":
				br = new iphone();
				break;
			case "iphonepro":
				br = new iphonepro();
				break;
                    
		}
                
		return br.createWindow();
	}
        
}