package fireproof;

public class Room {
	private int capacity;
	private String name;
	
	public Room() {
		setCapacity(0);
		setName("placeholder name");
	}
	
	
	public Room(int c, String n) {
		setCapacity(c);
		setName(n);
	}
	
	public Room(Room r) {
		setCapacity(r.capacity);
		setName(r.name);
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: "+ name + ", Capacity: " + capacity);
	}
	
}
