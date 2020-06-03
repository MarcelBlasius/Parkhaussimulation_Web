package produktionscode;

import java.time.Instant;

public interface ParkhauskundeIF {
	
	public Instant getEinfahrtszeit();
	
	public void einfahren();
	
	public void ausfahren();
	
	public String getParkplatz();
}