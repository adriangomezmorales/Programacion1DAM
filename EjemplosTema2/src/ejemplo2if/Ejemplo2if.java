package ejemplo2if;

public class Ejemplo2if {
	public static void main(String[] args) {
		Integer num1=3, num2=6, num3=1;
		if((num1>num2) && (num1>num3)) {
			System.out.println("El numero mayor es num1: "+num1);
		}else if((num2>num1) && (num2>num3)){
			System.out.println("El numero mayor es num2: "+num2);
		}else {
			System.out.println("El numero mayor es num3: "+num3);
		}
		
	}

}
 