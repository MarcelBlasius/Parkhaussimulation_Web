package produktionscode;

public class Parkhaus implements ParkhausIF {
	private int freieParkplaetzeKunden;
	private int freieParkplaetzeFrauen;
	private int freieParkplaetzeBehinderte;
	
	public Parkhaus(int freieParkplaetzeKunden, int freieParkplaetzeFrauen,int freieParkplaetzeBehinderte){
		this.freieParkplaetzeFrauen= freieParkplaetzeFrauen;
		this.freieParkplaetzeBehinderte=freieParkplaetzeBehinderte;
		this.freieParkplaetzeKunden=freieParkplaetzeKunden;
	}
	public void ParkhausAendern(int freieParkplaetzeKunden, int freieParkplaetzeFrauen,int freieParkplaetzeBehinderte){
		this.freieParkplaetzeFrauen= freieParkplaetzeFrauen;
		this.freieParkplaetzeBehinderte=freieParkplaetzeBehinderte;
		this.freieParkplaetzeKunden=freieParkplaetzeKunden;
	}
	public int getfreieParkplaetzeKunden() {
		return freieParkplaetzeKunden;
	}
	public int getfreieParkplaetzeFrauen() {
		return freieParkplaetzeFrauen;
	}

	public int getfreieParkplaetzeBehinderte() {
		return freieParkplaetzeBehinderte;
	}
	
	public void setfreieParkplaetzeKunden(int freieParkplaetzeKunden) {
		this.freieParkplaetzeKunden=freieParkplaetzeKunden;
	}
	public void setfreieParkplaetzeFrauen(int freieParkplaetzeFrauen) {
		this.freieParkplaetzeFrauen= freieParkplaetzeFrauen;
	}
	public void setfreieParkplaetzeBehinderte(int freieParkplaetzeBehinderte) {
		this.freieParkplaetzeBehinderte= freieParkplaetzeBehinderte;
		
	}
}