package snippet;

import java.util.HashMap;
import java.util.Map;

public class Orderdetails {

    @Override
	public String toString() {
		return "Orderdetails [orderid=" + orderid + ", additionalProperties=" + additionalProperties + "]";
	}

	private Integer orderid;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
