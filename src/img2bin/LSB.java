package img2bin;

/**
 * LSB算法描述
 * 
 * 二进制代码最后一位置0，进行LSB替换 原数组 1,0,1,4,6 插入元素 0
 */
public class LSB {
	// 第1个构造函数
	// 单个数组的替换
	public byte[] leastBitChange0() { // 单个数组的替换
		boolean flag = false;
		byte[] originBin = { 1, 0, 1, 4, 6 };
		byte insertBin = 126;
		if (flag != true) {

			int i = originBin.length;
			originBin[i - 1] = insertBin;
			flag = true;
		}
		return originBin;
	}
	
	// 第2个构造函数
	// 单个数组的替换，进行传参  
	public byte[] leastBitChange0(byte[] originBin, byte insertBin) {
		boolean flag = false;
		// byte[] originBin = { 1, 0, 1, 4, 6 };
		// byte insertBin = 126;
		if (flag != true) {

			int i = originBin.length;
			originBin[i - 1] = insertBin;
			flag = true;
		}
		return originBin;
	}
// 测试方法
	/*public static void main(String[] args) {
		LSB lsb = new LSB();
		byte[] originBin = { 1, 0, 1, 4, 6 };
		byte insertBin = 126;
		byte[] testBin = lsb.leastBitChange0(originBin, insertBin);
		for (int j = 0; j < testBin.length; j++) {
			System.out.println(testBin[j]);
		}
	}*/
}
