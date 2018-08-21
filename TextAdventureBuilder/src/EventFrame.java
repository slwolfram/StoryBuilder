import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import com.jhlabs.awt.ParagraphLayout;

public class EventFrame extends JFrame {

	ArrayList<JComboBox<String>> actionBoxes;

	public EventFrame(String id, String event, Object action) {
		if (id == null)
			id = "";
		if (event == null)
			event = "";
		if (action == null)
			action = "";

		setSize(375, 285);
		setLayout(new ParagraphLayout());
		JLabel idLabel = new JLabel("Event ID:");
		JLabel eventLabel = new JLabel("Event Text:");
		JLabel actionLabel = new JLabel("Event Actions:");
		JButton genIdButt = new JButton("genId");
		JButton addActionButt = new JButton("Add...     ");
		JButton removeActionButt = new JButton("Remove");
		JButton okButt = new JButton("OK");
		JTextField idText = new JTextField(15);
		JTextArea eventText = new JTextArea(5, 22);
		JScrollPane eventScroll = new JScrollPane(eventText);
		// grouping panel for ActionBoxes
		JPanel actionPanel1 = new JPanel();
		actionPanel1.setLayout(new ParagraphLayout(0, 0, 0, 0, 0, 0));
		// grouping panel for Add and Remove buttons
		JPanel actionPanel2 = new JPanel();
		actionPanel2.setLayout(new ParagraphLayout(0, 0, 0, 0, 0, 0));
		actionPanel2.add(addActionButt, ParagraphLayout.NEW_PARAGRAPH);
		actionPanel2.add(removeActionButt, ParagraphLayout.NEW_PARAGRAPH);
		actionBoxes = new ArrayList<JComboBox<String>>();
		JComboBox<String> actionBox = new JComboBox<String>();
		AutoCompleteDecorator.decorate(actionBox);
		actionBoxes.add(actionBox);
		actionPanel1.add(actionBox, ParagraphLayout.NEW_PARAGRAPH);

		add(idLabel, ParagraphLayout.NEW_PARAGRAPH);
		add(idText);
		add(genIdButt);
		add(eventLabel, ParagraphLayout.NEW_PARAGRAPH);
		add(eventScroll);
		add(actionLabel, ParagraphLayout.NEW_PARAGRAPH_TOP);
		add(actionPanel1);
		add(Box.createRigidArea(new Dimension(15, 0)));
		add(actionPanel2);
		add(Box.createRigidArea(new Dimension(190, 10)), ParagraphLayout.NEW_LINE);
		add(Box.createRigidArea(new Dimension(187, 0)), ParagraphLayout.NEW_LINE);
		add(okButt);

		addActionButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> ab = new JComboBox<String>();
				AutoCompleteDecorator.decorate(ab);
				actionBoxes.add(ab);
				actionPanel1.add(ab, ParagraphLayout.NEW_PARAGRAPH);
				if (actionBoxes.size() > 2)
					setSize(getWidth(), getHeight() + 26);
				revalidate();
			}
		});

		removeActionButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (actionBoxes.size() > 1) {
					actionPanel1.remove(actionBoxes.remove(actionBoxes.size() - 1));
					if (actionBoxes.size() >= 2)
						setSize(getWidth(), getHeight() - 26);
					revalidate();
				}
			}
		});

		setVisible(true);
	}

	public EventFrame() {
		this(null, null, null);
	}
}
