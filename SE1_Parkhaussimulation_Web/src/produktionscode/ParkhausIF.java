package produktionscode;

public interface ParkhausIF {
	
	public int getfreieParkplaetzeKunden();
	public int getfreieParkplaetzeFrauen();
	public int getfreieParkplaetzeBehinderte();
	public void setfreieParkplaetzeKunden(int freieParkplaetzeKunden);
	public void setfreieParkplaetzeFrauen(int freieParkplaetzeFrauen);
	public void setfreieParkplaetzeBehinderte(int freieParkplaetzeBehinderte);
}