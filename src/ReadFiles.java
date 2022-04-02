import java.io.FileInputStream;

import java.io.FileOutputStream;

public class ReadFiles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path1 = "C://Test//input.txt";
		String path2 = "C://Test//output.txt";
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String b;
		
		while((b=br.readLine()) != -1) {
			 
		}
		
		
		int a;
		while ((a = fis.read()) != -1) {
			fos.write(a);
		}
		
		
		
		
		
		
	}

}
