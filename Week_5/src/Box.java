public class Box {
	int width, length, height;
	int volume;

	Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume = w * l * h;
	}

	Box whosLargest(Box box1, Box box2) { //부피 비교 함수
		if (box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}

	public boolean isSameBox(Box box1, Box box2) {//매개변수로 2박스 넣어서 비교 해보기
		if (box1.width == box2.width && box1.length == box2.length && box1.height == box2.height)
			return true;
		else
			return false;
	}

	public boolean isSameBox_1(Box obj) {	//box2를 받음
		if (obj.width == this.width && obj.length == this.length && obj.height == this.height)
			return true; // this는 현재 객체 가르킴
		//박스2의 넓이 == 함수를 불러온 현재 객체인 obj1의 넓이 ~~~같다면
		
		else
			return false;
	}

}
