package enshu4;

import java.util.HashMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

	public FileInput(String fname) {
		FileReader fr;
		try {
			fr = new FileReader(fname);
		} catch(FileNotFoundException e) {
			System.out.println("Can not open " + fname);
			return;
		}
		
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while((line = br.readLine()) != null) {
				System.out.print(line);
			}
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FileInput("input.txt");
		
	}

}
