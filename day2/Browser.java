package week1.day2;

public class Browser {
	
	public void launchBrowser(String Browsername) {
		
		System.out.println("Browser name is " + Browsername);
	
	}

	public void loadURL() {
		System.out.println("URL loaded successfully");
	}


	public static void main(String[] args) {
		
		Browser lb = new Browser();
	    lb.launchBrowser("Chrome");
	    lb.loadURL();
	
	}
				
	}


