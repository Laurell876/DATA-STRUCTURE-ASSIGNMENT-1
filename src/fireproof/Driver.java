package fireproof;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r = new Room();
		r.setName("Lab C");
		r.setCapacity(23);
		Room r2 = new Room(30,"Lab D");
		SmokeDetector sD = new SmokeDetector(50);
		
		sD.addRoomToBeMonitored(r);
		sD.addRoomToBeMonitored(r2);
		
		sD.checkAlarm(75);
		sD.checkAlarm(33);
		
	}

}
