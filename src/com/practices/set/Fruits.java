package com.practices.set;

public class Fruits {

	private int fid;
	private String name;
	private String color;

	public Fruits() {

	}

	public Fruits(int fid, String name, String color) {
		super();
		this.fid = fid;
		this.name = name;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + fid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Fruits))
			return false;
		Fruits other = (Fruits) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (fid != other.fid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fruits [fid=" + fid + ", name=" + name + ", color=" + color + "]";
	}

}
