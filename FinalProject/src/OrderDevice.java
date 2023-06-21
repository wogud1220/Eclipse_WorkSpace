
public class OrderDevice implements OrderNumber{
	private static int orderNumber = 0;
	
	@Override
	public int getOrderNumber() {
		if(orderNumber > 100) {
			orderNumber = 1;
		} else {
			orderNumber++;
		}
		return orderNumber;
	}
}
