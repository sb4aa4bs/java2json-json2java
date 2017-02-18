package snippet;

public class Checkout {
	Cart cart;
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart myCart) {
		this.cart = myCart;
	}
	@Override
	public String toString() {
		return "Checkout [cart=" + cart + ", cust=" + cust + "]";
	}
	public Customers getCust() {
		return cust;
	}
	public void setCust(Customers cust) {
		this.cust = cust;
	}
	Customers cust;

}
