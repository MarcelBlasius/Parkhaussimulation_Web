package produktionscode;

import java.time.Instant;

public interface KassenautomatIF {
	void setPrize(float prize);
	float getPrize();
	Instant getTime();
	float aufenthaltsdauer(Instant startzeit);
	float calculatePrize(float dauer);
	
}