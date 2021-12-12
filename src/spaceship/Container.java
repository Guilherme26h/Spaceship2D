package spaceship;

import javax.swing.JFrame;

import spaceship.Modelo.Fase;

/***
 * 
 * @author Guilherme Henrique de Sousa Jesus
 *
 */

//Janela do Jogo
public class Container extends JFrame {
	
	public Container() {
		
		//Instanciando a classe fase que é o JPanel com background
		add(new Fase());
		setTitle("Spaceship 2D");
		setSize(950, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	//Inicia a tela do jogo
	public static void main(String[] args) {
		new Container();
	}
	

}
