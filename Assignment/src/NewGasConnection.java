import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NewGasConnection implements ActionListener{
    
	 JFrame fr,fr1,fr2,f,fd;
	 JPanel p1,p2,p3;
	 JComboBox<String> box1,box2,box3;
	 JButton sb,login,submit;
	 JButton tback;
	 ImageIcon img1,img2,loginImage,nextImage,backImage,submitImage;
	 JLabel Fname,Mname,Lname,Ftitle,dob,fatherName,motherName,spouseName,relative,titleAddress,poa,poac,poad,demo;
	 JLabel house1,house2,floor,road,landmark,city,state,distric,distributer,pin,mobile,email;
	 JTextField tFname,tMname,tLname,tdob,tfatherName,tmotherName,tspouseName,tpoad,thouse1,thouse2,tfloor,troad,tlandmark,tcity,tdistric;
	 JTextField temail,tpin,tmobile, tstate1,tcardNumber;
	 JTextField tuser;
	 JPasswordField password;
	 String idProof[] = {"-Select-","Passport","Driving License","Aadhaar card","Voter Id","PAN Card"}; 
	 String states[] = {"-Select-","Anddhara Pardesh","Assam","Haryana"};
	 String distributers[] = {"-Select-","A","B","C","D"};
	 
	 void parsonalDetail()
	 {
		  
		 			fr = new JFrame("New Gas Conncetion");
		 			box1 = new JComboBox<String>(idProof);   			//Creating JCombobox
		 			box2 = new JComboBox<String>(states);
		 			box3 = new JComboBox<String>(distributers);

		 			p1 = new JPanel();
		 			p2 = new JPanel();
		 			p3 = new JPanel();
		 
		 			Ftitle = new JLabel("Request For New Connection");
		 
		 			Fname = new JLabel("First Name");
		 			Mname = new JLabel("Middel Name");
		 			Lname = new JLabel("Last Name");
		 			dob = new JLabel("Date Of Birth");
		 			relative = new JLabel("close Relative");
		 			fatherName = new JLabel("Father's Name");
		 			spouseName = new JLabel("Or Spouse's Name");
		 			motherName = new JLabel("Mother's Name");

		 			demo = new JLabel("demo");
		 
		 			titleAddress = new JLabel("Address for LPG connection / Contact Information");
		 			poa = new JLabel("Proof Of Address(POA)");
		 			poac= new JLabel("POA Category");
		 			poad= new JLabel("POA Detail");
		 			house1 = new JLabel("House / Flat #");
		 			floor = new JLabel("Floor");
		 			house2 = new JLabel("Complex/Building");
		 			road = new JLabel("Street/Road");
		 			landmark = new JLabel("Land Mark");
		 			city = new JLabel("City/Town/Village");
		 			state = new JLabel("State");
		 			distric = new JLabel("Distric");
		 			distributer = new JLabel("Distributer");
		 			mobile = new JLabel("Mobile No.");
		 			pin = new JLabel("Pin Code");
		 			email = new JLabel("Email ID");
		 
		 			tFname = new JTextField();
		 			tMname = new JTextField();
		 			tLname = new JTextField();
		 			tdob = new JTextField();
		 			tfatherName = new JTextField();
		 			tspouseName = new JTextField();
		 			tmotherName = new JTextField();
		 			tpoad= new JTextField();
		 			thouse1 =new JTextField();
		 			tfloor =new JTextField();
		 			thouse2 =new JTextField();
		 			troad =new JTextField();
		 			tlandmark =new JTextField();
		 			tcity =new JTextField();
		 			tdistric =new JTextField();
		 			tpin = new JTextField();
		 			tmobile = new JTextField();
		 			temail = new JTextField();
		 
		 			nextImage = new ImageIcon(NewGasConnection.class.getResource("/next1.png")); 	//Creating image on button
		 			sb = new JButton(nextImage);
		 
		 
		 			p1.add(Ftitle);
		 			p2.add(Fname);
		 			p2.add(Mname);
		 			p2.add(Lname);
		 			p2.add(tFname);
		 			p2.add(tMname);
		 			p2.add(tLname);
		 			p2.add(dob);
		 			p2.add(tdob);
		 			p2.add(relative);
		 			p2.add(fatherName);
		 			p2.add(tfatherName);
		 			p2.add(spouseName);
		 			p2.add(tspouseName);
		 			p2.add(motherName);
		 			p2.add(tmotherName);
		 
		 			p3.add(titleAddress);
		 			p3.add(poa);
		 			p3.add(house1);
		 			p3.add(thouse1);
		 			p3.add(floor);
		 			p3.add(tfloor);
		 			p3.add(house2);
		 			p3.add(thouse2);
		 			p3.add(road);
		 			p3.add(troad);
		 			p3.add(landmark);
		 			p3.add(tlandmark);
		 			p3.add(city);
		 			p3.add(tcity);
		 			p3.add(state);
		 			p3.add(box2);
		 			p3.add(distric);
		 			p3.add(tdistric);
		 			p3.add(distributer);
		 			p3.add(box3);
		 			p3.add(pin);
		 			p3.add(mobile);
		 			p3.add(email);
		 			p3.add(tpin);
		 			p3.add(tmobile);
		 			p3.add(temail);
		 
		 			p3.add(sb);
		 
		 			Ftitle.setBounds(480, 0, 800, 50);
		 			titleAddress.setForeground(Color.RED);					//Set color on Texts
		 			poa.setForeground(Color.BLUE);
		 			relative.setForeground(Color.BLUE);
		 			Ftitle.setForeground(Color.GRAY);
		 			Ftitle.setFont(new Font("Dialog",Font.BOLD,22));
		 			titleAddress.setFont(new Font("Dialog",Font.BOLD,18));
		 			poa.setFont(new Font("Dialog",Font.BOLD,16));
		 			relative.setFont(new Font("Dialog",Font.BOLD,18));

		 
		 			Fname.setBounds(70, 100, 100, 30);
		 			tFname.setBounds(200, 100, 150, 30);
		 			Mname.setBounds(450, 100, 100, 30);
		 			tMname.setBounds(600, 100, 150, 30);
		 			Lname.setBounds(850, 100, 100, 30);
		 			tLname.setBounds(1000, 100, 150, 30);
		 			dob.setBounds(70, 150, 100, 30);
		 			tdob.setBounds(200, 150, 150, 30);
		 
		 			relative.setBounds(570, 200, 300, 30);
		 
		 			fatherName.setBounds(70,250,110,30);
		 			tfatherName.setBounds(200,250,150,30);
		 			spouseName.setBounds(450,250,140,30);
		 			tspouseName.setBounds(600,250,150,30);
		 			motherName.setBounds(850,250,110,30);
		 			tmotherName.setBounds(1000,250,150,30);
		 
		 			titleAddress.setBounds(20,300,700,30);
		 			poa.setBounds(550,370,400,30);
		 
		 
		 			house1.setBounds(70,440,130,30);
		 			thouse1.setBounds(200,440,150,30);
		 			floor.setBounds(520,440,130,30);
		 			tfloor.setBounds(600,440,150,30);
		 			house2.setBounds(850,440,130,30);
		 			thouse2.setBounds(1000,440,150,30);
		 			road.setBounds(70,490,110,30);
		 			troad.setBounds(200,490,150,30);
		 			landmark.setBounds(490,490,140,30);
		 			tlandmark.setBounds(600,490,150,30);
		 			city.setBounds(850,490,130,30);
		 			tcity.setBounds(1000,490,150,30);
		 			state.setBounds(70,540,110,30);
		 			box2.setBounds(200,540,150,30);
		 			distric.setBounds(520,540,140,30);
		 			tdistric.setBounds(600,540,150,30);
		 			distributer.setBounds(850,540,130,30);
		 			box3.setBounds(1000,540,150,30);
		 			pin.setBounds(70,590,130,30);
		 			tpin.setBounds(200,590,150,30);
		 			mobile.setBounds(500,590,130,30);
		 			tmobile.setBounds(600,590,150,30);
		 			email.setBounds(850,590,130,30);
		 			temail.setBounds(1000,590,150,30);
		 
		 			demo.setBounds(500, 500, 100, 50);
		 			sb.setBounds(1100,650, 100, 35);
		 
		 			fr.add(p1);                            //Creating Panels 
		 			fr.add(p2);
		 			fr.add(p3);
		 
		 			p1.setBackground(new Color(13,77,0));
		 			p2.setBackground(new Color(210,205,208));
		 			p3.setBackground(new Color(210,205,208));
		 			p1.setBounds(0, 0, 1300, 60);
		 			p2.setBounds(0, 0, 1300, 300);
		 			p3.setBounds(0, 0, 1300, 800);
	     
		 			sb.addActionListener(this);     //ActionListener for next Frame 
		 
		 			p1.setLayout(null);
		 			p2.setLayout(null);
		 			p3.setLayout(null);
		 			fr.setSize(1300, 1200);
		 			fr.setLayout(null);
		 			fr.setVisible(true);
	 }
	 
	 
	 void relativeDetail()
	 {
		 fr1 = new JFrame("Identity Proof Box");
		 JLabel poi,rashanCard,state1,state2,cardNumber;
		 
		 backImage = new ImageIcon(NewGasConnection.class.getResource("/back1.png"));      //Creating image on button
		 tback = new JButton(backImage);
		 
		 submitImage = new ImageIcon(NewGasConnection.class.getResource("/submit.png"));    //Creating image on button
		 submit = new JButton(submitImage);
		 
		 poi = new JLabel("Proof of Identity ( POI )");
		 poac= new JLabel("POA Category:");
		 poad= new JLabel("Card Number:");
		 rashanCard = new JLabel("Ration Card Details if Available:");
		 state1 = new JLabel("State Of Issue for");
		 state2 = new JLabel("Ration Card: ");
		 cardNumber = new JLabel("Ration Card Number: ");
		 
		 tpoad= new JTextField();
		 box1 = new JComboBox<String>(idProof);
		 tstate1 = new JTextField();
		 tcardNumber= new JTextField();
		 
		 fr1.add(poi);
		 fr1.add(poac);
		 fr1.add(poad);
		 fr1.add(tpoad);
		 fr1.add(box1);
		 fr1.add(rashanCard);
		 fr1.add(state1);
		 fr1.add(state2);
		 fr1.add(tstate1);
		 fr1.add(cardNumber);
		 fr1.add(tcardNumber);
		 fr1.add(tback);
		 fr1.add(submit);
		 
		 poi.setForeground(Color.BLUE);
		 poi.setFont(new Font("Dialog",Font.BOLD,18));
		 rashanCard.setForeground(Color.BLUE);
		 rashanCard.setFont(new Font("Dialog",Font.BOLD,18));
		 
		 poi.setBounds(300,20,300,30);
		 poac.setBounds(70,80,110,30);
		 box1.setBounds(200,80,150,30);
		 poad.setBounds(440,80,110,30);
		 tpoad.setBounds(550,80,150,30);
		 rashanCard.setBounds(250,170,400,30);
		 state1.setBounds(70, 220, 150, 30);
		 state2.setBounds(70, 240, 150, 30);
		 tstate1.setBounds(200, 230, 150, 30);
		 cardNumber.setBounds(400,230,160,30);
		 tcardNumber.setBounds(550,230,150,30);   //Ration Card  detail
		 tback.setBounds(100, 300, 90, 35);
		 submit.setBounds(600, 300, 90, 35);
		 
		 submit.addActionListener(this);
		 
		 tback.addActionListener(this);
		 fr1.setBounds(200, 150, 800, 400);
		 fr1.getContentPane().setBackground(new Color(210,205,208));               //Set BackGround Color using RGB
		 fr1.setLayout(null);
		 fr1.setVisible(true);
	 }
	 
	 void loginBox()
	 {
		 fr2 = new JFrame("Login box");
		 JLabel rtitle = new JLabel("Bharat Gas");
		 JLabel user = new JLabel("Username:");
		 JLabel log = new JLabel("Passward:");
		 tuser = new JTextField();
		 password = new JPasswordField();
		
		 img1 = new ImageIcon(NewGasConnection.class.getResource("/imageLogo.gif"));    //imagelogo.gif is stored in bin folder
		 img2 = new ImageIcon(NewGasConnection.class.getResource("/imageLogo.gif"));    //imagelogo.gif is stored in bin folder
		 loginImage = new ImageIcon(NewGasConnection.class.getResource("/login.png"));  //login.png is stored in bin folder
		 login = new JButton(loginImage);
		 
		 JLabel imgLogo = new JLabel(img1);
		 JLabel imgLogo2 = new JLabel(img2);
		 
		 rtitle.setForeground(Color.BLUE);
		 rtitle.setFont(new Font("Dialog",Font.BOLD,25));
		 
		 user.setForeground(Color.blue);
		 Border border1 = BorderFactory.createLineBorder(Color.blue,1);
		 tuser.setBorder(border1);
		 log.setForeground(Color.blue);
		 Border border2 = BorderFactory.createLineBorder(Color.blue,1);
		 password.setBorder(border2);
		 
		 fr2.add(rtitle);
		 fr2.add(user);
		 fr2.add(tuser);
		 fr2.add(log);
		 fr2.add(password);
		 fr2.add(login);
		
		 rtitle.setBounds(100, 5, 160, 50);
		 
		 imgLogo.setBounds(0,0,80,80);
		 imgLogo.setIcon(img1);
		 fr2.getContentPane().add(imgLogo);
		 imgLogo2.setBounds(270,0,80,80);
		 imgLogo2.setIcon(img2);
		 fr2.getContentPane().add(imgLogo2);
		 user.setBounds(40,80,100,30);
		 tuser.setBounds(130, 80, 130, 30);
		 log.setBounds(40,140,100,30);
		 password.setBounds(130, 140, 130, 30);
		 login.setBounds(130, 200, 100, 40);
		 login.addActionListener(this);
		 
		 fr2.setBounds(300,250, 350, 300);
		 fr2.getContentPane().setBackground(Color.white);
		 fr2.setLayout(null);
		 fr2.setVisible(true);
		 
	 }
	public static void main(String[] args) {
	     
		NewGasConnection ob = new NewGasConnection();
		ob.loginBox();
		//ob.parsonalDetail();
	    //ob.relativeDetail();
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String str,str2,str3,user,passwd;
		File fp = new File("GasConnectFile.txt");
		if(e.getSource() == login)
		{
			 user = tuser.getText();
		     passwd = new String(password.getPassword());
		     System.out.println();
		     if(!user.equals("vikas"))
		     {
		    	 JOptionPane.showMessageDialog(f,"Wrong Username");					//Creating POP up Dialog Box
		    	 fr2.dispose();
		    	 loginBox();
		     }
		     else if(!passwd.equals("1234"))
		     {
		    	 JOptionPane.showMessageDialog(fd, "Wrong Password");              //Creating POP up Dialog Box
		    	 fr2.dispose();
		    	 loginBox();
		     }
		     else
		     {
		        fr2.dispose();
		        parsonalDetail();
		     }
		}
		if(e.getSource() == sb)
		{
			try                                       						  // Exception Handling
			{
				FileWriter fwr = new FileWriter(fp,true);
				str = "Name:"+tFname.getText()+" "+tMname.getText()+" "+tLname.getText()+"\nDate Of Birth:"+tdob.getText()+"\nFather Name:"+tfatherName.getText()+"\nSpouse Name:"+tspouseName.getText()+"\nMother Name:"+tmotherName.getText()+"\nAddress:"+thouse1.getText()+" "+tfloor.getText()+" "+thouse2.getText()+"\n";
				str2 ="Near:"+troad.getText()+" "+tlandmark.getText()+"\nCity/Town/Village:"+tcity.getText()+"\nDistric:"+tdistric.getText()+"\nState:"+box2.getSelectedItem().toString()+"\nPIN Code:"+tpin.getText()+"\nMobile No.:"+tmobile.getText()+"\nEmail:"+temail.getText();
				fwr.write(str);
				fwr.write(str2);
				fwr.close();
				fr.dispose();
				relativeDetail();
			}
			catch(Exception ex)
			{
				
			}	
		}
		if(e.getSource() == tback)
		{
			try
			{
				parsonalDetail();
				fr1.dispose();
				
			}
			catch(Exception ex)
			{
				
			}
		}
		if(e.getSource() == submit)
		{
			try
			{
			  FileWriter fwr1 = new FileWriter(fp,true);
			  str3 ="\nProof of Identity:"+box1.getSelectedItem().toString()+"\nCard Number:"+tpoad.getText()+"\nState for issue Ration card:"+tstate1.getText()+"\nRation Card Number:"+tcardNumber.getText()+"\n";
			  fwr1.write(str3);
			  fwr1.close();
			  fr1.dispose();
			  
			}
			catch(Exception ex)
			{
				
			}
		}
	}

}
