package projet;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import graphisme.Point;


public class NoteUE extends JDialog implements ActionListener {
	
	JButton envoyer,reinit;
	JLabel uefond,note,credit,code1,code2,code3,ueopt,notea,credita,code4;
	JTextField note1,credit1,note2,credit2,note3,credit3,note4,credit4;
	FenetreEtudiant k=new FenetreEtudiant();
	
	public NoteUE(String n,String p,String v ){
		
	}
	
	public NoteUE(ActionListener f,String s){
    
		super();
    setBounds(500,100,400,300);
    setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    
    Container c=getContentPane();
    c.setLayout(null);
    
    uefond=new JLabel("UE FOND :");
    uefond.setBounds(10,20,120,20);
    c.add(uefond);
    
    code1=new JLabel("CODE 1 :");
    code1.setBounds(10,50,120,20);
    c.add(code1);
    
    code2=new JLabel("CODE 2 :");
    code2.setBounds(10,80,120,20);
    c.add(code2);
    
    code3=new JLabel("CODE 3 :");
    code3.setBounds(10,110,120,20);
    c.add(code3);
    
    note=new JLabel("NOTE :");
    note.setBounds(140,20,110,20);
    c.add(note);
    
    ueopt=new JLabel("UE OPT :");
    ueopt.setBounds(10,140,120,20);
    c.add(ueopt);
    
    code4=new JLabel("CODE 4 :");
    code4.setBounds(10,170,120,20);
    c.add(code4);
    

    
    credit1=new JTextField();
    credit1.setBounds(200,50,80,20);
    c.add(credit1);
    
    credit2=new JTextField();
    credit2.setBounds(200,80,80,20);
    c.add(credit2);
    
    credit3=new JTextField();
    credit3.setBounds(200,110,80,20);
    c.add(credit3);
    
    credit4=new JTextField();
    credit4.setBounds(200,170,80,20);
    c.add(credit4);
    
    note1=new JTextField();
    note1.setBounds(110,50,80,20);
    c.add(note1);
    
    note2=new JTextField();
    note2.setBounds(110,80,80,20);
    c.add(note2);
    
    note3=new JTextField();
    note3.setBounds(110,110,80,20);
    c.add(note3);
    
    note4=new JTextField();
    note4.setBounds(110,170,80,20);
    c.add(note4);
    
    notea=new JLabel("NOTE :");
    notea.setBounds(110,140,120,20);
    c.add(notea);
    
    credita=new JLabel("CREDIT :");
    credita.setBounds(200,140,120,20);
    c.add(credita);
    
    credit=new JLabel("CREDIT :");
    credit.setBounds(200,20,120,20);
    c.add(credit);
    
	
	Border bord=BorderFactory.createRaisedBevelBorder();
	envoyer=new JButton("ENVOYER");
	envoyer.setActionCommand("ENVOYER");
	envoyer.addActionListener(this);
	envoyer.setBorder(bord);
	envoyer.setBounds(300,150,80,30);
	c.add(envoyer);
	
	reinit=new JButton("REINITIALISER");
	reinit.setActionCommand("ENVOYER");
	reinit.addActionListener(this);
	//Cancel.setBorder(bord);
	reinit.setBounds(300,100,80,30);
	c.add(reinit);
	
	reinit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			note1.setText(null);
			note2.setText(null);
			note3.setText(null);
			note4.setText(null);
			credit1.setText(null);
			credit2.setText(null);
			credit3.setText(null);
			credit4.setText(null);
			
		}
	});
	
	envoyer.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			 String noteue1,noteue2,noteue3,noteue4;
			 String creditue1,creditue2,creditue3,creditue4;
			 creditue1=credit1.getText();
			 creditue2=credit2.getText();
			 creditue3=credit3.getText();
			 creditue4=credit4.getText();
			 
			 noteue1=(note1.getText());
		     noteue2=(note2.getText());
		     noteue3=(note3.getText());
		     noteue4=(note4.getText());
			 
			 Double c1,c2,c3,c4,c;
			 Double n1,n2,n3,n4,s,m;
			 c1=Double.parseDouble(creditue1);
			 c2=Double.parseDouble(creditue2);
			 c3=Double.parseDouble(creditue3);
			 c4=Double.parseDouble(creditue4);
			 
			 n1=Double.parseDouble(noteue1);
			 n2=Double.parseDouble(noteue2);
			 n3=Double.parseDouble(noteue3);
			 n4=Double.parseDouble(noteue4);
			 
			 s=n1*c1+n2*c2+n3*c3+n4*c4;
			 c=c1+c2+c3+c4;
			 m=s/c;
			 
			 FenetreEtudiant k=new FenetreEtudiant();
			
			 String n=k.nom1.getText();
			 String p=k.prenom1.getText();
			 String j=k.matricule1.getText();
			 String v=k.sexe3.getActionCommand();
			JOptionPane pane= new JOptionPane();
			
			pane.showMessageDialog(null, "L'étudiant "+n+" "+p+" sexe "
			+v+" de  matricule "+j+" ayant composé les UEs "+" "
					+ "a eu une moyenne de "+ m);
			
		}
	});
	
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
	
}
