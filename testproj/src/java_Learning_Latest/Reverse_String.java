package java_Learning_Latest;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234";
		String text = "ragesh";
		StringBuffer sb = new StringBuffer(str);
		//sb.append(str);
		System.out.println(sb.reverse());
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1.reverse());
		
	//	for(int i = s.length()-1;i>=0;i--)
		for(int i=text.length()-1;i>=0;i--) {
			  
			System.out.println(text.charAt(i));
			
		}
		
	}

}
