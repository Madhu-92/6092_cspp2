public class Hotel {
	Reservation[] rooms;
	int size;
	int rNum = 1;
	Reservation reserveObj;
	Hotel() {
		rooms = new Reservation[5];
		size = 0;
	}
	public int reserveRoom(String person) {
		if (size == rooms.length) {
			System.out.println("All Rooms are reserved");
		}
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == null) {
				reserveObj = new Reservation(person);
				reserveObj.setRoom(i + 1);
				rooms[i] = reserveObj;
				size++;
				return i + 1;
			}
		}
		return -1;
	}

	public boolean reserveRoom(String person, int roomNum) {
		if (size == rooms.length) {
			System.out.println("All Rooms are reserved");
		} else if (rooms[roomNum - 1] == null) {
			reserveObj = new Reservation(person, roomNum);
			rooms[roomNum  - 1] = reserveObj;
			rNum++;
			size++;
			return true;
		} else if (rooms[roomNum - 1] != null) {
			System.out.println("Room is already reserved");
		}
		return false;
	}

	public void printReservations() {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}
	}

	public void cancelReservations(String person) {
		for (int i = 0; i < size; i++) {
			if (rooms[i] != null) {
				if (rooms[i].getName().equals(person)) {
					rooms[i] = null;
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