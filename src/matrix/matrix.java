package matrix;

public class matrix {

	// 测试     行列相等
	public int[][] matrixMUL() {
		int[][] result = new int[2][2];
		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 5, 6 }, { 7, 8 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
	// 行列相等
	public int[][] matrixMUL(int [][] a, int [][] b) {
		int index = a[0].length;
		int[][] result = new int[index][index];
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < index; j++) {
				for (int k = 0; k < 2; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
	// 行列不相等
	public int[][] matrixMUL1(int [][] a, int [][] b) {
		int index_i = a.length;
		int index_j = b[0].length;
		if(a[0].length!=b.length) {
			System.out.println("行列式不相等，不能做乘法！！");
			return null;
		}
		int[][] result = new int[index_i][index_j];
		for (int i = 0; i < index_i; i++) {
			for (int j = 0; j < index_j; j++) {
				for (int k = 0; k < 2; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
//  打印数组函数，标准化输出
	public void printMatrix(int[][] a ) {
		for(int i =0;i<a.length;i++) {
			for(int j = 0; j <a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {

		int[][] a = { { 1, 2 }, { 3, 4 } };
		//int[][] b = { { 5}, {6}};
		int[][] b = { { 5,6}};
		int [][] result ;
		matrix m = new matrix();
		result = m.matrixMUL1(a, b);
	    m.printMatrix(result);
		//System.out.println(b[0].length); //2
		//System.out.println(b.length);    // 3
		
	}
}
