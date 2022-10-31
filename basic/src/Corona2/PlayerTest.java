package Corona2;

abstract class Player{
	protected boolean pause; // 일시정지 상태를 저장하기 위한 변수
	protected int currentPos; // 현재 play되고 있는 위치를 저장하기 위한 변수
	
	Player(){
		this.pause = false;
		this.currentPos=0;
	}
	
	/**
	 *지정된 위치(Pos)에서 재생을 시작하는 기능이 수행되도록 작성해야 한다
	 */
	abstract void play(int pos);
	
	/**
	 * 재생을 즉시 멈추는 기능을 수행하도록 작성되어야 한다
	 */
	
	abstract void stop();
	
	public void play() {
		play(currentPos);
	}
	
	void pause() {
		if(pause) {
			pause = false;
			play(currentPos);
		}else {
			pause = true;
			stop();
		}
	}
}

class CDplayer extends Player{
	//추상 메서드 구현
	public void play(int currentPos) {
		System.out.println(currentPos + " 위치에서 재생을 시작한다.");
	}
	
	public void stop() {
		System.out.println("재생을 즉시 멈춘다");
	}
	
	//추가로 정의된 멤버
	private int currentTrack; //현재 재생중인 트랙

	public void nextTrack() {
		currentTrack++;
	}
	
	public void preTrack() {
		if(currentTrack>1) {
			currentTrack--;
		}
	}
}

public class PlayerTest {
	public static void main(String[] args) {
		CDplayer cd = new CDplayer();
		cd.play();
		cd.pause();
		
		cd.pause();
		cd.stop();

	}

}
