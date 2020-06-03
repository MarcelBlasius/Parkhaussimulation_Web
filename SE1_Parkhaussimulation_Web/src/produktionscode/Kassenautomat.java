package produktionscode;

import java.time.Duration;
import java.time.Instant;

public class Kassenautomat implements KassenautomatIF{

	float prize;
	
	
	public Kassenautomat (float prize) {
		this.prize = prize;
	}
	
	public void setPrize(float prize) {
		this.prize = prize;
		
	}
	
	public float getPrize() {
		return prize;
	}

	public Instant getTime() {
		return Instant.now();
	}


	public float aufenthaltsdauer(Instant startzeit) {
		Duration dauer =  (Duration.between(startzeit, getTime()));
		return ((float)(dauer.toMinutes()));
			}
	
	public float calculatePrize(float dauer) {
		return  (dauer * prize);

	}

	
}