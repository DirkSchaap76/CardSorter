package cards;

public class Card {
	private String color;
	private int value;
	// default fields
	public final int DEFAULT_VALUE = 6;
	public final String DEFAULT_COLOR = "black";

	// constructors
	public Card() {
		System.out.println("Empty constructor");
	}

	public Card(int valueIn) {
		this.value = valueIn;
		System.out.println("value is: " + valueIn);
		System.out.println("No color entered. Color set to default. " + this.DEFAULT_COLOR);

	}

	public Card(String colorIn) {
		this.color = colorIn;
		System.out.println("No value entered. Value set to default: " + this.DEFAULT_VALUE);
		System.out.println("Color is: " + colorIn);

	}

	public Card(int valueIn, String colorIn) {
		this.value = valueIn;
		this.color = colorIn;
		System.out.println("The value of this card is: " + valueIn + " ,the color of this card is: " + colorIn);

	}

	// getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
