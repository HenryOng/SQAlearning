package modelCallers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
	public static void main(String args[]){
		MyFileReader fileReader = new MyFileReader();
		fileReader.readFile("/Users/prashantnagar/SQAClass/input/csvTest.csv");
	}
	
	private void readFile(String filePath){
		BufferedReader inputReader = null;

		try {
			File myFile = new File(filePath);
			//myFile.exists();
			//myFile.getName()
			
			FileReader fr = new FileReader(myFile);
			inputReader = new BufferedReader(fr);
			List<String> fileList = new ArrayList<String>();
			while(true){
				String line = inputReader.readLine();
				if(line == null){
					break;
				}else{
					fileList.add(line);
					String[] lineArr = line.split(",");
					System.out.println("line starts");
					for(String term : lineArr){
						System.out.println("term ="+term);
					}
					System.out.println("line ends");
				}
			}
			
			System.out.println("Number of rows in my file are : "+fileList.size());
			
			File writeFile = new File("/Users/prashantnagar/SQAClass/input/csvOutput.txt");
			FileWriter fw = new FileWriter(writeFile); 
			BufferedWriter writer = new BufferedWriter(fw);
			for(String line : fileList){
				writer.write(line);
				writer.write("\n");
			}			
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(inputReader != null){
				try{
					inputReader.close();
				}catch(Exception e){
				}
			}
		}
	}
}
