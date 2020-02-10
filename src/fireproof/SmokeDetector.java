package fireproof;

public class SmokeDetector {
	private int roomsAvailable;
	private Room[] rooms;
	private float threshold;
	

	public SmokeDetector() {
		rooms = new Room[100];
		setThreshold(100);
		roomsAvailable=100;
	}

	public SmokeDetector(float t) {
		rooms = new Room[100];
		setRoomsAvailable(100);
		setThreshold(t);
	}
	
	public SmokeDetector(SmokeDetector sD) {
		setRooms(sD.getRooms());
		setThreshold(sD.getThreshold());
		setRoomsAvailable(sD.getRoomsAvaible());
		
	}
	
	public boolean addRoomToBeMonitored(Room r) {
		if(roomsAvailable==0) {
			return false;
		}
		
		rooms[100-roomsAvailable] = r;
		
		roomsAvailable=roomsAvailable-1;
		return true;
	}
	
	public boolean checkAlarm(float smokeLevel) {
		if (smokeLevel>threshold) {
			System.out.println((rooms.length-roomsAvailable) + " rooms are at risk.");
			for(int i=0;i<(100-roomsAvailable);i++) {
					System.out.println("Room :"+ rooms[i].getName() + " is at risk");			
			}
			return true;
		}
		System.out.println(100-roomsAvailable + " rooms are safe.");
		return false;
	}
	
	
	public void setRoomsAvailable(int rA) {
		roomsAvailable=rA;
	}
	
	public int getRoomsAvaible() {
		return roomsAvailable;
	}
	
	public Room[] getRooms() {
		return rooms;
	}
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	public float getThreshold() {
		return threshold;
	}
	public void setThreshold(float threshold) {
		this.threshold = threshold;
	}
	
	
	
}
