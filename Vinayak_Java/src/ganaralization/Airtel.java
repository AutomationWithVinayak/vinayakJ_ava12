package ganaralization;

public class Airtel implements Sim_Card {

	@Override
	public void SMS() {
		System.out.println("airtel -- sms");
		
	}

	@Override
	public void AudioCalling() {
       System.out.println("airtel -- Calls");		
	}

	@Override
	public void Internet() {
       System.out.println("airtel -- net");		
	}

	public void Hotstrar() {
		System.out.println("airtel -- hotstar");
	}
}
