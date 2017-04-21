package Check;

import java.io.FileWriter;

public class ChenFaBiao {

	public void Print() throws Exception {
		FileWriter fw = new FileWriter("乘法表.txt");
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append(j + "*" + i + "=" + i * j + "  ");
				System.out.print(j + "*" + i + "=" + i * j + "  ");
			}
			sb.append("\r\n");
			System.out.println();
		}
		String str = sb.toString();
		fw.write(str);
		fw.close();

	}

}
