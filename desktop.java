package org.system;

public class desktop extends Computer{
	public void desktopsize(int i) {
	 System.out.println("size is " +i);
	}
	
	public static void main(String[] args) {
		desktop c=new desktop();
		c.computermodel("dell");
		c.desktopsize(36);
	}

}
