

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
 * 
 * 
 * 
 * */
public class gray2bin {
/*public void inputImage(String path) {
	File img =new File(path);   //��ȡ�ļ�
	
}*/
public static byte [] img2bin(String path){   
	File img = new File(path);
	BufferedImage bi;
	try {
		bi = ImageIO.read(img);
		ByteArrayOutputStream baos =new ByteArrayOutputStream();
		ImageIO.write(bi, "jpg", baos);
		byte[] bytes = baos.toByteArray();
		return bytes;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

}
