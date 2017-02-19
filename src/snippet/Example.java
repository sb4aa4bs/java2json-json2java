package snippet;

import java.util.HashMap;
import java.util.Map;

public class Example {

    @Override
	public String toString() {
		return "Example [message=" + message + ", error=" + error + ", orderdetails=" + orderdetails.toString()
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	private String message;
    private Integer error;
    private Orderdetails orderdetails;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public Orderdetails getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(Orderdetails orderdetails) {
        this.orderdetails = orderdetails;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
