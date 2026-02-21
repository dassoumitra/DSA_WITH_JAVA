/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class MaxElement
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {390,6,8,9,77};
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
		    if(max<arr[i]){
		        max=arr[i];
		    }
		    
		}
		System.out.println(max);
	}
}
