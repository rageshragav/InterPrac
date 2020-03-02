package java_Learning_Latest;

public class NumberOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddnum = 0;
		int evennum = 0;
		int num = 1234;
		while(num>0) {
			int res = num/10;
			if(res/2==0) {
				evennum++;
			}else {
				oddnum++;
			}
			num=num/10;
		}
		System.out.println(oddnum);

		System.out.println(evennum);
	}

}
