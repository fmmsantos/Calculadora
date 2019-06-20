package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Panel;

public class Calculadora_Frame extends JFrame {
    
	double num1,num2,result;
	
	private String operacao;
	private JButton botoes_ativa;
	
	
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_Frame frame = new Calculadora_Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setarNumeroNoLabel(JLabel labelTop, JButton btnPressed) {
        
		labelTop.setText(labelTop.getText() + btnPressed.getText());
	}
	
	public void liparLabel(JLabel limpar) {
		limpar.setText("00");
		
		}
	
	public void liparCompletoLabel(JLabel limpar) {
		limpar.setText(" ");
		
		}
	
	
	public void pegarNum1(JLabel a) {
	
	num1 = Double.parseDouble(a.getText());
	a.setText(" ");
	
	}
	
	public void pegarNum2(JLabel a) {
		num2 = Double.parseDouble(a.getText());
		a.setText(" ");
		}
	
	
	public void valorDoOperador(JButton v ) {
		this.operacao = v.getText();
		}
	
     public void resultad(JLabel labelTop) {
    	if(num1 !=0 && num2 !=0) {		
    	  if(operacao == "+" ) {
    		result= num1 + num2;
    	
    	 }
    	 else if(operacao == "-" ) {
     		result= num1 - num2;
    	 
    	 }
     	else if(operacao == "x" ) {
     		result= num1 * num2;
     	 
     	 }
     	else if(operacao == "/" ) {
     		result= num1 / num2;
     	
     	}
    	
    	labelTop.setText(String.valueOf(result));
    	 
     }
    }
     
     public void setarPonto(JButton botaoPonto) {
    //	if (botaoPonto.getText() ) 
    	 
     }
     public void desabilitar(JButton botoes_ativa) {
     this.botoes_ativa = botoes_ativa;
     botoes_ativa.setEnabled(false); 
     }
   
     
     public void habilitar() {
    	  this.botoes_ativa.setEnabled(true);
        
         
         }
     
	public Calculadora_Frame() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label_Topo = new JLabel("");
		label_Topo.setHorizontalAlignment(SwingConstants.RIGHT);
		label_Topo.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_Topo.setBackground(Color.WHITE);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				liparCompletoLabel(label_Topo);
				setarNumeroNoLabel(label_Topo, button_7);
					
			}
		});
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liparCompletoLabel(label_Topo);
				
				setarNumeroNoLabel(label_Topo, button_8);
			}
		});
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liparCompletoLabel(label_Topo);
				setarNumeroNoLabel(label_Topo, button_9);
			}
		});
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liparCompletoLabel(label_Topo);
				setarNumeroNoLabel(label_Topo, button_4);
			}
		});
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liparCompletoLabel(label_Topo);
				setarNumeroNoLabel(label_Topo, button_5);
			}
		});
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liparCompletoLabel(label_Topo);
				setarNumeroNoLabel(label_Topo, button_6);
			}
		});
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liparCompletoLabel(label_Topo);
				setarNumeroNoLabel(label_Topo, button_1);
			}
		});
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liparCompletoLabel(label_Topo);
				setarNumeroNoLabel(label_Topo, button_2);
			}
		});
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liparCompletoLabel(label_Topo);
				setarNumeroNoLabel(label_Topo, button_3);
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitar();
				liparLabel(label_Topo);
				
				 
				
			}
		});
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setarNumeroNoLabel(label_Topo, button_0);
			}
		});
		
		JButton button_ponto = new JButton(".");
		
		JButton button_Mais = new JButton("+");
		button_Mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			valorDoOperador(button_Mais);
			desabilitar(button_Mais);
				pegarNum1(label_Topo);
			

			}
		});
		
		JButton button_Menos = new JButton("-");
		button_Menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valorDoOperador(button_Menos);
				desabilitar(button_Menos);
				pegarNum1(label_Topo);

			}
		});
		
		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valorDoOperador(button_div);
				desabilitar(button_div);
				
				pegarNum1(label_Topo);

			}
		});
		
		
		JButton button_mult = new JButton("x");
		button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valorDoOperador(button_mult);
				desabilitar(button_mult);
				pegarNum1(label_Topo);

			}
		});
		
		JButton button_igual = new JButton("=");
		button_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegarNum2(label_Topo);
				habilitar();
				resultad(label_Topo);
				
				
				
				
				
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_Topo, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
							.addComponent(button_div, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
							.addComponent(button_mult, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
							.addComponent(button_Menos, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(button_igual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(button_0, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_ponto, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
							.addComponent(button_Mais, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(label_Topo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_div, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_mult, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_Menos, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_0, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_ponto, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_Mais, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_igual)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		
		panel.setLayout(gl_panel);
	}
	
	
}
