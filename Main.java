// Main.java class

class Main
{
	public static void main(String args[])
	{
		UserInput ui = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();
		
		functions.oddEven(ui.arrayInput());
		int i = functions.minDiff(ui.arrayInput());
		System.out.println("Index of minimum distance = "+i);
	}
}