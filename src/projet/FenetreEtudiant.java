package projet;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;

import graphisme.PoinDialog;


public class FenetreEtudiant extends JFrame implements ActionListener{
	public JLabel nom,prenom,sexe,etablisement,matricule,uefond,ueopt;//implémentation de l'interface proprement dite
	public JTextField nom1,prenom1,matricule1;
	private JButton reinit,envoye;//ainsi que des button et case à cocher
	public JComboBox sexe3,etablis,uefond1,ueopt1;
	
	
	public static void main(String [] args)//création d'une instance
	{
	FenetreEtudiant p=new FenetreEtudiant();
	}

	public FenetreEtudiant() //constructeur
	{
		setBounds(10,10,400,300);//spécification des coordonnées largeur 400,hauteur 300
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//opération par défaut quiter

		Container c;
		c=getContentPane();

		BorderLayout bl=new BorderLayout();
		c.setLayout(bl);
		

		JPanel p=new JPanel();
		p.setLayout(null);

		nom= new JLabel("NOM : ");
		nom.setBounds(10,20,100,20);
		p.add(nom);
		
		prenom= new JLabel("PRENOM : ");
		prenom.setBounds(10,50,100,20);
		p.add(prenom);
		
		sexe= new JLabel("SEXE : ");
		sexe.setBounds(10,90,100,20);//spécification des coordonnées
		p.add(sexe);
		
		etablisement= new JLabel("ENTABLISEMENT : ");
		etablisement.setBounds(10,120,100,20);//spécification des coordonnées
		p.add(etablisement);
		
		matricule= new JLabel("MATRICULE : ");
		matricule.setBounds(10,150,100,20);
		p.add(matricule);
		
		
		uefond= new JLabel("UE FOND : ");
		uefond.setBounds(10,180,100,20);
		p.add(uefond);
		
		ueopt= new JLabel("UE OPT : ");
		ueopt.setBounds(10,210,170,20);
		p.add(ueopt);
		
		nom1=new JTextField(20);
		nom1.setBounds(120,20,100,20);
		p.add(nom1);
		
		prenom1=new JTextField(20);
		prenom1.setBounds(120,50,100,20);
		prenom1.setEditable(true);
		p.add(prenom1);
		
		Object[] elements = new Object[]{"M", "F"};
		sexe3=new JComboBox(elements);
		sexe3.setBounds(120,90,100,20);
		sexe3.setEditable(true);
		p.add(sexe3);
		
		Object[] elements1 = new Object[]{"FS", "FSJP","FASEG","FALSH"};
		etablis=new JComboBox(elements1);
		etablis.setBounds(120,120,100,20);
		etablis.setEditable(true);
		p.add(etablis);
		
		matricule1=new JTextField(20);
		matricule1.setBounds(120,150,100,20);
		matricule1.setEditable(true);
		p.add(matricule1);
		
		Object[] elements2 = new Object[]{"Atelier de programmation"
				, "Algorithmique 2","Systeme Informatique"};
		uefond1=new JComboBox(elements2);
		uefond1.setBounds(120,180,100,20);
		p.add(uefond1);
		
		Object[] elements3 = new Object[]{"Méthode/Complément"
				};
		ueopt1=new JComboBox(elements3);
		ueopt1.setBounds(120,210,100,20);
		p.add(ueopt1);
		
//		editDis=new JTextField(20);
//		editDistance.setBounds(120,170,150,20);
//		editDistance.setEditable(true);
//		p.add(editDistance);
		
		Border bord=BorderFactory.createRaisedBevelBorder();
		
		envoye=new JButton("Envoyer");
		envoye.addActionListener(this);
		envoye.setBorder(bord);
		envoye.setBounds(240,35,100,20);
		p.add(envoye);
		
		reinit=new JButton("Réinitialiser");
		reinit.setBorder(bord);
		reinit.setBounds(240,105,100,20);
		p.add(reinit);
		
		
		
		c.add(p, BorderLayout.CENTER);
		setVisible(true);
		
		reinit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				nom1.setText(null);
				prenom1.setText(null);
				matricule1.setText(null);
				
			}
		});
		envoye.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
	NoteUE h=new codeA(nom1.getText(), prenom1.getText(),matricule.getText(),sexe3.getSelectedItem());
	h.setVisible(true);
				
				
			}
		});
   }
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
		

		

	
	
		
		


