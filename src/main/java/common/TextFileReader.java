package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

	public static void main(String[] args) throws IOException 
	{
		String fileName="C:\\Users\\vidya\\eclipse-workspace\\selenium-automation-framework\\src\\main\\resources\\LoginData.csv";
		File file = new File(fileName);			//get the file metadata
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		String loginData[][] = new String [3][2];
		int i = 0;
		while((line = br.readLine()) != null) {		//if line is not null then return True
			String data[] = line.split(",");
			loginData[i]=data;
			i++;
		}
			System.out.println(loginData);
		}
	}


