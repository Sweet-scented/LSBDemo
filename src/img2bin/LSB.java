package img2bin;

/**
 * LSB�㷨����
 * 
 * �����ƴ������һλ��0������LSB�滻 ԭ���� 1,0,1,4,6 ����Ԫ�� 0
 */
public class LSB {
	// ��1�����캯��
	// ����������滻
	public byte[] leastBitChange0() { // ����������滻
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
	
	// ��2�����캯��
	// ����������滻�����д���  
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
// ���Է���
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
