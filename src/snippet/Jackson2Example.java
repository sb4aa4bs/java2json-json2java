package snippet;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson2Example {

	public static void main(String[] args) {
		Jackson2Example obj = new Jackson2Example();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		Checkout checkout = createDummyObject();

		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("C:\\Users\\prokarma\\PRO-Pro\\SOURCES\\Open Sources\\java2json\\src\\snippet\\staff.json"), checkout);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(checkout);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(checkout);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Checkout createDummyObject() {

		Checkout checkout = new Checkout();
		Cart cart = new Cart();
		cart.setId("1234");
		Items item1 = new Items();
		item1.setId("4321");
		item1.setPrice("150");
		item1.setPrice("10%");
		cart.setItems(item1);
		cart.setTotal("150");
		Customers customer = new Customers();
		customer.setEmail("bharath.softy@gmail.com");
		customer.setFirstname("Bharath");
		customer.setLastname("Kandaswamy");
		customer.setPhone("4023213729");
		checkout.setCart(cart);
		checkout.setCust(customer);
		return checkout;

	}

}