package lab.java.core;
import java.io.*; 
public class RandomAccessFileEx { 
	public static void main(String[] args) { 
		RandomAccessFile ra = null; 
		try { 
			ra = new RandomAccessFile("c:/test/random.txt" , "rw" ); 
			String receive = " hello" ; 
			ra.seek(ra.length()); //0 offset
			ra.write(receive.getBytes()); 
			byte[] buf = new byte[(int) ra.length()]; 
			ra.seek(0); 
			ra.read(buf); 
			System.out.print(" ó�� ���� ���� : " ); 
			System.out.println(new String(buf)); 
			ra.seek(0);
			receive = "�ȳ��ϼ���?" ;
			ra.write(receive.getBytes()); 
			ra.seek(0);
			ra.read(buf); 
			System.out.print(" �ٽ� ���� ���� : " ); 
			System.out.println(new String(buf)); 
		} catch (IOException ioe) { 
			ioe.printStackTrace(); 
		} finally { 
			try { 
				if (ra != null) ra.close(); 
			} catch (IOException ioe) { 
				ioe.printStackTrace(); 
			} 
		} 
	} 
}