package hacs;

import javax.swing.JDialog;
/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 *
 * @author mjfindler
 * @version 2.0
 *
 * @author RUshikesh
 * @version 3.0
 * Update to Java 8
 */
public class SolutionMenu extends JDialog {

	private static final long serialVersionUID = 1L;

	public SolutionMenu() {
		System.out.println("Solution Menu Implemented.");
	}

	void showMenu(Solution theSolution) {
		setVisible(true);
	}

}
