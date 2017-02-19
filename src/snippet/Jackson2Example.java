package snippet;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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
			mapper.writeValue(
					new File(
							"C:\\Users\\prokarma\\PRO-Pro\\SOURCES\\Open Sources\\java2json\\src\\snippet\\generated-json.json"),
					checkout);
			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(checkout);
			//System.out.println(jsonInString);
			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(checkout);
			System.out.println("Input Java Object :::: " +checkout.toString());
			System.out.println("Output JSON :::: " +jsonInString);
			// System.out.println(checkout.toString());

			// JSON from file to Object
			File inputJsonFile = new File(
					"C:\\Users\\prokarma\\PRO-Pro\\SOURCES\\Open Sources\\java2json\\src\\snippet\\source-json-to-convert.json");
			Example example = mapper.readValue(inputJsonFile, Example.class);
			InputStream input = new BufferedInputStream(new FileInputStream(inputJsonFile));
			byte[] buffer = new byte[8192];

			try {
			    for (int length = 0; (length = input.read(buffer)) != -1;) {
			    	System.out.println("Input JSON :::: ");
			        System.out.write(buffer, 0, length);
			    }
			} finally {
			    input.close();
			}
			//System.out.println("Input JSON :::: " +buffer.hashCode());
			System.out.println("\nOutput Java Object :::: " +example.toString());
			// JSON from URL to Object
			// Staff obj = mapper.readValue(new
			// URL("http://mkyong.com/api/staff.json"), Staff.class);
			// JSON from String to Object
			// Example obj = mapper.readValue(jsonInString, Staff.class);

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
		Items item[] = new Items[2];
		for (int i = 0; i < item.length; i++) {
			item[i] = new Items();
			item[i].setId("4321");
			item[i].setPrice("150");
			item[i].setPrice("10%");
		}
		/*
		 * item[1].setId("4321"); item[1].setPrice("150");
		 * item[1].setPrice("10%");
		 */
		cart.setItems(item);
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