		/// Bernard Adarkwah and Chiamaka Nwolisa
		/// Calculator assignment code in JAVA

		import java.util.Scanner;
		public class Calculator{

			public static void main(String [] args){

				Scanner inp = new Scanner(System.in);

				System.out.println("Enter first number");
				double one = inp.nextDouble();
				double two;


				System.out.println("Enter The operator ?");
				System.out.println("1>>>ADD");
				System.out.println("2>>>MULTIPLY");
				System.out.println("3>>>SUBTRACT");
				System.out.println("4>>>DIVIDE");
				System.out.println("5>>>MODULO");
				System.out.println("6>>>EXPONENT");
				System.out.println("7>>>SQUAREROOT");
				System.out.println("8>>>AVERAGE");


				int sign = inp.nextInt();
				while(sign > 8 || sign < 1){
					System.out.print("Please reenter operator number 1-8: ");
					sign = inp.nextInt();
				}

				if (sign == 7){
					squareRoot(one);
					
				}

				else{

					System.out.println("Enter Second number");
					two = inp.nextDouble();

					if (sign == 1){ 
						add(one , two );
					}else if (sign == 3){
					 subtract(one , two );
					}else if (sign == 2){ 
						multiply(one , two);
					}else if (sign == 4){
					 divide(one , two );
					}else if (sign == 5){ 
						modulo(one , two );
					}else if (sign == 6){
					 exponent(one , two );
					}else if (sign == 8){ 
						int num1 = (int) one;
						int num2 = (int) two;
						average(num1 , num2 );
					}else{ 
						System.out.println("Check the operation and try again");
					}
				}
			}

			
			public static void add(double a, double b){

				System.out.println("The sum of " + a + " & " + b + " is :" + (a+b));
			}


			public static void subtract(double a, double b){

				System.out.println("The difference between " + a + " & " + b + " is :" +(a-b));
			}

			public static void modulo(double a, double b){

				System.out.println("The modulo of " + a + " & " + b + " is :" +(a%b));
			}


			public static void multiply(double a, double b){

				System.out.println("The product of " + a + " & " + b + " is :" +(a*b));
			}


			public static void divide(double a, double b){
				if(b == 0){
					System.out.println("Maths Error");
				}
				else {

					System.out.println("The division of " + a + " & " + b + " is :" +(a/b));
				}
			}
			


			public static void exponent(double one , double two){
				double result = 1;
				for(int i = 0 ; i< two ; i++){
					result *= one;
				}
				System.out.println ("The exponent of the numbers is " + result);
			}

			public static void squareRoot(double number){
				boolean isAPositiveNumber = true;
	        	double digit;
	 
	        if(number==0)
	        {
	            System.out.println("Square root of "+number+" = "+0);
	        }
	 
	        else if(number<0)
	        {
	            number=-number;
	            isAPositiveNumber = false;
	        }
	 
	        double squareRoot = number/2;
	        do
	        {
	            digit=squareRoot;
	            squareRoot = (digit + (number/digit))/2;
	        }
	        while((digit-squareRoot)!=0);
	 
	        if(isAPositiveNumber)
	        {
	            System.out.println("Square roots of "+number+" are ");
	            System.out.println("+"+ squareRoot);
	            System.out.println("-"+ squareRoot);
	        }
	        else
	        {
	            System.out.println("Square roots of -"+number+" are ");
	            System.out.println("+"+ squareRoot);
	            System.out.println("-"+ squareRoot);
	        }
			}

			public static void average(int a, int b){
				System.out.println("The average of the numbers is " + ((float)a+(float)(b-a)/2));
			}


		}