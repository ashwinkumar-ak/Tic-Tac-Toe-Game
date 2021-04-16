package game;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Tic_Tac_Toe implements ActionListener {

	JFrame jf;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
	int count=0;
	String str="";
	boolean b=false;
	Tic_Tac_Toe(){
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.setLayout(new GridLayout(3,3));
		
		jb1=new JButton();
		jb1.addActionListener(this);
		jf.add(jb1);
		
		jb2=new JButton();
		jb2.addActionListener(this);
		jf.add(jb2);
		
		jb3=new JButton();
		jb3.addActionListener(this);
		jf.add(jb3);
		
		jb4=new JButton();
		jb4.addActionListener(this);
		jf.add(jb4);
		
		jb5=new JButton();
		jb5.addActionListener(this);
		jf.add(jb5);
		
		jb6=new JButton();
		jb6.addActionListener(this);
		jf.add(jb6);
		
		jb7=new JButton();
		jb7.addActionListener(this);
		jf.add(jb7);
		
		jb8=new JButton();
		jb8.addActionListener(this);
		jf.add(jb8);
		
		jb9=new JButton();
		jb9.addActionListener(this);
		jf.add(jb9);
		
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tic_Tac_Toe();
	}
	
	@Override
	public  void actionPerformed(ActionEvent e) {
		count=count+1;
		if (count%2==0) {
			str="X";
		}
		else {
			str="O";
		}
		if (e.getSource()==jb1) {
			jb1.setText(str);
			jb1.setFont(new Font("Arial", 1, 30));
			jb1.setEnabled(false);
		}
		if (e.getSource()==jb2) {
			jb2.setText(str);
			jb2.setFont(new Font("Arial", 1, 30));
			jb2.setEnabled(false);
		}
		if (e.getSource()==jb3) {
			jb3.setText(str);
			jb3.setFont(new Font("Arial", 1, 30));
			jb3.setEnabled(false);
		}
		if (e.getSource()==jb4) {
			jb4.setText(str);
			jb4.setFont(new Font("Arial", 1, 30));
			jb4.setEnabled(false);
		}
		if (e.getSource()==jb5) {
			jb5.setText(str);
			jb5.setFont(new Font("Arial", 1, 30));
			jb5.setEnabled(false);
		}
		if (e.getSource()==jb6) {
			jb6.setText(str);
			jb6.setFont(new Font("Arial", 1, 30));
			jb6.setEnabled(false);
		}
		if (e.getSource()==jb7) {
			jb7.setText(str);
			jb7.setFont(new Font("Arial", 1, 30));
			jb7.setEnabled(false);
		}
		if (e.getSource()==jb8) {
			jb8.setText(str);
			jb8.setFont(new Font("Arial", 1, 30));
			jb8.setEnabled(false);
		}
		if (e.getSource()==jb9) {
			jb9.setText(str);
			jb9.setFont(new Font("Arial", 1, 30));
			jb9.setEnabled(false);
		}
		
		winningpossibilties();
		whoWins();
	}
	void winningpossibilties() {
		if(jb1.getText()==jb2.getText()&&jb2.getText()==jb3.getText()&&jb1.getText()!="") {
			b=true;
		}
		else if(jb4.getText()==jb5.getText()&&jb5.getText()==jb6.getText()&&jb4.getText()!="") {
			b=true;
		}
		else if(jb7.getText()==jb8.getText()&&jb8.getText()==jb9.getText()&&jb7.getText()!="") {
			b=true;
		}
		else if(jb1.getText()==jb4.getText()&&jb4.getText()==jb7.getText()&&jb1.getText()!="") {
			b=true;
		}
		else if(jb2.getText()==jb5.getText()&&jb5.getText()==jb8.getText()&&jb2.getText()!="") {
			b=true;
		}
		else if(jb3.getText()==jb6.getText()&&jb6.getText()==jb9.getText()&&jb3.getText()!="") {
			b=true;
		}
		else if(jb1.getText()==jb5.getText()&&jb5.getText()==jb9.getText()&&jb1.getText()!="") {
			b=true;
		}
		else if(jb3.getText()==jb5.getText()&&jb5.getText()==jb7.getText()&&jb3.getText()!="") {
			b=true;
		}
		else {
			b=false;
		}
	
	}
	void whoWins() {
		if (b==true) {
			JOptionPane.showMessageDialog(jf, str+" wins");
		}
		else if(count==9){
			JOptionPane.showMessageDialog(jf, "game over");
			restartGame();
		}
	
	}
	void restartGame() {
		int i=JOptionPane.showConfirmDialog(jf, "Do you want to restart game?");
		if (i==0) {
			jb1.setEnabled(true);
			//jb1.s
			
			jb2.setEnabled(true);
			
			
			jb3.setEnabled(true);
			
			
			jb4.setEnabled(true);
			
			
			jb5.setEnabled(true);
			
			
			jb6.setEnabled(true);
			
			
			jb7.setEnabled(true);
			
			
			jb8.setEnabled(true);
		
		
			jb9.setEnabled(true);
		}
		else if(i==1) {
			System.exit(0);
		}
		else {
			jb1.setRolloverEnabled(false);
			jb2.setRolloverEnabled(false);
			jb3.setRolloverEnabled(false);
			jb4.setRolloverEnabled(false);
			jb5.setRolloverEnabled(false);
			jb6.setRolloverEnabled(false);
			jb7.setRolloverEnabled(false);
			jb8.setRolloverEnabled(false);
			jb9.setRolloverEnabled(false);
		}
	}
}

