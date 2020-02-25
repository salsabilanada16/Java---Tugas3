/*
* Salsabila Nada Adzani - 193040050
*/

public class Program3_1
{
	int a, b, c;
	double x;
	
	public void run()
	{
		a = 3;
		b = 2;
		c = 2;
		
		System.out.println("Rumus Persamaan ax^2 + bx - c menghasilkan rumus");
		System.out.printf("----------- \n");
		System.out.printf("x = -b / 2a \n");
		System.out.printf("----------- \n");
		System.out.printf("Jika 3x2 + 2x - 2 \n");
		System.out.printf("Maka nilai a = %d \n", a);
		System.out.printf("Maka nilai b = %d \n", b);
		System.out.printf("Maka nilai c = %d \n", c);
		
		x = (-b / (2 * a));
		System.out.printf("Maka hasil dari rumus x = -b / 2a adalah \n x = %f \n", x);
	}
}