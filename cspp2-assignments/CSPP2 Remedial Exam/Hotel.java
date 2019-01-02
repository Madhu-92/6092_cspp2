public class Hotel {
	Reservation[] rooms;
	int size;
	// int rNum = 1;
	Reservation reserveObj;
	Hotel() {
		rooms = new Reservation[6];
		size = 1;
	}
	public int reserveRoom(String person) {
		int i;
		if (size == rooms.length) {
			System.out.println("All Rooms are reserved");
			return -1;
		}
		for (i = 1; i < rooms.length; i++) {
			if (rooms[i] == null) {
				rooms[i] = new Reservation(person, i);
				// reserveObj.setRoom(i);
				// rooms[i] = reserveObj;
				size++;
				break;
				
			}
		}
		
		return i;
	}

	public boolean reserveRoom(String person, int roomNum) {
		if (size == rooms.length) {
			System.out.println("All Rooms are reserved");
			return false;
		} if (rooms[roomNum] != null) {
			System.out.println("Room is already reserved");
		} if(rooms[roomNum] == null) {
			rooms[roomNum] = new Reservation(person, roomNum);
			// rooms[roomNum] = reserveObj;
			// rNum++;
			size++;
			return true;
		}
		return false;

	}

	public void printReservations() {
		for (int i = 1; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}
	}

	public void cancelReservations(String person) {
		for (int i = 1; i < size; i++) {
			if (rooms[i] != null) {
				if (rooms[i].getName().equals(person)) {
					rooms[i] = null;
					size--;
				}
			}
		}
	}
	public boolean buildRooms(int num) {
		Reservation[] temp = new Reservation[rooms.length + num];
		System.arraycopy(rooms, 0, temp, 0, rooms.length);
		rooms = temp;
		return true;
	}

}