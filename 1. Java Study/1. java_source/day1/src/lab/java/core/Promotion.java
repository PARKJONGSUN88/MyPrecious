package lab.java.core;

public class Promotion {

	public static void main(String[] args) {
		short num1 = 32767;
		int num2 = num1; //�� Ȯ�� promotion
		System.out.println(num1);
		System.out.println(num2);
		
	    float f = 5;
	    //num2 = f; 
	    //�ڵ� ������ ���� �ȵ�, ������ �� ��ȯ�� �ʿ�
	    //�� ��Ҵ� casting
	    num2 =(int)f;
	    System.out.println(f);
		System.out.println(num2);
		
		//char�� short������ casting
		//byte�� char������ casting
		 char ch = (char)num1;
		 System.out.println(ch);
		 ch = 97;
		 short num3 = (short)ch;
		 System.out.println(ch); //���� ���
		 System.out.println(num3); //���ڿ� ���ε� ���ڰ� ���
		 
        //boolean�� ���� �Ǵ� �Ǽ��� ����ȯ �Ұ�(promotion, casting �Ұ�)
		 boolean b = false;
		 double d =(double)b;
		 
		 
	}

}




