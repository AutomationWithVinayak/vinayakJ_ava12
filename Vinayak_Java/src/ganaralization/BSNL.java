package ganaralization;

public class BSNL implements Sim_Card {

	@Override
	public void SMS() {
		System.out.println("bsnl -- sms");
		
	}

	@Override
	public void AudioCalling() {
		System.out.println("bsnl -- calls");
		
	}

	@Override
	public void Internet() {
		System.out.println("bsnl -- internet");
		
	}
	public void Netflix() {
		System.out.println("bsnl -- netflix");
	}
	
	

}
