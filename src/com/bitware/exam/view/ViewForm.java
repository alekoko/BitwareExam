package com.bitware.exam.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import com.bitware.exam.models.Person;

public class ViewForm extends javax.swing.JFrame{

	 /**
	 * 
	 */
	Person person = null;
	
	private static final long serialVersionUID = 1L;
	public ViewForm() {
	        initComponents();
	    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	    	jLabel1 = new javax.swing.JLabel();
	        textField1 = new java.awt.TextField();
	        textField2 = new java.awt.TextField();
	        textField4 = new java.awt.TextField();
	        textField5 = new java.awt.TextField();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        textArea1 = new java.awt.TextArea();
	        jButton1 = new javax.swing.JButton();
	        jComboBox1 = new javax.swing.JComboBox<>();


	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        
	        jLabel1.setText("Nombre completo");

	        jLabel2.setText("Edad");

	        jLabel3.setText("Sexo");

	        jLabel4.setText("Peso(kg)");

	        jLabel5.setText("Altura(m)");

	        textArea1.setEditable(false);

	        jButton1.setText("Validar Informacion");
	        
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	jButton1ActionPerformed(evt);
	            }
	        });
	        
	        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "M"}));
	        jComboBox1.setSelectedItem(jComboBox1.getAction());

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(19, 19, 19)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(0, 294, Short.MAX_VALUE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
	                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(123, 123, 123)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(textField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
	                                        .addComponent(textField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(0, 0, Short.MAX_VALUE)))
	                        .addGap(161, 161, 161))))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(59, 59, 59)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
	                .addGap(25, 25, 25)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
	                .addGap(24, 24, 24)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(4, 4, 4)
	                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
	                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addGap(22, 22, 22)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(textField5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
	                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addGap(18, 18, 18)
	                .addComponent(jButton1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(20, Short.MAX_VALUE))
	        );

	        pack();
	    }              
    
	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
	    	if(textField1.getText().isEmpty() 
	    			|| textField2.getText().isEmpty()
	    			|| textField4.getText().isEmpty() 
	    			|| textField5.getText().isEmpty()) {
	    		JOptionPane.showMessageDialog(this,
	    			    "Error por favor llenar los campos vacios",
	    			    "Validar Campos",
	    			    JOptionPane.WARNING_MESSAGE);
	    		return;
	    	}
	    	
	    	Pattern patName = Pattern.compile("[a-zA-ZàäéëíïóöúüÁÄÉËÍÓÖÚÜ .'-]+$");
	    	Pattern patAge = Pattern.compile("[0-9]{1,3}");
	    	Pattern patWeight = Pattern.compile("^[0-9]{1,3}$|^[0-9]{1,3}\\.[0-9]{1,3}$");
	    	Pattern patHeight = Pattern.compile("[0-9]*[.]?[0-9]*");
	    	
	    	Matcher matName = patName.matcher(textField1.getText());
	    	Matcher matAge = patAge.matcher(textField2.getText());
	    	Matcher matWeight = patWeight.matcher(textField4.getText());
	    	Matcher matHeight = patHeight.matcher(textField5.getText());
	    	
	    	if(!matName.matches()) {
	    		JOptionPane.showMessageDialog(this,
	    			    "Error Nombre, por un carater invalido",
	    			    "Nombre Completo",
	    			    JOptionPane.WARNING_MESSAGE);
	    		return;
	    	}
	    	
	    	if(!matAge.matches()) {
	    		JOptionPane.showMessageDialog(this,
	    			    "Error Edad, por un carater invalido",
	    			    "Edad",
	    			    JOptionPane.WARNING_MESSAGE);
	    		return;
	    	}
	    	
	    	if(!matWeight.matches()) {
	    		JOptionPane.showMessageDialog(this,
	    			    "Error Peso, por un carater invalido",
	    			    "Peso",
	    			    JOptionPane.WARNING_MESSAGE);
	    		return;
	    	}
	    	
	    	if(!matHeight.matches()) {
	    		JOptionPane.showMessageDialog(this,
	    			    "Error Peso, por un carater invalido",
	    			    "Peso",
	    			    JOptionPane.WARNING_MESSAGE);
	    		return;
	    	}
	    	
	    	String name = textField1.getText();
	    	int age = Integer.parseInt(textField2.getText().toString());
	    	String nss = "";
	    	char gender = jComboBox1.getSelectedItem().toString().charAt(0);
	    	float weight = Float.parseFloat(textField4.getText().toString()); 
	    	float height = Float.parseFloat(textField5.getText().toString());
	    	
	    	person = new Person(name, age, nss, weight, height, gender);
	    	int resultBMI = person.calculateBMI();
	    	nss = person.generateRandomNss();
	    	String messageBMI = "No se pudo calcular el IMC";
	    	
	    			switch(resultBMI)
	    	        {
	    	            case -1:
	    	            	JOptionPane.showMessageDialog(this,
	    	            			"Tu IMC indica que estas por debajo de Peso",
	    	        			    "Peso",
	    	        			    JOptionPane.WARNING_MESSAGE);
	    	                break;
	    	            case 0:
	    	            	JOptionPane.showMessageDialog(this,
	    	            			"Tu IMC indica que estas en tu peso Normal",
	    	        			    "Peso",
	    	        			    JOptionPane.WARNING_MESSAGE);
	    	                break;
	    	            case 1:
	    	            	JOptionPane.showMessageDialog(this,
	    	            			"Tu IMC indica que estas en sobre Peso",
	    	        			    "Peso",
	    	        			    JOptionPane.WARNING_MESSAGE);
	    	                break;
	    	            default:
	    	            	JOptionPane.showMessageDialog(this,
	    	            			messageBMI,
	    	        			    "Peso",
	    	        			    JOptionPane.WARNING_MESSAGE);
	    	        }
	    	
	    	String ageValidate = "";
	    	if(person.isAdult()) {
	    		ageValidate = "Es Mayor de edad";
	    		textArea1.setText(ageValidate);
	    	}else {
	    		ageValidate = "Es menor de edad"; 
	    		textArea1.setText(ageValidate); 		
	    	}	
	    	
	    	textArea1.setText(person.toString() + "\n" + ageValidate); 			
	    	
	    } 

	    public static void main(String args[]) {
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new ViewForm().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JComboBox<String> jComboBox1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private java.awt.TextField textField1;
	    private java.awt.TextField textField2;
	    private java.awt.TextField textField4;
	    private java.awt.TextField textField5;
	    private java.awt.TextArea textArea1;
	    // End of variables declaration                   
	}