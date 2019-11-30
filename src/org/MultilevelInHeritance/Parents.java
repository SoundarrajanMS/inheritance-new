package org.MultilevelInHeritance;

public class Parents extends Grandparents  {

	 
	
	 

public void hobby() {
System.out.println("Parent Hobby - riding bike");
	

}
public void enjoys() {
	System.out.println("Parent enjoys - Listineng to the Music ");




	

}

	public void examples(int b) {
	System.out.println("example-"+b);
	
	}
public static void main(String[] args) {
	Parents p = new Parents();
	p.examples(01);

	p.eatingHabits();
	p.enjoys();
	p.hobby();
	p.occupation();
	
	
	
	

}
public void eatingHabits() {
	System.out.println("sss");
	
}
@Override
public void occupation() {
	// TODO Auto-generated method stub
	
}
}

