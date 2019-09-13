package img2bin;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

/**
 * 这个方法是要把灰度图像转换成二进制图像
 * @author lenovo 
 * @param path 文件路径
 * @return 是一个二进制数组 字符流
 * 
 * 
 * */
public class gray2bin {
/*public void inputImage(String path) {
	File img =new File(path);   //读取文件
	
}*/
public static byte [] img2bin(String path){   
	File img = new File(path);  // 读取文件
	BufferedImage bi;  //将图片读到缓冲区
	try {
		bi = ImageIO.read(img);  //转变成IO流
		ByteArrayOutputStream baos =new ByteArrayOutputStream();   // 声明二进制数组输出流，用作存储
		ImageIO.write(bi, "jpg", baos);  // 将缓冲区的IO流，输出到二进制流当中国
		byte[] bytes = baos.toByteArray(); // 格式化数组
		baos.close();   
		return bytes;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

}
