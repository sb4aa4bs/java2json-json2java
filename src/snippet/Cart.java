package snippet;

public class Cart {
	String id;
	Items items;
	String total;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
}
