package 시험;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		
		
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(100);
		RemoteControl.changeBattery();
		remoteControl.turnOff();	

	}
	
}	
