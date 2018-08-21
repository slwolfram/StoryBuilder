import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelFactory {
	/*
	 * Creates panels used in add/edit frames.
	 */
	public GameModel model;
	
	public PanelFactory(GameModel model) {
		this.model = model;
	}
	
	public  JPanel createObjectPanel(String label, String text) {
		if (text == null)
			text = "";
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel nameLabel = new JLabel(label);
		JTextField nameField = new JTextField("");
		p.add(nameLabel, BorderLayout.WEST);
		p.add(nameField, BorderLayout.EAST);
		p.setVisible(true);
		return p;
	}

	public JPanel createDescriptionPanel(String label, String text) {
		if (text == null)
			text = "";
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel nameLabel = new JLabel(label);
		JTextField nameField = new JTextField("");
		p.add(nameLabel, BorderLayout.WEST);
		p.add(nameField, BorderLayout.EAST);
		p.setVisible(true);
		return p;
	}

	public JPanel createRegexPanel(String label, String text) {
		if (text == null)
			text = "";
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel nameLabel = new JLabel(label);
		JTextField nameField = new JTextField("");
		p.add(nameLabel, BorderLayout.WEST);
		p.add(nameField, BorderLayout.EAST);
		p.setVisible(true);
		return p;
	}

	public JPanel createTypePanel(String label, String text) {
		if (text == null)
			text = "";
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel nameLabel = new JLabel(label);
		JTextField nameField = new JTextField("");
		p.add(nameLabel, BorderLayout.WEST);
		p.add(nameField, BorderLayout.EAST);
		p.setVisible(true);
		return p;
	}

	public JPanel createActionPanel(String label, String text) {
		if (text == null)
			text = "";
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel nameLabel = new JLabel(label);
		JTextField nameField = new JTextField("");
		p.add(nameLabel, BorderLayout.WEST);
		p.add(nameField, BorderLayout.EAST);
		p.setVisible(true);
		return p;
	}

	public JPanel createTextPanel(String label, String text) {
		if (text == null)
			text = "";
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel idLabel = new JLabel(label);
		JTextField idField = new JTextField(text);
		JButton idButt = new JButton("Gen ID");
		p.add(idLabel, BorderLayout.WEST);
		p.add(idField, BorderLayout.CENTER);
		p.add(idButt, BorderLayout.EAST);
		p.setVisible(true);
		return p;
	}

	public JPanel createNamePanel(String label, String text) {
		if (text == null)
			text = "";
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel nameLabel = new JLabel(label);
		JTextField nameField = new JTextField("");
		p.add(nameLabel, BorderLayout.WEST);
		p.add(nameField, BorderLayout.CENTER);
		p.setVisible(true);
		return p;
	}

	public JPanel createIdPanel(String label, String text) {
		if (text == null)
			text = "";
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel idLabel = new JLabel(label);
		JTextField idField = new JTextField(text);
		JButton idButt = new JButton("Gen ID");
		p.add(idLabel, BorderLayout.WEST);
		p.add(idField, BorderLayout.CENTER);
		p.add(idButt, BorderLayout.EAST);
		p.setVisible(true);
		return p;
	}
}
