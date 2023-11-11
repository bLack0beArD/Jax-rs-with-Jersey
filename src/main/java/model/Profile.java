package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
    
	private  String name;
	private   int id;

	public Profile(int id,String name) {

		this.name = name;
		this.id = id;
	}

	public Profile () {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
