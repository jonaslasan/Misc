public class Astroid {
	public static void main (String[] args) {
		
		double a = 20;	
		double epsilon = 0.3;
		
		// Optional parameters: a, ε
		if (args.length > 0)
		{
			a = Double.parseDouble(args[0]);
		}
		if (args.length > 1)
		{
			epsilon = Double.parseDouble(args[1]);
		}
		
		int width = (int)(a * 2);
		int height = (int)(a * 2);
		
		for (int y = height/2; y > (-height/2); y--) {
			for (int x = (-width/2); x < width/2; x++) {
				// Check if x^(2/3) + y^(2/3) = a
				double left = Math.pow(Math.abs(x), (double)2/3) + Math.pow(Math.abs(y), (double)2/3);
				double right = Math.pow(a, (double)2/3);
				
				// Check if it fits inside the current square
				double delta = Math.abs(left - right);
				if (delta < epsilon) {
					System.out.print("*");
				}
				else {
					if (y == 0) {
						System.out.print("-");	
						continue;
					}
					if (x == 0) {
						System.out.print("|");
						continue;
					}
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}