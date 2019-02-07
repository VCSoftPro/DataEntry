import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginFrame extends JFrame implements ActionListener{
	Container c;
	JLabel userlabel = new JLabel("User Name");
	JLabel passlabel = new JLabel("Password");
	
	JTextField user_tf = new JTextField();
	JPasswordField pass_tf = new JPasswordField();
	
	JButton login_btn = new JButton("Login");
	
	LoginFrame(){
		c= this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		Font f= new Font("Arial",Font.BOLD,20);
		setResizable(false);
		
		userlabel.setBounds(100,50,150,40);
		passlabel.setBounds(100,150,100,40);
		
		user_tf.setBounds(250,50, 200,40);
		pass_tf.setBounds(250,150, 200,40);
		
		login_btn.setBounds(350,200, 100,40);
		login_btn.setFont(f);
		login_btn.addActionListener(this);
		
		userlabel.setFont(f);
		passlabel.setFont(f);
		
		user_tf.setFont(f);
		pass_tf.setFont(f);
		
		
		c.add(userlabel);
		c.add(passlabel);
		c.add(user_tf);
		c.add(pass_tf);
		c.add(login_btn);
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == login_btn){
			c.setBackground(Color.GREEN);
			SingUpFrame sf = new SingUpFrame();
			sf.setVisible(true);
			this.dispose();
		}
	}
}

class SingUpFrame extends JFrame{
	Container c;
	SingUpFrame(){
		c = this.getContentPane();
		//c.setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("SingUpPage");
		setBounds(330, 160, 700, 400);
		ImageIcon icon = new ImageIcon("BadBack.jpg");
		setIconImage(icon.getImage());
	}
}

public class IndexClass{
	public static void main(String args[]){
		LoginFrame f= new LoginFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(330, 160, 700, 400);
		
		
		
		
	}
}