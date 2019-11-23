import javax.swing.JOptionPane;

public class ARE_YOU_HAPPY {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Are you happy?");
		if(a.equals("yes")) {
			System.out.println("Keep doing whatever you're doing.");
		}
		else if(a.equals("no")) {
			String a2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if(a2.contentEquals("yes")){
					System.out.println("Change something");
		}
			else if(a2.equals("no")) {
				System.out.println("Keep doing whatever you're doing.");
			}
	}
	
}
}
