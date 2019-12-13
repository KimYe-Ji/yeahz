package tlz;
import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		
		BreadPlate bread = new BreadPlate();
		BreadMaker maker = new BreadMaker(bread);
		
		String main_options[] = {"»§¸Ô±â", "»§ÀÌ ´Ù ¶³¾îÁ³À¸¸é ´©¸£¼¼¿ä"};
		int choice = 0;
		
		maker.start();
		
		do {
			choice = JOptionPane.showOptionDialog(null, "bakery", "bakery",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, main_options, null);
			if(choice == 0) { //¸¸µå´Â °÷¿¡ ÀÖ´Â »§À» ¸Ô¾îÁà¾ß ÇÑ´Ù.
				maker.getBread().eatBread();
			}
			else break;
			}
			while(true);
		
	}

}
