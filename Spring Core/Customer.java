package AssignmentQ1;

public class Customer {
	
	private String customerId, customerName, customerContact;
	private Address CustomerAddress;

	public Customer(String customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		CustomerAddress = customerAddress;
	}

	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	
	public Address getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		CustomerAddress = customerAddress;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", CustomerAddress=" + CustomerAddress + "]";
	}

}
