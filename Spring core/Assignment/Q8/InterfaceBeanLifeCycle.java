package AssignmentQ8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceBeanLifeCycle implements DisposableBean, InitializingBean {

	private double price;

    public InterfaceBeanLifeCycle() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Interface Price: {" +
                "price=" + price +
                '}';
    }

    public void init() throws Exception {
        System.out.println("Calling init method using interface");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Calling destroy method using interface");
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
