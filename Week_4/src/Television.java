
public class Television {
	int channel=10;
	int volume=20;
	boolean onOff;
	
	
	Television(){
		channel=11;
		volume=12;
	}	//생성자의 오버로딩
	Television(int ch,int vo){
		 this.channel=ch;
		 this.volume=vo;
	}
	
	
	int getChannel() {
		return channel;
	}

	void setChannel(int ch) {
		channel = ch;
	}

	void print() {
		System.out.println("채널은" + channel + " 볼륨은" + volume);
	}

}
