import img2bin.*;
/**
 * 
 * 测试文件
 * 
 * */
public class Entry {
public static void main(String[] args) {
/*	byte[] a = gray2bin.img2bin("C:\\Users\\lenovo\\Desktop\\博士第一篇论文\\image\\gray_flower.jpg");
	for(int i =0 ; i<a.length;i++) {
			System.out.println(a[i]);	
	}
	//byte[] bo = {0,123,5,89,44};
	//Exist2text ex = new Exist2text(bo);
	Exist2text ex = new Exist2text(a);
	if(ex!=null) {
		System.out.println("执行完毕！！");
	}else {
		System.out.println("执行失败！！");
	}*/
	LSB lsb = new LSB();
	System.out.println(lsb.leastBitChange0());
	
	
}
}
