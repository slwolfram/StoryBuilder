import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AppMain {

	public static GameModel model;

	public static void main(String[] args) {

		model = new GameModel();
		JFrame f = new JFrame();
		f.setTitle("ATOIT Storybuilder");

		JPanel menuPanel = new JPanel();
		JPanel eventPanel = createEventPanel();
		JPanel actionPanel = createActionPanel();
		JTabbedPane objectPane = createObjectPane();

		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(10, 10, 500, 525);
		tp.add("Menu", menuPanel);
		tp.add("Events", eventPanel);
		tp.add("Objects", objectPane);
		tp.add("Actions", actionPanel);
		f.add(tp);
		f.setSize(525, 575);
		f.setLayout(null);
		f.setVisible(true);

	}

	/*
	 * Creates the pane with the object/location/character tabs
	 */
	public static JTabbedPane createObjectPane() {

		JTabbedPane objectPane = new JTabbedPane();
		// tp.setBounds(10, 10, 500, 500);

		JPanel objectPanel = createTablePanel(model.getObjectDataAsArray(), model.objectColumns);
		JPanel locationPanel = createTablePanel(model.getLocationDataAsArray(), model.locationColumns);
		JPanel characterPanel = createTablePanel(model.getCharacterDataAsArray(), model.characterColumns);
		objectPane.add("Objects (generic)", objectPanel);
		objectPane.add("Locations", locationPanel);
		objectPane.add("Characters", characterPanel);

		return objectPane;
	}

	/*
	 * Creates the event tab
	 */
	public static JPanel createEventPanel() {
		JPanel eventPanel = createTablePanel(model.getEventDataAsArray(), model.eventColumns);
		return eventPanel;
	}

	/*
	 * Creates the action tab
	 */
	public static JPanel createActionPanel() {
		JPanel actionPanel = createTablePanel(model.getActionDataAsArray(), model.actionColumns);
		return actionPanel;
	}

	/*
	 * Creates panels for each tab with add/remove/edit buttons and tables
	 */
	public static JPanel createTablePanel(String[][] data, String[] columns) {
		JPanel panel = new JPanel();
		DefaultTableModel tableModel = new DefaultTableModel(data, columns);
        JTable table = new JTable( tableModel );
		JScrollPane scrollPane = new JScrollPane(table);
		JButton addButt = new JButton("Add");
		addButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (columns[0]) {			
				case "EventID":
					EventFrame  eventFrame = new EventFrame();		
					break;
				case "ObjectID":
					ObjectFrame objectFrame = new ObjectFrame();
					break;
				case "LocationID":
					LocationFrame locationFrame = new LocationFrame();
					break;
				case "CharacterID":
					CharacterFrame characterFrame = new CharacterFrame();
					break;
				case "ActionID":
					ActionFrame actionFrame = new ActionFrame();
					break;
				}
			}
		});
		panel.add(addButt);
		JButton removeButt = new JButton("Remove");
		removeButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1) {
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.removeRow(table.getSelectedRow());
				}
			}
		});
		panel.add(removeButt);
		JButton edit = new JButton("Edit");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (columns[0]) {			
				case "EventID":
					EventFrame  eventFrame = new EventFrame(null, null, null);		
					break;
				case "ObjectID":
					ObjectFrame objectFrame = new ObjectFrame(null, null, null);
					break;
				case "LocationID":
					LocationFrame locationFrame = new LocationFrame(null, null, null);
					break;
				case "CharacterID":
					CharacterFrame characterFrame = new CharacterFrame(null, null, null);
					break;
				case "ActionID":
					ActionFrame actionFrame = new ActionFrame(null, null, null);
					break;
				}
			}
		});
		panel.add(edit);
		panel.add(scrollPane);
		return panel;
	}
}
