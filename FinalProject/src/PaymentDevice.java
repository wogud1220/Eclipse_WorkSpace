
public class PaymentDevice implements PaymentReq{
	private int delay = 0; 
	//결제버튼 눌렀을 때 선택
	
	
	
	@Override
	public boolean sendPaymentReq(int numCard, int dateYYExpired, int dataMMExpired){
		delay = dateYYExpired;
		if(numCard % 2 == 1) {
			return false;	//홀수면 잘못된 값, false반환
		}  
		else if(dateYYExpired < 23) {//기한 지난 거
			return false;
		}
		else if(dateYYExpired == 23 && dataMMExpired < 6) {//기한 지난고 6월 아래인거
			return false;
		}
		else {
			return true;
		}
	}
	@Override
	public int receivePaymentRes() {
		if(delay--<0) {	//현재 년도가 들어감 22,21로 비교
			return RES_SUCCESS;//종료
		}
		else {
			return RES_WAIT;	//계속 불러옴
		}
	}
}
