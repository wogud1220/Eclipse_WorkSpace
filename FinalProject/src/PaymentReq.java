
public interface PaymentReq {
	public final int RES_WAIT = 0;	//상수
	public final int RES_FAIL = 1;
	public final int RES_SUCCESS = 2;
	
	public abstract boolean sendPaymentReq(int numCard, int dateYYExpired, int dataMMExpired);
	//카드번호를 기반으로 요청
	//
	
	
	
	public abstract int receivePaymentRes();
}
