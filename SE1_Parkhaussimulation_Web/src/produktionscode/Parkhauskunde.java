package produktionscode;

import java.time.Instant;

public abstract class Parkhauskunde implements ParkhauskundeIF{
	
	private Instant einfahrtszeit;
	
	public Parkhauskunde() {
	}
	
	public Instant getEinfahrtszeit() {
		return einfahrtszeit;
	}

	
	public void einfahren() {
		this.einfahrtszeit = Instant.now();
	}

	public void ausfahren() {
		einfahrtszeit = null;
	}

	public String getParkplatz() {
		return null;
	}

}