package img2bin;
/**
 * �Ѷ�������д�뵽�ļ����У������ڱ��浽txtʱ���������룬
 * ��Ҫhexedior����ſ��Կ�����
 * 
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exist2text {
	public Exist2text(byte[] b) {
		
		// TODO Auto-generated constructor stub
		File file = new File("E:\\TestData" + File.separator + "test.bin");  // �洢��������
		byte[] bytes = b;
		try {
			OutputStream out = new FileOutputStream(file);
			for (int i = 0; i < b.length; i++) {   // ��������д�뵽�ļ�����
				out.write(bytes[i]);
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
