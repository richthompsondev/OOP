package eXcript;

public class LambdaExpressions {

	interface Num{
		double getValue();
	}
	
	interface ValorNumerico{
		boolean teste(int n);
	}
	
	interface ValorNumerico2{
		boolean teste(int n, int n2);
	}
	
	public static void main(String[] args) {
		//Implementação da classe anônima Runnable
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Estudando a expressão lambda 1");
			}
		};
		
		Runnable r2 = () -> System.out.println("Estudando a expressão lambda 2");
		
		r1.run();
		r2.run();
		
		//----------------------------------------------------------------------//
		
		Num n;
		n = () -> 333.11;
		
		System.out.println(n.getValue());
		
		Num n2 = () -> Math.random() * 100;
		System.out.println(n2.getValue());
		
		ValorNumerico isPar = (int i) -> (i % 2) == 0;
		System.out.println(isPar.teste(89));
		System.out.println(isPar.teste(90) + "\n");
		
		ValorNumerico2 isDiv = (x, y) -> (x % y) == 0;
		System.out.println(isDiv.teste(10, 2));
		System.out.println(isDiv.teste(10, 3) + "\n");
		
		ValorNumerico2 blocoLambda = (int x, int y) -> {
			int w = x + y;
			return w > 100;
		};
		System.out.println(blocoLambda.teste(50, 51));
	}

}
