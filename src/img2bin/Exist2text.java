package img2bin;
/**
 * 把二进制流写入到文件当中，但是在保存到txt时，出现乱码，
 * 需要hexedior软件才可以看见。
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
		File file = new File("E:\\TestData" + File.separator + "test.bin");  // 存储到磁盘中
		byte[] bytes = b;
		try {
			OutputStream out = new FileOutputStream(file);
			for (int i = 0; i < b.length; i++) {   // 二进制流写入到文件当中
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
