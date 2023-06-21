
public class OrderDevice implements OrderNumber{
	private static int orderNumber = 0;
	/*임플리먼트해서
	 * 공통된 인트값 사용 
	 * 1씩 증가해서 리턴
	 * 100을 넘어서면 1로 초기화
	 * 1,2,3,4,5,```99,100 1,2,3,
	 */
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
