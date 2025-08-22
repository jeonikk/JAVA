package Ch06;

interface Remocon {
	int MAX_VOL=100;
	int MIN_VOL=0;
	
	void setVolumn(int vol);
	
	void powerOn();		//추상 메서드
	void powerOff();	//추상 메서드
}

interface Browser{
	void serchURL(String url);
}

class TV implements Remocon{
	private int nowvol;
	@Override
	public void powerOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolumn(int vol) {
		if(vol>MAX_VOL) {
			vol=MAX_VOL;
			System.out.println("TV 볼륨을 최대볼륨으로 설정합니다.");
		}else if(vol<MIN_VOL){
			vol=MIN_VOL;
			System.out.println("TV 볼륨을 최소볼륨으로 설정합니다.");
		}else {
			this.nowvol=vol;
			System.out.println("TV 현재 볼륨 : "+this.nowvol);
		}
		
	}
	
}
class SmartTV extends TV implements Browser
{

	@Override
	public void serchURL(String url) {
		System.out.println(url + "로 이동합니다");
	}
	
}

class Radio implements Remocon{
	private int nowvol;
	@Override
	public void powerOn() {
		System.out.println("라디오를 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("라디오를 끕니다.");
		
	}

	@Override
	public void setVolumn(int vol) {
		if(vol>MAX_VOL) {
		vol=MAX_VOL;
		System.out.println("라디오 볼륨을 최대볼륨으로 설정합니다.");
		}else if(vol<MIN_VOL) {
			vol=MIN_VOL;
			System.out.println("라디오 볼륨을 최소볼륨으로 설정합니다.");
		}else {
			this.nowvol=vol;
			System.out.println("라디오 현재 볼륨 : "+this.nowvol);
		}
	}
	
}


public class C03InterfaceMain {

	public static void TurnOn(Remocon controller)// TV/라디오 객체 연결 
						// Remocon controller = new TV 상위 클래스에서 하위클래스 연결
	{ 
		controller.powerOn();
	}
	
	public static void TurnOff(Remocon controller) 
	{
		controller.powerOff();
	}
	
	public static void ChangeVolumn(Remocon controller,int vol)
	{
		controller.setVolumn(vol);
	}
	
	public static void Internet(Browser browser,String url)
	{
		browser.serchURL(url);
	}
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartTV smartTv = new SmartTV();
		
		Radio radio = new Radio();
		
		TurnOn(tv);
		TurnOn(radio);
		
		Internet(smartTv,"www.naver.com");
		ChangeVolumn(tv,101);
		ChangeVolumn(tv,70);
		ChangeVolumn(radio,50);
		ChangeVolumn(radio,-20);
		
		TurnOff(tv);
		TurnOff(radio);
		
		
//		tv.powerOn();
//		radio.powerOn();

	}

}
