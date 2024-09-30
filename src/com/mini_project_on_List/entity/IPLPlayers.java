package com.mini_project_on_List.entity;

public class IPLPlayers {
	

	private String name;
	private String tname;
	private int runs;
	private int weickets;
	private int jcnum;
	
	public IPLPlayers() {
		super();
	}

	public IPLPlayers(String name, String tname, int runs, int weickets, int jcnum) {
		super();
		this.name = name;
		this.tname = tname;
		this.runs = runs;
		this.weickets = weickets;
		this.jcnum = jcnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWeickets() {
		return weickets;
	}

	public void setWeickets(int weickets) {
		this.weickets = weickets;
	}

	public int getJcnum() {
		return jcnum;
	}

	public void setJcnum(int jcnum) {
		this.jcnum = jcnum;
	}

	@Override
	public String toString() {
		return "IPLPlayers [name=" + name + ", tname=" + tname + ", runs=" + runs + ", weickets=" + weickets
				+ ", jcnum=" + jcnum + "]";
	}
	
	

}
