class PatientClass{
	public static void main(String[] args){
		
		Sorting cj = new Sorting(5);
		
		cj.insert(0, "Charito", "Santos", 23, "Abra" );
		cj.insert(1, "Heiko", "Melendez", 33, "Naga" );
		cj.insert(2, "Sharon", "Cuneta", 30, "Manila" );
		cj.insert(3, "Jestonni", "Alarcon", 35, "Marikina" );
		cj.insert(4, "Jericho", "Rosales", 31, "Quezon City" );
		
		System.out.print("*********PATIENTS*********");
		System.out.print("\n\nList Before Sort:\n");
		System.out.println();
		cj.display();
		
		cj.sort();
		System.out.print("\nList After Sort:\n");
		System.out.println();
		cj.display();
		
	}
}