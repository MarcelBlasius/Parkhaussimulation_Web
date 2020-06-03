package produktionscode;

public class Ampel implements AmpelIF{
	Parkhaus Haus;
	private String Farbe = "Rot";
	
	public  Ampel(int Gelb,int Gruen ,Parkhaus Haus) throws Exception {
		this.Haus= Haus;
		int tmp= Haus.getfreieParkplaetzeKunden();
		if(Gruen>=Gelb) {
			if(Gruen <= tmp) {
				Farbe = "Gr�n";
			}else {
				if(Gelb <=tmp) {
					Farbe ="Gelb";
				}else {
					Farbe ="Rot";
				}
			}
		}else {
			throw new Exception(); 
		}
	}
	public void SetFarbeGrenze(int Gelb,int Gruen  ) throws Exception {
		int tmp= Haus.getfreieParkplaetzeKunden();
		if(Gruen>=Gelb) {
			if(Gruen <= tmp) {
				Farbe = "Gr�n";
			}else {
				if(Gelb <=tmp) {
					Farbe ="Gelb";
				}else {
					Farbe ="Rot";
				}
			}
		}else {
			throw new Exception(); 
		}
	}

	public String getFarbe(Parkhaus haus) {
		
		return Farbe;
		
	}
}