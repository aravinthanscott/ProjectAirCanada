package org.univ;

public class College extends University{
@Override
public void ug() {
System.out.println("OVERRIDE UG");	
}
@Override
public void pg() {
System.out.println("OVERRIDE PG");	
	}
public static void main(String[] args) {
	College c= new College();
	c.ug();
	c.pg();
	System.out.println("Haii");
	System.out.println("hello");
}
}
