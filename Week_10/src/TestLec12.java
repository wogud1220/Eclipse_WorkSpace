import java.io.IOException;

public class TestLec12 {

	public static void main(String[] args) {
		try {
			System.out.println(readString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static String readString() throws IOException {// 외부에 보내줄 수 있도록 throws
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오:");
		System.in.read(buf);
		// throw IOException;
		return new String(buf);
	}
}