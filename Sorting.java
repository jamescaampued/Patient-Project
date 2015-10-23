class Sorting{
	
	PatientProject[] array;
	
	public Sorting(int size){
		array = new PatientProject[size];
	}
	 
	public void insert(int index, String fname, String lname, int age, String address){
		array[index] = new PatientProject(fname, lname, age, address);
	}
	 
	public void sort(){
		PatientProject temp;
		for(int x = 0; x < array.length -1; x++){
			for(int y = 0; y < array.length -1; y++){
				if(array[y].getAge() > array[y + 1].getAge()){
					temp =  array[y];
					array[y] = array[y+1];
					array[y+1] = temp;
				}
			}
		}
	}
	
	public void display(){
		for(int x = 0; x < array.length; x++){
		System.out.println("Fullname: " + array[x].getFullname());
		System.out.println("Age: " + array[x].getAge());
		System.out.println("Address: " + array[x].getAddress());
		
		System.out.println();
		}
	}
}