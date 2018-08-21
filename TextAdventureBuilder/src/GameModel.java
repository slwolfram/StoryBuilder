import java.util.ArrayList;

public class GameModel {

	final String eventColumns[] = { "EventID", "EventText", "EventActions", "Description" };
	private ArrayList<String[]> eventData;
	final String actionColumns[] = { "ActionID", "ActionName", "ActionType", "ActionRegex", "Description" };
	private ArrayList<String[]> actionData;
	final String objectColumns[] = { "ObjectID", "ObjectName", "ObjectActions", "ObjectRegex", "Description" };
	private ArrayList<String[]> objectData;
	final String locationColumns[] = { "LocationID", "LocationName", "LocationActions", "LocationObjects",
			"LocationRegex", "Description" };
	private ArrayList<String[]> locationData;
	final String characterColumns[] = { "CharacterID", "CharacterName", "CharacterActions", "CharacterObjects",
			"CharacterRegex", "Description" };
	private ArrayList<String[]> characterData;

	public GameModel() {
		eventData = new ArrayList<String[]>();
		for (int i = 0; i < 50; i++)
			eventData.add(new String[] { "", "", "", "" });
		actionData = new ArrayList<String[]>();
		for (int i = 0; i < 50; i++)
			actionData.add(new String[] { "", "", "", "", "" });
		objectData = new ArrayList<String[]>();
		for (int i = 0; i < 50; i++)
			objectData.add(new String[] { "", "", "", "", "" });
		locationData = new ArrayList<String[]>();
		for (int i = 0; i < 50; i++)
			locationData.add(new String[] { "", "", "", "", "", "" });
		characterData = new ArrayList<String[]>();
		for (int i = 0; i < 50; i++)
			characterData.add(new String[] { "", "", "", "", "", "" });
	}

	public ArrayList<String[]> getEventData() {
		return eventData;
	}

	public String[][] getEventDataAsArray() {
		return convertToArray(eventData);
	}

	public void setEventData(ArrayList<String[]> eventData) {
		this.eventData = eventData;
	}

	public ArrayList<String[]> getActionData() {
		return actionData;
	}

	public String[][] getActionDataAsArray() {
		return convertToArray(actionData);
	}

	public void setActionData(ArrayList<String[]> actionData) {
		this.actionData = actionData;
	}

	public ArrayList<String[]> getObjectData() {
		return objectData;
	}

	public String[][] getObjectDataAsArray() {
		return convertToArray(objectData);
	}

	public void setObjectData(ArrayList<String[]> objectData) {
		this.objectData = objectData;
	}

	public ArrayList<String[]> getLocationData() {
		return locationData;
	}

	public String[][] getLocationDataAsArray() {
		return convertToArray(locationData);
	}

	public void setLocationData(ArrayList<String[]> locationData) {
		this.locationData = locationData;
	}

	public ArrayList<String[]> getCharacterData() {
		return characterData;
	}

	public String[][] getCharacterDataAsArray() {
		return convertToArray(characterData);
	}

	public void setCharacterData(ArrayList<String[]> characterData) {
		this.characterData = characterData;
	}

	public String[][] convertToArray(ArrayList<String[]> list) {
		String[][] array = new String[list.size()][list.get(0).length];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
}