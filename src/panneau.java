import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class panneau extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public panneau() {
		this.setLayout(null);
		this.setVisible(true);

	}

	/*********** graphic ************/
	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("pan1.jpg"));
			g.drawImage(img, 0, 0, this);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/*********** fin **************/

}
