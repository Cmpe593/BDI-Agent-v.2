package bdiagent;

public class OtherAgents {
	private int id;
	private int mytrust;
	public OtherAgents(int id){
		this.id=id;
	}
	public OtherAgents(int id,int mytrust){
		this.id=id;
		this.mytrust=mytrust;
	}
	public void setTrust(int value) {
		this.mytrust=value;
	}
	public int getID() {
		return this.id;
	}
}
