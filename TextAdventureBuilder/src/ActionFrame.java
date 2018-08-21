import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jhlabs.awt.ParagraphLayout;

public class ActionFrame extends JFrame {

	public ActionFrame(Object object, Object object2, Object object3) {
		/*
		 * if (id == null) id = ""; if (event == null) event = ""; if (action == null)
		 * action = "";
		 */
		//blah
		setSize(375, 330);
		setLayout(new ParagraphLayout());
		JLabel idLabel = new JLabel("Action ID:");
		JTextField idText = new JTextField(15);
		JButton genId = new JButton("Gen ID");
		JLabel nameLabel = new JLabel("Action Name:");
		JTextField nameText = new JTextField(15);
		JLabel regexLabel = new JLabel("Action Regex:");
		JTextField regexText = new JTextField(15);
		JButton regexButton = new JButton("Editor");
		regexButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActionRegexEditor regexEditor = new ActionRegexEditor();
			}
		});
		JLabel resultLabel = new JLabel("Action Result:");
		JTextField resultText = new JTextField(15);
		JButton resultButton = new JButton("Editor");
		regexButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActionResultEditor regexEditor = new ActionResultEditor();
			}
		});
		JLabel descriptionLabel = new JLabel("Description:");
		JTextArea descriptionText = new JTextArea(5, 22);
		JButton okButt = new JButton("OK");
		
		add(idLabel, ParagraphLayout.NEW_PARAGRAPH);
		add(idText);
		add(genId);
		add(nameLabel, ParagraphLayout.NEW_PARAGRAPH);
		add(nameText);
		add(regexLabel, ParagraphLayout.NEW_PARAGRAPH);
		add(regexText);
		add(regexButton);
		add(resultLabel, ParagraphLayout.NEW_PARAGRAPH);
		add(resultText);
		add(resultButton);
		add(descriptionLabel, ParagraphLayout.NEW_PARAGRAPH);
		add(descriptionText);
		add(Box.createRigidArea(new Dimension(190, 10)), ParagraphLayout.NEW_LINE);
		add(Box.createRigidArea(new Dimension(187, 0)), ParagraphLayout.NEW_LINE);
		add(okButt);
		
		setVisible(true);
	}

	public ActionFrame() {
		this(null, null, null);
	}

}
