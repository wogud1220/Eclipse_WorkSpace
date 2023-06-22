
public class Kiosk {
	
	
	
	private OrderNumber numberDev;
	private PaymentReq payDev;
	private PurchaseOrder posDev;
	
	
	public Kiosk(OrderNumber numberDev,PaymentReq payDev,PurchaseOrder posDev) {
		/*numberDev=new OrderDevice();
		payDev =new PaymentDevice();
		posDev=new PosDevice();		메인에서 활성화 안 하면 매개변수 지우고 이거사용*/
		
		
		this.numberDev=numberDev;
		this.payDev = payDev;
		this.posDev=posDev;
		
		
		boolean res = payDev.sendPaymentReq(1233, 23, 10);//기한이 안 맞도록, false가 나올것 
		System.out.println(res);//false 출력
		
		
		
		for(int i=0;i<50;i++) {
			int num=numberDev.getOrderNumber();//이렇게 하면 함수호출
			//번호표 출력 시점은 맨 마지막 
			//결제가 완료되었을때
			
			System.out.println(num);
			
			if(payDev.receivePaymentRes() == PaymentReq.RES_WAIT){
				continue;
			}
			else if(payDev.receivePaymentRes()== PaymentReq.RES_SUCCESS) {
				System.out.println("success");
				break;}
		
		
		}//for 문
	
		
		
		
		posDev.sendOrder(numberDev.getOrderNumber(),"아메리카노",3);	
		//여기 부분은 오더 아메리카노는 포스 디바이스->센드오더 호출될때
	}	//포스기 만드는 사람이 사용
	
	public static void main(String[] args) {
		
		OrderDevice numberDev=new OrderDevice();
		PaymentDevice payDev =new PaymentDevice();
		PosDevice posDev=new PosDevice();	//원래 여기있어야함
		
		Kiosk kio=new Kiosk(numberDev,payDev,posDev);//10까지 출력됨
	}

}
