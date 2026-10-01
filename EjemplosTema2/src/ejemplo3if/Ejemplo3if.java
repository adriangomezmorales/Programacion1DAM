package ejemplo3if;

public class Ejemplo3if {
	public static void main(String[] args) {
		Integer a=2000, mes;
		Integer dias = null;		
		
		for(mes=1;mes<=12;mes++) {
			if( mes==1 || mes==3|| mes==5||mes==7||mes==8 || mes==10||mes==12) {
				dias = 31;
			}else if(mes==2) {
				if(a%4==00) {
					dias=29;
				}
			}else {
				dias=30;
			}
			System.out.println("El mes "+mes+" del año "+a+" tiene "+dias+" días");

		}
		System.out.println("fin");
		}
		
		
	}


 