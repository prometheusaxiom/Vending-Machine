package vending_machine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	@SuppressWarnings("serial")
	public class vending_sub1 extends JFrame implements ActionListener{
		
		//variables
		public double totalbill, change, price, fivecent, tencent, twentycent, fiftycent, hundredcent, fivecentfinal, tencentfinal, twentycentfinal,
		fiftycentfinal, hundredcentfinal, fivecentcounter, tencentcounter, twentycentcounter, fiftycentcounter,
		hundredcentcounter;

		//identifiers
		public JLabel header, twixl, cokel, waterl, sandwichl, moneyl;
		public JTextField fivecenttf, tencenttf, twentycenttf, fiftycenttf, hundredcenttf;
		public JTextArea txtarea;
		public JButton twixbtn, cokebtn, waterbtn, sandwichbtn, computebtn, exitbtn, clearbtn;
	
		public vending_sub1() {
			Container jframe = getContentPane();
			
			jframe.setLayout(null);
			jframe.add(header = new JLabel("VENDING MACHINE"));
			jframe.add(moneyl = new JLabel("ENTER MONEY HERE"));
			jframe.add(txtarea =new JTextArea());
			
			jframe.add(fivecenttf = new JTextField());
			jframe.add(tencenttf = new JTextField());
			jframe.add(twentycenttf = new JTextField());
			jframe.add(fiftycenttf = new JTextField());
			jframe.add(hundredcenttf = new JTextField());
			
			jframe.add(twixbtn = new JButton( "<html>TWIX <center>100¢</center></html>" ));
			jframe.add(cokebtn = new JButton( "<html>COKE <center>50¢</center></html>" ));
			jframe.add(waterbtn = new JButton( "<html>WATER <center>30¢</center></html>" ));
			jframe.add(sandwichbtn = new JButton( "<html>SANDWICH<br><center>150¢</center></html>" ));
			jframe.add(computebtn = new JButton("Enter"));
			jframe.add(clearbtn = new JButton("Clear"));
			jframe.add(exitbtn = new JButton("Exit"));
			
			twixbtn.setFont(new Font("Arial", Font.BOLD, 13));
			cokebtn.setFont(new Font("Arial", Font.BOLD, 13));
			waterbtn.setFont(new Font("Arial", Font.BOLD, 13));
			sandwichbtn.setFont(new Font("Arial", Font.BOLD, 13));
			
			twixbtn.addActionListener(this);
			cokebtn.addActionListener(this);
			waterbtn.addActionListener(this);
			sandwichbtn.addActionListener(this);
			computebtn.addActionListener(this);
			clearbtn.addActionListener(this);
			exitbtn.addActionListener(this);
			
			
			Color c1 = Color.GREEN;
			Color c2 = Color.DARK_GRAY;
			Font f = (new Font ( "Arial", Font.BOLD, 15));
			
			header.setFont(f);
			moneyl.setFont(f);
			
			jframe.setBackground(c2);
			header.setForeground(c1);
			moneyl.setForeground(c1);
			
			header.setSize(160, 80);
			header.setLocation(50, -10);
			
			moneyl.setSize(160, 80);
			moneyl.setLocation(260, 290);
			
			hundredcenttf.setSize(30, 40);
			hundredcenttf.setLocation(385, 345);
			
			fiftycenttf.setSize(30, 40);
			fiftycenttf.setLocation(355, 345);
			
			twentycenttf.setSize(30, 40);
			twentycenttf.setLocation(325, 345);
			
			tencenttf.setSize(30, 40);
			tencenttf.setLocation(295, 345);
			
			fivecenttf.setSize(30, 40);
			fivecenttf.setLocation(265, 345);
			

			txtarea.setSize(180, 280);
			txtarea.setLocation(250, 20);
			
			twixbtn.setSize(105, 80);
			twixbtn.setLocation(10, 50);
			
			cokebtn.setSize(105, 80);
			cokebtn.setLocation(120, 50);
			
			waterbtn.setSize(105, 80);
			waterbtn.setLocation(10, 135);
			
			sandwichbtn.setSize(105, 80);
			sandwichbtn.setLocation(120, 135);
			
			computebtn.setSize(90, 40);
			computebtn.setLocation(25, 240);
			
			clearbtn.setSize(90, 40);
			clearbtn.setLocation(120, 240);
			
			exitbtn.setSize(90, 40);
			exitbtn.setLocation(73, 290);
			
			txtarea.setEditable(false);
		}
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==twixbtn) 
			{
				price = 100;
				txtarea.setText("   You picked Twix! \n Please enter coins as follows:\n num of 5 cents coints, \n num of 10 cents coints, \n num of 20 cents coins, \n num of 50 cents coins, \n num of 100 cent coins"
						+ "\n\n Example: \n If you would like to enter ten\n cents coins:\n 0,2,0,0,0");
			}
			
			if(e.getSource()==cokebtn) {
				price = 50;
				txtarea.setText("   You picked Coke! \n Please enter coins as follows:\n num of 5 cents coints, \n num of 10 cents coints, \n num of 20 cents coins, \n num of 50 cents coins, \n num of 100 cent coins"
						+ "\n\n Example: \n If you would like to enter ten\n cents coins:\n 0,2,0,0,0");
			}
			
			if(e.getSource()==waterbtn) {
				price = 30;
				txtarea.setText("   You picked Water! \n Please enter coins as follows:\n num of 5 cents coints, \n num of 10 cents coints, \n num of 20 cents coins, \n num of 50 cents coins, \n num of 100 cent coins"
						+ "\n\n Example: \n If you would like to enter ten\n cents coins:\n 0,2,0,0,0");
			}
			
			if(e.getSource()==sandwichbtn) {
				price = 150;
				txtarea.setText("   You picked Sandwich! \n Please enter coins as follows:\n num of 5 cents coints, \n num of 10 cents coints, \n num of 20 cents coins, \n num of 50 cents coins, \n num of 100 cent coins"
						+ "\n\n Example: \n If you would like to enter ten\n cents coins:\n 0,2,0,0,0");
			}
			
			if(e.getSource()==computebtn) {
				txtarea.setText("");
				fivecent = Double.parseDouble(fivecenttf.getText());
				tencent = Double.parseDouble(tencenttf.getText());
				twentycent = Double.parseDouble(twentycenttf.getText());
				fiftycent = Double.parseDouble(fiftycenttf.getText());
				hundredcent = Double.parseDouble(hundredcenttf.getText());
				
				fivecentfinal = fivecent * 5;
				tencentfinal = tencent * 10;
				twentycentfinal = twentycent * 20;
				fiftycentfinal = fiftycent * 50;
				hundredcentfinal = hundredcent * 100;
				
				fivecentcounter = fivecent;
				tencentcounter = tencent;
				twentycentcounter = twentycent;
				fiftycentcounter = fiftycent;
				hundredcentcounter = hundredcent;
				
				totalbill = fivecentfinal + tencentfinal + twentycentfinal + fiftycentfinal + hundredcentfinal;
				
				change = totalbill - price;
				
				if(change < 0) {
					txtarea.setText(" Insufficient money inserted!");
				
				
				}
				else {
					txtarea.setText("\n Change is: "+change+" cents \n split as follows:"
					+ "\n 100 cents coins: "+hundredcentcounter+"\n 50 cents coins: "+fiftycentcounter+"\n 20 cents"
					+ " coins: "+twentycentcounter+"\n 10 cents coins: "+tencentcounter+"\n 5 cents coins: "
					+fivecentcounter);
				}
			}
			
			if(e.getSource()==clearbtn)
			{
				hundredcenttf.setText("");fiftycenttf.setText("");twentycenttf.setText("");
				tencenttf.setText("");fivecenttf.setText("");txtarea.setText("");
			}
			
			if(e.getSource()==exitbtn)
			{
				System.exit(0);
			}
			
		}

	}

	
	
	
