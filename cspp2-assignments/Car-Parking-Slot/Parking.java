public class Parking {
	String name;
	int size;
	Slot[] slot;
	Slot slotObj;

	Parking(int size) {
		size = 0;
		slot = new Slot[10];
	}

	public int carsCount() {
		return size;
	}
	public void clearSlots() {
		slot = new Slot[0];
		size = 0;
	}
	public void removeFromSlot(String name) {
		for (int i = 0; i < size; i++) {
			if (slot[i] != null) {
				if (slot[i].getName().equals(name)) {
					slot[i] = null;
					size--;
				}
			}
		}
	}
	public int getEmptySlots() {
		int count = 0;
		for (int i =0; i < slot.length; i++) {
			if (slot[i] == null) {
				count++;
				
			}
		}
		System.out.println(count);
		return count;
	}
	public int addToSlot(Slot s1) {
		for (int i = 0; i < slot.length; i++) {
			if (slot[i] == null) {
				s1.toString();
				slot[i] = s1;
				size++;
				return i;
			}
			
		}
		return -1;
	}
	public Slot getSlot(String name) {
		for (int i = 0; i < size; i++) {
			if (slot[i] != null) {
				if (slot[i].getName().equals(name)) {
					return slot[i];
				}
			}
		}
		return null;
	}

	
}