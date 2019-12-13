package tlz;

import java.lang.reflect.Array;

public class BreadMaker extends Thread {
	private BreadPlate bread = null;
	
	public BreadMaker() {}
	
	public BreadMaker(BreadPlate bread) {
		setBread(bread);
	}
	
	public BreadPlate getBread() {
		return bread;
	}
	
	public void setBread(BreadPlate bread) {
		this.bread = bread;
	}
	
	@Override
	public void run() {
		for (int i = 0; i< 21; i++) {
			bread.makeBread();
			try {
				sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("오늘 분량의 빵을 모두 만들었습니다 .");
	}

}
