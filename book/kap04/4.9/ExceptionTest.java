public class ExceptionTest{
	public static void main(String[] args){
		int i;
		int[] zahlen = new int[100];
		System.out.println();
		
		try{
			for( i = 0; i<101; i++ ){
				System.out.println("i hat den Wert " + i + "\n");
				zahlen[i] = i;
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e)	{
			System.err.println("#######################################");
			System.err.println("Illegaler Zugriff: " + e.getMessage());
			e.printStackTrace();
			System.err.println(e);
			System.err.println("#######################################");
		}
	}
}