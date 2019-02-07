import java.util.*;
import javax.swing.*;
import java.awt.*;

class LoginFrame extends JFrame{
	Containerc;
	LoginFrame(){
		c= this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
	}
}
public class LoginForm{
	public static void main(String args[]){
		LoginFrame f= new LoginFrame();
		f.setVisible(true);
		f.setDefaultColseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(330, 160, 700, 400);
	}
}