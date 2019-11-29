//package operators;
package training;
public class Operators {

	public static void main(String[] args) {
		int a=20;
		int b=8;
		int c=15;
		/*System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);*/
	
		/*****Asignment operator****/
		a+=4;//a=a+4  
		b-=4;//b=b-4 
		System.out.println(a);  
		System.out.println(b);
		
		
		/********logical bitwise********/
		System.out.println(a<b&&a<c);//false && true = false  (5<8)&&(5<15)
		System.out.println(b<c&a<c);//false & true = false 
	
		/******shiftleft********/
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
	
	/*******Shiftright**********/
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
/***********unary operator*******/
		
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x);
		System.out.println(x--);//12 (11)
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a++ + ++a);//10+12=22 
		System.out.println(b++);
		System.out.println(b++ + b++);//10+11=21  
		
		System.out.println(--x);//10 
		
	
	}

}
