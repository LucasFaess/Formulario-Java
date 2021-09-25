import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Formulario extends JFrame{
	JLabel lbNome,lbSexo,lbEstadocivil,lbReligiao,lbBens;
	JTextField txtNome;
	JButton mostrar;
	JPanel bordaSexo,janela,bordaEstadocivil,bordaBens;
	ButtonGroup sexoRadio,EstadoCivilRadio;
	JComboBox cboReligiao;
	String sexo,est,relig,bens;
	
	public Formulario() {
		this.setTitle("Formulario");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100,100,650,500);
		
		janela = new JPanel();
		janela.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(janela);
		janela.setLayout(null);
		
		lbNome = new JLabel();
		lbNome.setText("Nome: ");
		lbNome.setBounds(50,50,100,25);
		janela.add(lbNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(100,50,110,23);
		janela.add(txtNome);
		
		// Botao de radio Sexo
		
		bordaSexo = new JPanel();
		bordaSexo.setBorder(BorderFactory.createLineBorder(Color.black));
		bordaSexo.setBounds(100,100,100,100);
		janela.add(bordaSexo);
		bordaSexo.setLayout(null);
		
		lbSexo = new JLabel();
		lbSexo.setText("Sexo:");
		lbSexo.setBounds(5,12,90,10);
		bordaSexo.add(lbSexo);
		
		sexoRadio = new ButtonGroup();
		
		JRadioButton  rdbMasc = new JRadioButton("Masculino");
		sexoRadio.add(rdbMasc);
		rdbMasc.setBounds(5,22,90,30);
		bordaSexo.add(rdbMasc);
		
		JRadioButton rdbFem = new JRadioButton("Feminino");
		sexoRadio.add(rdbFem);
		rdbFem.setBounds(5,46,90,30);
		bordaSexo.add(rdbFem);
		
		
		// Botao de radio Estado civil
		
		
		bordaEstadocivil = new JPanel();
		bordaEstadocivil.setBorder(BorderFactory.createLineBorder(Color.black));
		bordaEstadocivil.setBounds(210,100,100,140);
		bordaEstadocivil.setLayout(null);
		janela.add(bordaEstadocivil);
		
		lbEstadocivil = new JLabel();
		lbEstadocivil.setText("Estado Civil:");
		lbEstadocivil.setBounds(5,7,100,20);
		bordaEstadocivil.add(lbEstadocivil);
		
		EstadoCivilRadio = new ButtonGroup();
		
		JRadioButton rdbSolt = new JRadioButton("Solteiro");
		EstadoCivilRadio.add(rdbSolt);
		rdbSolt.setBounds(5,26,90,30);
		bordaEstadocivil.add(rdbSolt);
		
		JRadioButton rdbCas = new JRadioButton("Casado");
		EstadoCivilRadio.add(rdbCas);
		rdbCas.setBounds(5,50,90,30);
		bordaEstadocivil.add(rdbCas);
		
		JRadioButton rdbSep = new JRadioButton("Separado");
		EstadoCivilRadio.add(rdbSep);
		rdbSep.setBounds(5,74,90,30);
		bordaEstadocivil.add(rdbSep);
		
		JRadioButton rdbOut = new JRadioButton("Outros");
		EstadoCivilRadio.add(rdbOut);
		rdbOut.setBounds(5,98,90,30);
		bordaEstadocivil.add(rdbOut);
		
		
		// Combobox Religiao
		
		lbReligiao = new JLabel();
		lbReligiao.setText("Religião:");
		lbReligiao.setBounds(320,90,70,20);
		janela.add(lbReligiao);
		
		String Religioes [] = {"Católico","Protestante","Judeu","Muçulmano","Espirita","Outros","Não tem"};
		
		cboReligiao = new JComboBox(Religioes);
		
		cboReligiao.setBounds(320,110,100,22);
		janela.add(cboReligiao);
		
		
		// Caixa de checagem
		
		bordaBens = new JPanel();
		bordaBens.setBorder(BorderFactory.createLineBorder(Color.black));
		bordaBens.setBounds(70,260,430,60);
		janela.add(bordaBens);
		bordaBens.setLayout(null);
		
		lbBens = new JLabel();
		lbBens.setText("Bens:");
		lbBens.setBounds(10,10,50,15);
		bordaBens.add(lbBens);
		
		JCheckBox chkImovel = new JCheckBox("Imóvel");
		chkImovel.setBounds(10,30,70,20);
		bordaBens.add(chkImovel);
		
		JCheckBox chkCarro = new JCheckBox("Carro");
		chkCarro.setBounds(110,30,70,20);
		bordaBens.add(chkCarro);
		
		JCheckBox chkBarco = new JCheckBox("Barco");
		chkBarco.setBounds(210,30,70,20);
		bordaBens.add(chkBarco);
		
		JCheckBox chkObras = new JCheckBox("Obras de Arte");
		chkObras.setBounds(310,30,110,20);
		bordaBens.add(chkObras);
		
		
		// Botao Exibir
		

		JButton btnMostrar = new JButton("Exibir");
		btnMostrar.setBounds(250,380,100,50);
		janela.add(btnMostrar);
		
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = "Nome: "+txtNome.getText()+"\n";
				
				if(rdbMasc.isSelected()) {
					sexo = "Sexo: "+rdbMasc.getText()+"\n";
				}else {
					sexo = "Sexo: "+rdbFem.getText()+"\n";
				}
				
				if(rdbSolt.isSelected()) {
					est = "Estado civil: Solteiro \n";
				}else if(rdbCas.isSelected()) {
					est = "Estado civil: Casado \n";
				}else if(rdbSep.isSelected()) {
					est = "Estado civil: Separado \n";
				}else {
					est = "Estado civil: Outros \n";
				}
				
				relig = "Religião: "+cboReligiao.getSelectedItem()+"\n";
				
				bens="Bens: ";
				if(chkImovel.isSelected()) {
					bens+="Imóvel \n";
				}
				if(chkCarro.isSelected()) {
					bens+="Carro \n";
				}
				if(chkBarco.isSelected()) {
					bens+="Barco \n";
				}
				if(chkObras.isSelected()) {
					bens+="Obras de arte";
				}
				
				JOptionPane.showMessageDialog(null,nome + sexo + est + relig + bens);
			
				
			}
		});
		
		this.setVisible(true);
	}

}
