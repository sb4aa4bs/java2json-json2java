package snippet;

import java.util.Arrays;

public class Cart {
	@Override
	public String toString() {
		return "Cart [id=" + id + ", items=" + Arrays.toString(items) + ", total=" + total + "]";
	}
	String id;
	Items items[] = new Items[2];
	String total;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Items[] getItems() {
		return items;
	}
	public void setItems(Items[] items) {
		this.items = items;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
}
