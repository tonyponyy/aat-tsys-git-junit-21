package calculadora_test_maven.calculadora_test_maven;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class vista1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JLabel resultado = new JLabel("0");
	double num_tmp = 0;
	String operador_temp = "";
	private Calculadora calc = new Calculadora();

	public vista1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_4 = new JButton("4");
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_4.setBounds(24, 132, 89, 51);
		btn_4.addActionListener(funcion_numeros);
		contentPane.add(btn_4);

		JButton btn_5 = new JButton("5");
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_5.setBounds(123, 132, 89, 51);
		btn_5.addActionListener(funcion_numeros);
		contentPane.add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_6.setBounds(222, 132, 89, 51);
		btn_6.addActionListener(funcion_numeros);
		contentPane.add(btn_6);

		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_1.setBounds(21, 194, 89, 51);
		btn_1.addActionListener(funcion_numeros);
		contentPane.add(btn_1);

		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_2.setBounds(123, 194, 89, 51);
		btn_2.addActionListener(funcion_numeros);
		contentPane.add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_3.setBounds(222, 194, 89, 51);
		btn_3.addActionListener(funcion_numeros);
		contentPane.add(btn_3);

		JButton btn_cambiar_signo = new JButton("+/-");
		btn_cambiar_signo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_cambiar_signo.setBounds(21, 256, 89, 51);
		btn_cambiar_signo.addActionListener(cambiar_signo);
		contentPane.add(btn_cambiar_signo);

		JButton btn_0 = new JButton("0");
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_0.setBounds(123, 256, 89, 51);
		btn_0.addActionListener(funcion_numeros);
		contentPane.add(btn_0);

		JButton btn_coma = new JButton(",");
		btn_coma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_coma.setBounds(222, 256, 89, 51);
		btn_coma.addActionListener(aniadir_coma);
		contentPane.add(btn_coma);

		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_7.setBounds(21, 70, 89, 51);
		btn_7.addActionListener(funcion_numeros);
		contentPane.add(btn_7);

		JButton btn_8 = new JButton("8");
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_8.setBounds(123, 70, 89, 51);
		btn_8.addActionListener(funcion_numeros);
		contentPane.add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_9.setBounds(222, 70, 89, 51);
		btn_9.addActionListener(funcion_numeros);
		contentPane.add(btn_9);

		JButton btn_resta = new JButton("-");
		btn_resta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_resta.setBounds(442, 73, 101, 72);
		btn_resta.addActionListener(definir_operador);
		contentPane.add(btn_resta);

		JButton btn_suma = new JButton("+");
		btn_suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_suma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_suma.setBounds(331, 73, 101, 72);
		btn_suma.addActionListener(definir_operador);
		contentPane.add(btn_suma);

		JButton btn_multiplica = new JButton("X");
		btn_multiplica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_multiplica.setBounds(331, 150, 101, 72);
		btn_multiplica.addActionListener(definir_operador);
		contentPane.add(btn_multiplica);

		JButton btn_divide = new JButton("/");
		btn_divide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_divide.setBounds(442, 150, 101, 72);
		btn_divide.addActionListener(definir_operador);
		contentPane.add(btn_divide);

		JButton btn_igual = new JButton("=");
		btn_igual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_igual.setBounds(331, 233, 101, 72);
		btn_igual.addActionListener(hacer_operacion);
		contentPane.add(btn_igual);

		resultado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		resultado.setBounds(24, 22, 519, 37);
		contentPane.add(resultado);

		JButton btn_ce = new JButton("CE");
		btn_ce.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_ce.setBounds(442, 233, 101, 72);
		btn_ce.addActionListener(borrar_numeros);
		contentPane.add(btn_ce);
	}

	ActionListener funcion_numeros = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String numero = e.getActionCommand();
			String panel = resultado.getText().replaceFirst("^0+", "");
			cambiar_resultado( panel + numero);
		}
	};
	

	ActionListener definir_operador = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String operador = e.getActionCommand();
			operador_temp = operador;
			num_tmp = Double.parseDouble(resultado.getText());
			cambiar_resultado("0");

		}
	};

	ActionListener aniadir_coma = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (!resultado.getText().contains(".")) {
				String num_coma = resultado.getText() + ".";
				cambiar_resultado(num_coma);
			}
		}
	};

	ActionListener cambiar_signo = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			num_tmp = 0;
			double num_operacion =  Double.parseDouble(resultado.getText());
			operador_temp = "";
	
			double res = calc.cambiar_signo(num_operacion);
			cambiar_resultado(res + "");
		}
	};

	ActionListener hacer_operacion = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			double n1 = num_tmp;
			double n2 = Double.parseDouble(resultado.getText());
			String operador = operador_temp;
			double resultado_operacion = calc.calcular(n1,n2,operador);
			operador_temp = "";
			cambiar_resultado(Double.toString(resultado_operacion));
		}
	};
	
	
	public int borrar() {
		num_tmp = 0;
		return (int) num_tmp;
	}
	
	

	ActionListener borrar_numeros = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			operador_temp = "";
			int resultado = borrar();
			cambiar_resultado( String.valueOf(resultado));
		}
	};

	private void cambiar_resultado(String resultado_string) {
		if (resultado_string == "NaN") {
			resultado_string = "0";
		}
		resultado.setText(resultado_string);
	}
}
