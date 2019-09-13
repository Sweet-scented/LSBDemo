package img2bin;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

/**
 * ���������Ҫ�ѻҶ�ͼ��ת���ɶ�����ͼ��
 * @author lenovo 
 * @param path �ļ�·��
 * @return ��һ������������ �ַ���
 * 
 * 
 * */
public class gray2bin {
/*public void inputImage(String path) {
	File img =new File(path);   //��ȡ�ļ�
	
}*/
public static byte [] img2bin(String path){   
	File img = new File(path);  // ��ȡ�ļ�
	BufferedImage bi;  //��ͼƬ����������
	try {
		bi = ImageIO.read(img);  //ת���IO��
		ByteArrayOutputStream baos =new ByteArrayOutputStream();   // ��������������������������洢
		ImageIO.write(bi, "jpg", baos);  // ����������IO��������������������й�
		byte[] bytes = baos.toByteArray(); // ��ʽ������
		baos.close();   
		return bytes;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

}
