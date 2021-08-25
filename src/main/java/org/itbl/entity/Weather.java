package org.itbl.entity;

public class Weather {
	
	private String name;
	private Main main;
	private Sys sys;
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Weather(String name, Main main, Sys sys) {
		super();
		this.name = name;
		this.main = main;
		this.sys = sys;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	@Override
	public String toString() {
		return "Weather [name=" + name + ", main=" + main + ", sys=" + sys + "]";
	}
	
	
	




	
	
}
