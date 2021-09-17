package LamdaExpression;

@FunctionalInterface
interface MathFunction {
	int calculate(int i, int j);

	static void display(String calculate, int i, int j, MathFunction ref) {
		System.out.println(calculate + " " + ref.calculate(i, j));
	}
}

public class MathOperation {
	public static void main(String[] args){
		MathFunction add=(a,b)-> a+b;
		MathFunction multiply=(a,b)-> a*b;
		MathFunction divide=(a,b)-> a/b;
		
		MathFunction.display("addition", 6 ,3 ,add);
		MathFunction.display("Multiply", 6 ,3 ,multiply);
		MathFunction.display("divide", 6 ,3 ,divide);
	}
	
	
}