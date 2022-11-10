package cm;

public class carprogram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum car{renault(2020),ferrari(2019),rollsroyce(2022);
		private int value;  
		private car(int value){  
		this.value=value;  
		}  
		}
		System.out.println("    Car Name\tModel Year");
		for(car c : car.values())
			System.out.println("    "+c+"\t"+c.value);
	}

}


